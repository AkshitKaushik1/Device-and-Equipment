package tests;

import static util.ExtentTestManager.startTest;

import java.lang.reflect.Method;

import org.testng.annotations.Test;


public class PipelineTests extends BaseTest{
	@Test(priority = 0, description = "Create a Pipeline")
    public void CreatePipeline(Method method) throws InterruptedException {
        //ExtentReports Description
        startTest(method.getName(), "Create a Pipeline");
        loginPage
        	.openClarityApp()
        	.logintoClarity("shaniaenergies", "1111");
       Thread.sleep(30000);
        homePage
        	.goToAssets();
        Thread.sleep(20000);
        assetPage
        	.goToPipeline();
       Thread.sleep(5000);
       assetPage
   			.goToPipeline();
       Thread.sleep(5000);
        pipelinePage
        	.addPipeline();
       Thread.sleep(5000);
       addpipelinePage
       		.createPipeline();
        
    }
}
