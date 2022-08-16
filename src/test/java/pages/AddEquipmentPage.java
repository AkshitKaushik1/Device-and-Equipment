package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import util.Log;

public class AddEquipmentPage extends BasePage {

	public AddEquipmentPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	int waittime = 8000;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	/**
	    * Web Elements
	    */
	
	By addname         = By.xpath("//*[@id=\"eqname\"]/input");
	By Status          = By.xpath("//*[@id=\"eqstatusValue\"]");
	By Activebutton    = By.xpath("/html/body/ion-popover/div[2]/div[2]/ion-select-popover/ion-list/ion-radio-group/ion-item[1]/ion-radio");
	By equipmenttype   = By.xpath("//*[@id=\"eqtypeValue\"]");
	By Voltmeter       = By.xpath("/html/body/ion-popover/div[2]/div[2]/ion-select-popover/ion-list/ion-radio-group/ion-item[2]/ion-radio");                                                                                                                                                                                                                                                                                                                                                                                                                                                         
	By partnumber      = By.xpath("//*[@id=\"eqpartNumberValue\"]/input");
	By manufacture     = By.xpath("//*[@id=\"eqmfgNumberValue\"]/input");
	By instance        = By.xpath("//*[@id=\"eqinstanceValue\"]/input");
	By serialnumber    = By.xpath("//*[@id=\"eqserialNumberValue\"]/input");
	By calibration     = By.xpath("//*[@id=\"eqcalibratedDateValue\"]");
	By duedate         = By.xpath("//*[@id=\"main-content\"]/app-assets/ion-content/ion-router-outlet/app-add-equipment/form/ion-row/ion-col[2]/ion-card/div[2]/ion-list/div[2]/div/ion-row[3]/ion-col[2]/ion-item");
	By mfgdate         = By.xpath("//*[@id=\"eqmfgdateValue\"]");
	By save            = By.xpath("//*[@id=\"id_add-equipment_save\"]");
	By submit          = By.xpath("//*[@id=\"id_add-equipment_submit\"]");
	By next            = By.xpath("//*[@id=\"nextBtn\"]");
	/**
	    * Page Methods
	 * @throws InterruptedException 
	    */
	
	 public EquipmentPage addequipment(String equipmentName) throws InterruptedException {
		 Log.info("Add Equipment with detail");
		 try { 
			   wait.until(ExpectedConditions.visibilityOfElementLocated(addname));
			   System.out.println("Equipmentname is located");
			   writeText(addname,equipmentName );
		    }
		 catch(TimeoutException e) {
			 
		 }
			 System.out.println("Equipment isn't clickable");
			 
			 Thread.sleep(5000);
		 	 click(Status);
		 	 Thread.sleep(6000);
		 	 click(Activebutton);
		 	 Thread.sleep(4000);
		 	 click(equipmenttype);
		 	 Thread.sleep(3000);
		 	 click(Voltmeter);
		 	 Thread.sleep(4000);
		 	 click(partnumber);
		 	 writeText(partnumber,"123");
		 	 Thread.sleep(4000);
		 	 click(manufacture);
		 	 writeText(manufacture,"abc");
		 	 Thread.sleep(4000);
		 	 click(serialnumber);
		 	 writeText(serialnumber,"1234567");
		 	 click(instance);
		 	 writeText(instance,"5432");
		 	 click(calibration);
		 	 writeText(calibration,"07082021");
		 	 Thread.sleep(4000);
		 	 click(duedate);
		 	 writeText(duedate,"29102021");
		 	 click(mfgdate);
		 	 writeText(mfgdate,"12052022");
			 Thread.sleep(5000);
			 click(save);
			 Thread.sleep(4000);
			 click(submit );
			 Thread.sleep(3000);
			 click(next);
			 
			return new EquipmentPage(driver);
		 }
	
}
