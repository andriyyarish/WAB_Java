package WAB.PageObject;

import WAB.BasePage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by yarish on 12/4/2015.
 */
public class NavigationBar extends BasePage {

    public NavigationBar(WebDriver driver) {
        super(driver);}

    // Go to secondary Tabs Buttons
    @FindBy(css="[title=\"My Secondary WFs\"]") WebElement secondaryWFsButton;

    @FindBy(css="[title=\"New Workflow\"]") WebElement newWFButton;
    @FindBy (css = "[title=\"Workflows\"]")  WebElement workflowsButton ;

    @FindBy (css = "[title=\"Metrics\"]")  WebElement metricsButton ;
    public MetricsTab navigateToMetrics (){metricsButton.click(); return new MetricsTab();}


    @FindBy (css = "[title=\"Dashboards\"]")  WebElement dashboardsButton ;
    @FindBy(css = "[title=\"Reports\"]") WebElement reportsButton;
    @FindBy(css = "[title=\"Print\"]") WebElement printButton;
    @FindBy(css = "[title=\"Designer\"]") WebElement designerButton ;
    @FindBy(css = "[title=\"Help\"]") WebElement helpButton;




}
