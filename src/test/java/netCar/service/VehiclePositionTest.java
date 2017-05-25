package netCar.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.netCar.service.VehiclepositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by ffd on 2017/4/20.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
        ({"/spring-application.xml"}) //加载配置文件
public class VehiclePositionTest {
    @Autowired
    private VehiclepositionService vehiclepositionService;

    @Test
    public void testAdd(){
        for (int id = 3;id<300;id++){
            //vehiclepositionService.operationPostion(id);
        }
    }
}
