package tests;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import java.time.Duration;

import pages.AddDevicesPage;
import pages.AddEquipmentPage;
import pages.AddPipelinePage;
import pages.AssetsPage;
import pages.DevicesPage;
import pages.EditEquipmentPage;
import pages.EquipmentPage;
import pages.HomePage;
import pages.LoginPage;
import pages.PipelinePage;
import util.Log;

public class BaseTest {
    public WebDriver driver;
    public LoginPage  loginPage;
    public HomePage	homePage;
    public AssetsPage assetPage; 
    public PipelinePage	pipelinePage;
    public DevicesPage devicesPage;
    public AddDevicesPage addDevices;
    public EquipmentPage equipmentPage;
    public AddEquipmentPage addEquipment;
    public AddPipelinePage addpipelinePage;
    public EditEquipmentPage editEquipmentPage ;
    public WebDriverWait wait;
    public WebDriver getDriver() {
        return driver;
    }
    @BeforeClass
    public void classLevelSetup() {
        Log.info("Tests is starting!");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\akshi\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeOptions option=new ChromeOptions();
        option.setPageLoadStrategy(PageLoadStrategy.NONE);
        option.addArguments("--disable-notifications");
        driver = new ChromeDriver(option);
        driver.manage().window().maximize();
        
    }
    @BeforeMethod
    public void methodLevelSetup() {
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        assetPage = new AssetsPage(driver);
        pipelinePage = new PipelinePage(driver);
        addpipelinePage = new AddPipelinePage(driver);
        devicesPage = new DevicesPage(driver);
        addDevices = new AddDevicesPage(driver);
        addEquipment = new AddEquipmentPage(driver);
        equipmentPage = new EquipmentPage(driver);
        editEquipmentPage = new EditEquipmentPage(driver);
        wait = new WebDriverWait(driver,Duration.ofSeconds(20));
       }
    @AfterClass
    public void teardown() {
        //Log.info("Tests are ending!");
       //driver.quit();
    }
}