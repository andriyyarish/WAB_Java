package WAB;

import WAB.PageObject.MainAppLoginpage;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by yarish on 12/3/2015.
 */
public class Test {
    public WebDriver driver;
    MainAppLoginpage mainAppLoginpage;

    @BeforeClass
            public void setUp(){
        this.driver = new FirefoxDriver();
        mainAppLoginpage = PageFactory.initElements(driver,MainAppLoginpage.class);
        }


    @org.testng.annotations.Test
    public void testLoadEnvPage(){
        mainAppLoginpage.signIn();
    }
}
