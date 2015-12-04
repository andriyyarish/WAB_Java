package WAB;

import WAB.BasePage.LoginSystemPath;
import WAB.PageObject.APPStartPage;
import WAB.PageObject.MainAppLoginpage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
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

        @BeforeTest
        public void setUp() {
            // set up browser
            this.driver = new FirefoxDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            // initialize page factory: elements which declare as @FindBy
            mainAppLoginpage = PageFactory.initElements(driver, MainAppLoginpage.class);
            appStartPage = PageFactory.initElements(driver, APPStartPage.class);

            // login to the system and start target application
            mainAppLoginpage.openLoginpage();
            mainAppLoginpage.signIn();
            mainAppLoginpage.openTargetApp();
        }

        @Test
        public void searchWFByName(){
            appStartPage.performSearchByClick("test");
        }


    }

