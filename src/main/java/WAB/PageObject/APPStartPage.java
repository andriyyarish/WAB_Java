package WAB.PageObject;

import WAB.BasePage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by yarish on 12/4/2015.
 */
public class APPStartPage extends BasePage {

    public APPStartPage(WebDriver driver){super(driver);};

    @FindBy(id = "sidebar-panel") WebElement SearchPanel;
    @FindBy(css = "#env-main-menu") WebElement NavigationBar;


    // Elements on search panel
    @FindBy(xpath = ".//*[@id='sidebar-panel']//input[@type='search']") WebElement searchField;
    @FindBy(css = "[ng-click=\"searchClick()\"]") WebElement searchButton ;
    @FindBy(css = "[ng-click=\"setSearchTypeClick(1)\"]") WebElement workflowsScope;
    @FindBy(css = "[ng-click=\"setSearchTypeClick(2)\"]") WebElement secondaryWFScope;
    @FindBy(css = ".env-search-data-left.env-ipad-datepicker") WebElement dateFrom;
    @FindBy(css = ".env-search-data-right.env-ipad-datepicker") WebElement dateTo;
    @FindBy(tagName = "ol") WebElement searchResults;
    @FindBy(css = "ul.pagination") WebElement pager;

    public void performSearchByClick (String request) {
        setElement(searchField,request);
        clickElement(searchButton);
    }

    public void performSearchByEnter(String request){
        setElement(searchField,request);
        searchByEnter(searchField);
    }

    // Go to secondary Tabs Buttons
    @FindBy(css="[title=\"My Secondary WFs\"]") WebElement secondaryWFsButton;
    @FindBy(css="[title=\"New Workflow\"]") WebElement NewWFButton;
    @FindBy (css = "[title=\"Workflows\"]")  WebElement WorkflowsButton ;
    @FindBy (css = "[title=\"Metrics\"]")  WebElement MetricsButton ;
    @FindBy (css = "[title=\"Dashboards\"]")  WebElement DashboardsButton ;
    @FindBy(css = "[title=\"Reports\"]") WebElement ReportsButton;
    @FindBy(css = "[title=\"Print\"]") WebElement PrintButton;
    @FindBy(css = "[title=\"Designer\"]") WebElement DesignerButton ;
    @FindBy(css = "[title=\"Help\"]") WebElement HelpButton;












}

