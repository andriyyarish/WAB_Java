package WAB.PageObject.AppTabs;

import WAB.BasePage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by yarish on 12/9/2015.
 */
public class DesignerTab extends BasePage {
    public DesignerTab(WebDriver driver) {
        super(driver);
    }

    // WF type DDL
    @FindBy(name="designerTopFormType")
    WebElement formTypeDDL;
    // select value from DDL
    public String selectFormType(String value){
        Select select = new Select(formTypeDDL);
        select.selectByValue(value);
        WebElement option = select.getFirstSelectedOption();
        return option.getText();
    }

    // WF step DDL
    // select value from DDL by atribute "value", value is a number (index of array) and != text
    @FindBy(name="designerTopStepName")
    WebElement stepNameDDL;
    public String selectStepName(String value){
        Select select = new Select(stepNameDDL);
        select.selectByValue(value);
        WebElement option = select.getFirstSelectedOption();
        return option.getText();
    }

    //




}
