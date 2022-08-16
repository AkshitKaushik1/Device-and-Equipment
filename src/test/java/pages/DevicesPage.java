package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import util.Log;

public class DevicesPage extends BasePage {

	public DevicesPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	/**
	    * Variables
	    */
	//variables
	Actions a = new Actions(driver);
	 /**
	    Web Elements
	    */
	
	By adddevices    =By.xpath("//*[@id=\"undefined\"]"); 
	By searchdevices =By.xpath("//*[@id=\"searchField\"]/input");
	
	/**
	    * Page Methods
	    */
	 public AddDevicesPage addDevices () {
		 Log.info("Navigating to Add Devices");
		 try {
			  wait.until(ExpectedConditions.elementToBeClickable(adddevices)).click();
			 // click(adddevices);
			  System.out.println("Add Devices Button is clickable");
		 }
	  
			  catch(TimeoutException e) {
		            System.out.println("Add Devices Button isn't clickable");
		         }
		 return new AddDevicesPage(driver);
	 }
		 public DevicesPage verifydevices(String Devicesname) throws InterruptedException {
			   Log.info("Verify Devices with details");
			   writeText(searchdevices, Devicesname);
			   Thread.sleep(2000);
			   a.sendKeys(Keys.ENTER).build().perform();
			return this;
			
	 }
	
	 }

