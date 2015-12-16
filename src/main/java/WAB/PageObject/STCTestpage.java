package WAB.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

/**
 * Created by yarish on 12/16/2015.
 */
public class STCTestpage {

    public WebDriver driver;

    @FindBy(id="inputFirstName")
    WebElement firstName;

    public void setFerstName(String frName){
        firstName.clear();
        firstName.sendKeys(frName);
    }

    @FindBy(id="inputLastName")
    WebElement lastname;

    public void setLastName (String lsName){
        lastname.clear();
        lastname.sendKeys(lsName);
    }

    @FindBy(id="requestType") WebElement requestType;

    public void setRequestType(){
        Select select = new Select(requestType);
        select.selectByVisibleText("Autotest Sample Task");
    }

    @FindBy(id="numbersList") WebElement numberList;

    public Integer countSumOfList (){
        Select select = new Select(numberList);
        List<WebElement> elements = select.getOptions();


        int sum = 0 ;
        for (int i = 0; i<elements.size();i++){

            sum += Integer.parseInt(elements.get(i).getAttribute("value"));
        }
        return sum;
    }

    @FindBy(id="numbersSum") WebElement numberSum;
    public void setSum (String sum){
        numberSum.clear();
        numberSum.sendKeys(sum);
            }
    @FindBy (id="sendRequest") WebElement sendRequest;
    public void clickSendRequest(){
        sendRequest.click();
    }



}
