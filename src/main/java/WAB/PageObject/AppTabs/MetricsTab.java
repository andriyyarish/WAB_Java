package WAB.PageObject.AppTabs;

import WAB.BasePage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by yarish on 12/4/2015.
 */
public class MetricsTab extends BasePage {

    public MetricsTab(WebDriver driver) {
        super(driver);
    }


    @FindBy(name = "metrciObj") WebElement facility;




}
