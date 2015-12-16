package WAB.PageObject;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

/**
 * Created by yarish on 12/16/2015.
 */
public class STCtestcase {
    WebDriver driver;
    STCTestpage testpage;
    WebDriverWait wait;

    @org.testng.annotations.BeforeClass
    public void setUp(){
        this.driver = new FirefoxDriver();
        this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        this.driver.manage().window().maximize();
        wait=new WebDriverWait(driver,3);
    }

    @Test
    public void checkOpenPage(){
        driver.get("http://stc.net.ua/autotestMe/");
        Assert.assertEquals(driver.getTitle(),"AutotestMe");
    }

    @Test (dependsOnMethods = "checkOpenPage", invocationCount = 2 )
    public void test(){
        testpage= PageFactory.initElements(driver,STCTestpage.class);
        testpage.setFerstName("aaa");
        testpage.setLastName("bbb");
        testpage.setRequestType();
        testpage.setSum(testpage.countSumOfList().toString());
        testpage.clickSendRequest();
        wait.until(visibilityOfElementLocated(By.id="queryResult"));



        Assert.assertEquals(Result,"[OK] Request was sent.");

        //[OK] Request was sent.
       // driver.navigate().refresh();
    }

    @AfterClass
    public void tearDown(){
        this.driver.close();
    }
}
