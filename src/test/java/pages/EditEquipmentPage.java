package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import util.Log;

public class EditEquipmentPage extends BasePage {

	public EditEquipmentPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	Actions a = new Actions(driver);
	/**
    Web Elements
    */
	
	By search                = By.xpath("//*[@id=\"searchField\"]/input");
	By arrow                 = By.xpath("//*[@id=\"main-content\"]/app-assets/ion-content/ion-router-outlet/app-asset-list/ion-row/ion-col[1]/ion-card/div/div[3]/ion-col[1]/button[2]");//*[@id="main-content"]/app-assets/ion-content/ion-router-outlet/app-asset-list/ion-row/ion-col[1]/ion-card/div/div[3]/ion-col[1]/button[2]
	By edit                  = By.id("id_assets-list_edit0");
    By partnumber            = By.xpath("//*[@id=\"eqpartNumberValue\"]/input");//*[@id="eqpartNumberValue"]/input
	By typevalue             = By.xpath("//*[@id=\"eqtypeValue\"]");//*[@id="eqtypeValue"]
    By guage                 = By.xpath("/html/body/ion-popover/ion-select-popover/ion-list/ion-radio-group/ion-item[4]");
    By MFG                   = By.xpath("//*[@id=\"eqmfgNumberValue\"]/input");
    By serialNumber          = By.xpath("//*[@id=\"eqserialNumberValue\"]/input");//*[@id="eqserialNumberValue"]/input
    By eqinstanceValue       = By.xpath("//*[@id=\"eqinstanceValue\"]/input");
    By eqcalibratedDateValue = By.xpath("//*[@id=\"eqcalibratedDateValue\"]");
    By Duedate               = By.xpath("//*[@id=\"main-content\"]/app-assets/ion-content/ion-router-outlet/app-add-equipment/form/ion-row/ion-col[2]/ion-card/div[2]/ion-list/div[2]/div/ion-row[3]/ion-col[2]/ion-item");
    By MFGDate               = By.xpath("//*[@id=\"eqmfgdateValue\"]");
    By savebutton            = By.xpath("//*[@id=\"id_add-equipment_save\"]");
    By submitbutton          = By.xpath("//*[@id=\"id_add-equipment_submit\"]");
    By nextbtn               = By.xpath("//*[@id=\"nextBtn\"]");
    /**
	    * Page Methods
	 * @throws InterruptedException 
	    */
	 public EditEquipmentPage  editEquipmentPage () throws InterruptedException {
	 Log.info("Search Equipment");
	 
	 Thread.sleep(5000);
	 writeText(search, "Equipmentj907 ");
	 Thread.sleep(20000);
	 a.sendKeys(Keys.ENTER).build().perform();
	 click(arrow);
	 Thread.sleep(5000);
	 click(arrow);
	 Thread.sleep(3000);
	 click(search);	 
	 Thread.sleep(5000);
	 a.sendKeys(Keys.ENTER).build().perform();
	 Thread.sleep(8000);
	 click(edit);
	 Thread.sleep(3000);
	 click(partnumber);
	 Thread.sleep(4000);
	 driver.findElement(partnumber).clear();
	 Thread.sleep(4000);
	 writeText(partnumber, "xyz");
	 Thread.sleep(4000);
	 click(typevalue);
	 Thread.sleep(3000);
	 click(guage);
	 Thread.sleep(4000);
	 driver.findElement(MFG).clear();
	 Thread.sleep(4000);
	 writeText(MFG, "qwerty");
	 Thread.sleep(4000);
	 driver.findElement(serialNumber).clear();
	 writeText(serialNumber, "09876543");
	 Thread.sleep(4000);
	 driver.findElement(eqinstanceValue).clear();
	 writeText(eqinstanceValue, "4444");
	 Thread.sleep(4000);
	 writeText(eqcalibratedDateValue,"03092021");
	 Thread.sleep(3000);
	 writeText(Duedate, "12042022");
	 Thread.sleep(3000);
	 writeText(MFGDate,"22072022");
	 Thread.sleep(3000);
	 click(savebutton);
	 Thread.sleep(4000);
	 click(submitbutton);
	 Thread.sleep(4000);
	 click(nextbtn);
	 
	return this ;
	 }
}
