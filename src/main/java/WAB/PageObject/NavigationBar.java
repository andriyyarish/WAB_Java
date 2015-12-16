package WAB.PageObject;

import WAB.BasePage.BasePage;
import WAB.PageObject.AppTabs.*;
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
    public MetricsTab navigateToMetrics (){metricsButton.click(); return new MetricsTab(driver);}

    @FindBy (css = "[title=\"Dashboards\"]")  WebElement dashboardsButton ;
    public DashBoardsTab navigateToDashBoard (){dashboardsButton.click(); return new DashBoardsTab(driver);}

    @FindBy(css = "[title=\"Reports\"]") WebElement reportsButton;
    public ReportsTab navigateToReports(){reportsButton.click();return new ReportsTab(driver);}

    @FindBy(css = "[title=\"Print\"]") WebElement printButton;
    public PrintTab navigateToprint(){printButton.click();return new PrintTab(driver);}

    @FindBy(css = "[title=\"Designer\"]") WebElement designerButton;
    public DesignerTab navigateToDesigner(){designerButton.click();return new DesignerTab(driver);}

    @FindBy(css = "[title=\"Help\"]") WebElement helpButton;
    public HelpTab navigateToHelp(){ helpButton.click();return new HelpTab(driver);}



}
