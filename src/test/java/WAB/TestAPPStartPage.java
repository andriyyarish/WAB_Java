package WAB;

import WAB.BasePage.LoginSystemPath;
import WAB.PageObject.APPStartPage;
import WAB.PageObject.AppTabs.DesignerTab;
import WAB.PageObject.MainAppLoginpage;
import WAB.PageObject.NavigationBar;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by yarish on 12/4/2015.
 */
public class TestAPPStartPage {

        public WebDriver driver;
        MainAppLoginpage mainAppLoginpage;
        LoginSystemPath loginSystemPath;
        APPStartPage appStartPage;
        NavigationBar navigationBar;
        DesignerTab designerTab;
        @BeforeTest
        public void setUp() {
            // set up browser
            this.driver = new FirefoxDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().window().maximize();

            // initialize page factory: elements which declare as @FindBy
            mainAppLoginpage = PageFactory.initElements(driver, MainAppLoginpage.class);
            appStartPage = PageFactory.initElements(driver, APPStartPage.class);
          //  designerTab = PageFactory.initElements(driver,DesignerTab.class);

            // login to the system and start target application
            mainAppLoginpage.openLoginpage();
            mainAppLoginpage.signIn();
            mainAppLoginpage.openTargetApp();

        }

        @Test
        public void checkLoadingApp(){

            Assert.assertEquals(driver.findElement(By.partialLinkText("Workflows")).isDisplayed(), true);
        }

        @Test (dependsOnMethods = "checkLoadingApp")
        public void goToDesigner(){
            navigationBar = PageFactory.initElements(driver,NavigationBar.class);
            navigationBar.navigateToDesigner();
            Assert.assertEquals(driver.findElement(By.name("designerTopFormType")).isDisplayed(), true);
        }

    @Test (dependsOnMethods = "goToDesigner")
    public void setWFinDesigner(){
        // value should be parametrized and map to corresponding text (expected result in assertion) need to create Data provider class and set there list of Form Type
        designerTab = PageFactory.initElements(driver,DesignerTab.class);
        String formType = designerTab.selectFormType("3");
        String stepName = designerTab.selectStepName("1");
        Assert.assertEquals(stepName,"PrimaryWF. Step 2");
    }


    }

