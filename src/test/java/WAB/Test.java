package WAB;

import WAB.BasePage.LoginSystemPath;
import WAB.PageObject.MainAppLoginpage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;

/**
 * Created by yarish on 12/3/2015.
 */
public class Test {
    public WebDriver driver;
    MainAppLoginpage mainAppLoginpage;
    LoginSystemPath loginSystemPath;

    @BeforeTest
            public void setUp(){
        this.driver = new FirefoxDriver();
        mainAppLoginpage = PageFactory.initElements(driver,MainAppLoginpage.class);
        }


    @org.testng.annotations.Test
    public void testLoadEnvPage(){
        mainAppLoginpage.openLoginpage();
        mainAppLoginpage.signIn();
    }
}
