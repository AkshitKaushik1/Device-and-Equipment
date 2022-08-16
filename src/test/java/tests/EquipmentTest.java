package tests;

import static util.ExtentTestManager.startTest;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class EquipmentTest extends BaseTest {
	
	@Test(priority = 0, description = " Add Equipment")
    public void AddEquipment (Method method) throws InterruptedException {
		
		Faker faker = new Faker();
		String randomequipmentname =faker.lorem().characters(4);
		String equipmentName="Equipment"+ randomequipmentname;
		System.out.println(equipmentName);
		
		 startTest(method.getName()," Add Equipment");
		 loginPage
		       .openClarityApp()
		       .logintoClarity("lehman100","2021");
		 Thread.sleep(7000);
		 homePage
		       .goToAssets();
		 Thread.sleep(7000);
		 assetPage
		       .goToEquipment();
		 Thread.sleep(4000);
		  assetPage
		        .goToEquipment();
		  Thread.sleep(5000);
		  equipmentPage
		         .addEquipment();
		  addEquipment
		         .addequipment(equipmentName);
		  Thread.sleep(6000);
		  equipmentPage
                 .verifyequipment(equipmentName);	  
	}
		         

}
