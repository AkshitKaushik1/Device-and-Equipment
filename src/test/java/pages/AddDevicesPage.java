package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import util.Log;

public class AddDevicesPage extends BasePage {

	public AddDevicesPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	/**
	    * Variables
	    */
	//String deviceName = "Newdevice";
	
	
	
	int waittime = 8000;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	/**
	    * Web Elements
	    */
	 By Devicesname          = By.xpath("//*[@id=\"name\"]/input");
	 
	 By devicestatusValue    = By.xpath("//*[@id=\"devicestatusValue\"]");
	 By activestatus         = By.xpath("/html/body/ion-popover/ion-select-popover/ion-list/ion-radio-group/ion-item[1]");
	//*[@id="ion-overlay-1"]/div[2]/div[2]/ion-select-popover/ion-list/ion-radio-group/ion-item[1]/ion-radio
	 By devicestype          = By.xpath("//*[@id=\"rightCard\"]/div[2]/ion-list/div[2]/div[1]/ion-item");
	//*[@id="rightCard"]/div[2]/ion-list/div[2]/div[1]/ion-item
	 By selecttype           = By.xpath("/html/body/ion-popover/div[2]/div[2]/ion-select-popover/ion-list/ion-radio-group/ion-item[2]/ion-radio");
	 By partNumberValue      = By.xpath("//*[@id=\"partNumberValue\"]/input");
	 By mgfNumber            = By.xpath("/html/body/app-root/app-safepipe/ion-split-pane/ion-router-outlet/app-assets/ion-content/ion-router-outlet/app-add-devices/form/ion-row/ion-col[2]/ion-card/div[2]/ion-list/div[2]/div[1]/ion-row[1]/ion-col[2]/ion-item/div/ion-input/input");  //*[@id="mfgNumber"]/input
	 By serialNumber         = By.xpath("/html/body/app-root/app-safepipe/ion-split-pane/ion-router-outlet/app-assets/ion-content/ion-router-outlet/app-add-devices/form/ion-row/ion-col[2]/ion-card/div[2]/ion-list/div[2]/div[1]/ion-row[2]/ion-col[1]/ion-item/div/ion-input/input");  //*[@id="serialNumber"]/input
	 By size                 = By.xpath("//*[@id=\"instanceValue\"]/input");
	 By mfgDateValue         = By.xpath("//*[@id=\"mfgdateValue\"]");
	 By year                 = By.xpath("//*[@id=\"ion-overlay-3\"]/div[2]/div[2]/ion-picker-column/div/button[3]");
	 By Done                 = By.xpath("//*[@id=\"ion-overlay-3\"]/div[2]/div[1]/div[2]/button");
	 By latitude             = By.xpath("//*[@id=\"latitudeBeginValue\"]/input");
	 By longitude            = By.xpath("//*[@id=\"longitudeBeginValue\"]/input");//*[@id="latitudeBeginValue"]/input       //*[@id="ion-overlay-3"]/div[2]/div[2]/ion-select-popover/ion-list/ion-radio-group/ion-item[2]
	 By save                 = By.xpath("//*[@id=\"id_add-devices_save\"]");
	 By next                 = By.xpath("//*[@id=\"nextBtn\"]");
	 By Test1                = By.xpath("//*[@id=\"rightCard\"]/div[2]/ion-list/div[2]/ion-radio-group/div[5]");
	 By submit               = By.xpath("//*[@id=\"id_add-devices_submit\"]");
	 By Next                 = By.xpath("//*[@id=\"nextBtn\"]");
	 //*[@id="rightCard"]/div[2]/ion-list/div[2]/ion-radio-group/div[5]
	 
	 //*[@id="id_add-devices_save"]
	 
	/*[@id="ion-overlay-4"]/div[2]/div[2]/ion-select-popover/ion-list/ion-radio-group/ion-item[2]/ion-radio
	//*[@id="mfgNumber"]/input
	//*[@id="ion-overlay-3"]/div[2]/div[2]/ion-select-popover/ion-list/ion-radio-group/ion-item[2]/ion-radio
	//*[@id="ion-overlay-3"]/div[2]/div[2]/ion-select-popover/ion-list/ion-radio-group/ion-item[2]
		
	//*[@id="ion-overlay-3"]/div[2]/div[2]/ion-select-popover/ion-list/ion-radio-group/ion-item[2]/ion-radio
	//*[@id="ion-overlay-3"]/div[2]/div[2]/ion-select-popover/ion-list/ion-radio-group/ion-item[2]/ion-radio
	 
	 
	 
	 /**
	    * Page Methods
	 * @throws InterruptedException 
	    */
	 public DevicesPage createDevices(String devicesName) throws InterruptedException {
		 Log.info("Create Devices with detail");
		 try { 
			   wait.until(ExpectedConditions.visibilityOfElementLocated(Devicesname));
			   System.out.println("Devicesname is located");
			   writeText(Devicesname,devicesName );
		    }
		 catch(TimeoutException e) {
			 System.out.println("Devices isn't clickable");
		 }
		 	
	              Thread.sleep(waittime);
	 
	// click(Devicesname);
	 
	 //
	              //Thread.sleep(60);
	              Thread.sleep(10000);
	              click(devicestatusValue);
	              Thread.sleep(10000);
	              click(activestatus);
	              Thread.sleep(8000);
	              click(devicestype);
	              Thread.sleep(8000);
	              click(selecttype);
	              
	              Thread.sleep(5000);
	              click(partNumberValue);
	              writeText(partNumberValue, "1234");
	              Thread.sleep(4000);
	              click(mgfNumber);
	              writeText(mgfNumber,"abc");
	              Thread.sleep(3000);
	              click(serialNumber);
	              writeText(serialNumber,"1234");
	              Thread.sleep(4000);
	              click(size);
	              writeText(size,"20");
	              Thread.sleep(3000);
	              click(mfgDateValue);
	              click(year);
	              click(Done);
	              Thread.sleep(4000);
	              
	              WebElement scroll = driver.findElement(By.xpath("//*[@id=\"latitudeBeginValue\"]/input")); 
		            System.out.println("lable is detected");
		            ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", scroll);
	              
		           click(latitude);
		           writeText(latitude,"60");
		           
		           Thread.sleep(4000);
		           click(longitude);
		           writeText(longitude,"30");
		           Thread.sleep(4000);
		           click(save);
		           Thread.sleep(3000);
		           click(next);
	               click(Test1);   
	               Thread.sleep(3000);
	               click(submit);
	               click(Next);
	               
	               
	 
	              
	              
	              
	    
	 return new DevicesPage(driver);
	
	 }
	
}
