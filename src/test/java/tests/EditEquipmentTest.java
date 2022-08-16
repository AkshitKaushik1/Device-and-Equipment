package tests;

import static util.ExtentTestManager.startTest;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

public class EditEquipmentTest extends BaseTest  {

	
	@Test(priority = 0, description = " Edit Equipment")

	 public void  EditEquipment (Method method) throws InterruptedException {
		 
		 
		 startTest(method.getName()," Edit Equipment");
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
		 editEquipmentPage
		      .editEquipmentPage();
		 
		     
	 }
}
