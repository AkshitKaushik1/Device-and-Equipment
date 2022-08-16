package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import util.Log;

public class AssetsPage extends BasePage {

	public AssetsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	

	/**
     * Web Elements
     */
	By pipeline			=By.xpath("//*[@id=\"id_assets-list_piplines\"]");
    By Devices          =By.xpath("//*[@id=\"id_assets-list_devices\"]");
    By Equipment        =By.xpath("//*[@id=\"id_assets-list_equipment\"]");
  //Click on Pipeline
    public PipelinePage goToPipeline() {
        Log.info("Navigating to Pipeline");
        
        try {
            wait.until(ExpectedConditions.elementToBeClickable(pipeline)).click();
            System.out.println("Pipeline Tab is clickable");
          }
     catch(TimeoutException e) {
            System.out.println("Pipeline Tab isn't clickable");
         }
        
        //click(pipeline);
        return new PipelinePage(driver);

    }
    
    public DevicesPage goToDevices () {
        Log.info("Navigating to Devices");
        
        try {
            wait.until(ExpectedConditions.elementToBeClickable (Devices)).click();
            System.out.println("Devices Tab is clickable");
          }
     catch(TimeoutException e) {
            System.out.println("Devices Tab isn't clickable");
         }
        
        //click(pipeline);
        return new DevicesPage(driver);
    }
    public EquipmentPage goToEquipment () {
        Log.info("Navigating to Equipment");
        
        try {
            wait.until(ExpectedConditions.elementToBeClickable (Equipment)).click();
            System.out.println("Equipment Tab is clickable");
          }
     catch(TimeoutException e) {
            System.out.println("Devices Tab isn't clickable");
         }
        
        //click(pipeline);
        return new EquipmentPage(driver);
    }
    
}

