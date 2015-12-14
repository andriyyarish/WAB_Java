package WAB.PageObject.AppTabs;

import WAB.BasePage.BasePage;
import WAB.PageObject.NavigationBar;
import org.openqa.selenium.WebDriver;

/**
 * Created by yarish on 12/9/2015.
 */
public class ReportsTab extends BasePage {
    public ReportsTab(WebDriver driver) {
        super(driver);
    }







    public NavigationBar gotoNavigationBar(){return new NavigationBar(driver);}
}
