package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import util.Log;

public class EquipmentPage extends BasePage {

	public EquipmentPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	Actions a = new Actions(driver);
	
	 /**
	    Web Elements
	    */
	
	By addequipment    = By.xpath("//*[@id=\"undefined\"]");
	By searchequipment = By.xpath("//*[@id=\"searchField\"]/input");
	
	
	/**
	    * Page Methods
	    */
	 public AddEquipmentPage addEquipment () {
		 Log.info("Navigating to Add Equipment");
		 try {
			  wait.until(ExpectedConditions.elementToBeClickable(addequipment)).click();
			 // click();
			  System.out.println("Add Equipment Button is clickable");
		 }
	  
			  catch(TimeoutException e) {
		            System.out.println("Add Equipment Button isn't clickable");
		         }
		 return new AddEquipmentPage (driver);
	
	 }
	 public EquipmentPage verifyequipment(String equipmentName) throws InterruptedException {
		   Log.info("Verify Pipeline with details");
		   writeText(searchequipment, equipmentName);
		   Thread.sleep(2000);
		   a.sendKeys(Keys.ENTER).build().perform();
		return this;
		   
	 }
}