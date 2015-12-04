package WAB.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

/**
 * Created by yarish on 12/3/2015.
 */
public class BasePage {
    public WebDriver driver;
    public WebDriverWait wait;

    public BasePage(WebDriver driver){this.driver=driver; wait = new WebDriverWait(driver,20); }

    private String PAGE_URL;
    public void setPAGE_URL(String PAGE_URL){this.PAGE_URL=PAGE_URL;};
    public String getPAGE_URL(){return PAGE_URL;};

    private String PAGE_TITLE; // for assertion of load of the page
    public void setPAGE_TITLE (String PAGE_TITLE){this.PAGE_TITLE=PAGE_TITLE;};
    public String getPAGE_TITLE(){return PAGE_TITLE;};

    public void loadPage(){
        driver.get(getPAGE_URL());
        Assert.assertEquals(driver.getTitle(),getPAGE_TITLE());
    }

    public void clickElement(WebElement element){element.click();};


    // global setter for all Webelement objects
    public void setElement(WebElement element, String text){
        element.clear();
        element.sendKeys(text);
        Assert.assertEquals(element.getAttribute("value"), text);
    }

    // start Search action by clicking on ENTER key
    public void searchByEnter(WebElement element){
        element.click();
        element.sendKeys(Keys.ENTER);
    }










}
