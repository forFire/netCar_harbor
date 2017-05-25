package org.netCar.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.websocket.*;
import java.io.IOException;
import java.net.URI;
import java.nio.ByteBuffer;


@ClientEndpoint
public class WebsocketClientEndpoint {
    private static Logger LOG = LoggerFactory.getLogger(WebsocketClientEndpoint.class);

    Session userSession = null;
    private MessageHandler messageHandler;

    public WebsocketClientEndpoint(URI endpointURI, MessageHandler msgHandler) {
        try {
            this.messageHandler = msgHandler;
            WebSocketContainer container = ContainerProvider.getWebSocketContainer();
            container.connectToServer(this, endpointURI);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @OnOpen
    public void onOpen(Session userSession) {
        LOG.debug("opening websocket");
        this.userSession = userSession;
    }

    @OnClose
    public void onClose(Session userSession, CloseReason reason) {
        LOG.debug("closing websocket" + reason.toString());
        this.userSession = null;
    }

    @OnMessage
    public void onMessage(byte[] message) {
        if (this.messageHandler != null) {
            this.messageHandler.handleMessage(message);
        }
    }

    @OnMessage
    public void onMessage(PongMessage message) {
        LOG.debug("handle PongMessage");
    }

    public void sendMessage(String message) {
        this.userSession.getAsyncRemote().sendText(message);
    }

    public void sendPing(String message) {
    	LOG.info("send PingMessage start");
        try {
            if (userSession != null) {
                this.userSession.getAsyncRemote().sendPing(ByteBuffer.wrap(message.getBytes()));
                LOG.info("send PingMessage end");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static interface MessageHandler {

        void handleMessage(byte[] message);
    }
}
