package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import util.Log;

public class PipelinePage extends BasePage{

	public PipelinePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	 /**
	    * Variables
	    */
	//variables
	
	 /**
	    * Web Elements
	    */
	   By pipeline			=By.xpath("//*[@id=\"id_assets-list_piplines\"]");
	   By addpipeline		=By.xpath("//*[@id=\"undefined\"]");
	
	
	
	
	 /**
	    * Page Methods
	    */
	 	   
	   //Click on Add Pipeline
	   public AddPipelinePage addPipeline() {
	       Log.info("Navigating to Add Pipeline");
	       try {
	            wait.until(ExpectedConditions.elementToBeClickable(addpipeline)).click();
	            System.out.println("Add Pipeline Button is clickable");
	          }
	     catch(TimeoutException e) {
	            System.out.println("Add Pipeline Button isn't clickable");
	         }
	       
	      // click(addpipeline);
	       return new AddPipelinePage(driver);
	   }
	
}
