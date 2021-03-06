package WAB.PageObject;

import WAB.BasePage.BasePage;
import WAB.BasePage.LoginSystemPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by yarish on 12/3/2015.
 */
public class MainAppLoginpage extends BasePage implements LoginSystemPath{

    public MainAppLoginpage(WebDriver driver){super(driver);};



    @FindBy(id ="textboxUsername") WebElement username;
    @FindBy(id = "Password") WebElement password;
    @FindBy(id = "Login") WebElement login;



// test environment url, should be executed in BeforeTest anotations
    public void openLoginpage(){
        setPAGE_URL(ENV_URL);
        setPAGE_TITLE(ENV_TITILE);
        loadPage();
    }
// login to the MAIN, start point for the testing
    public void signIn(){

        setElement(username,ADMIN_USER_CRED); // use credentials from LoginSystempath
        setElement(password,"1111");
        clickElement(login);
    }
    // open APP in separate PAGE
    public APPStartPage openTargetApp(){
        setPAGE_URL(ENV_BASEURL+APP_PAGE_SUFIX);
        setPAGE_TITLE("Global Workflow App Builder");
        loadPage();

        return new APPStartPage(driver);

    }
}
