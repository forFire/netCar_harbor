package netCar.dict;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.netCar.domain.CompanyInfoEntity;
import org.netCar.service.CompanyInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration   
({"/spring-application.xml"}) //加载配置文件  
public class CompanyInfoTest {
	
	@Autowired
	CompanyInfoService companyInfoService;
	@Test
	public void testSave() {
		CompanyInfoEntity companyInfo = new CompanyInfoEntity();
		companyInfo.setAddress(1);
		companyInfo.setBusinessScope("scsdf");
//		companyInfo.setCompanyName("companyName");
		companyInfoService.save(companyInfo);
	}

	
}
