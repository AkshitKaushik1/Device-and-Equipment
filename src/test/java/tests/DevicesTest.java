package tests;

import static util.ExtentTestManager.startTest;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class DevicesTest extends BaseTest {
         
	@Test(priority = 0, description = "Create a Devices")
    public void CreateDevices(Method method) throws InterruptedException {
		
		Faker faker = new Faker();
		String randomdevicesname=faker.lorem().characters(4);
		String devicesName="Devices"+randomdevicesname;
		System.out.println(devicesName);
		
		 startTest(method.getName(),"Create a Devices");
		 loginPage
		       .openClarityApp()
		       .logintoClarity("lehman100","2021");
		 Thread.sleep(7000);
		 homePage
		       .goToAssets();
		 Thread.sleep(7000);
		 assetPage
		        .goToDevices();
		 Thread.sleep(6000);
		 assetPage
	        .goToDevices();
		 Thread.sleep(7000);
		 devicesPage
		        .addDevices();
		 Thread.sleep(5000);
		 addDevices
		         .createDevices(devicesName);
		 Thread.sleep(8000);
		 devicesPage
		         .verifydevices(devicesName);
		 
		      
		        
		 
		       
		       
		       
		 
		         
		
		
	}
}
