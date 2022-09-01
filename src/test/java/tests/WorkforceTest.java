package tests;

import static util.ExtentTestManager.startTest;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

public class WorkforceTest extends BaseTest {

	@Test(priority = 0, description = "Workforce")
    public void Workforce(Method method) throws InterruptedException {
	

		 startTest(method.getName(),"Workforce");
		 loginPage
		       .openClarityApp()
		       .logintoClarity("lehman100","2021");
		 Thread.sleep(7000);
		 homePage	
		       .goToworkforce();
		 workForcepage
		       .goToUploadOQRecords();
		 workForcepage
		       
		       .addOQFiles();
	}
}
