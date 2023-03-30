package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.util.List;

public class SignInPage {


    public SignInPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//h4[.='Welcome Back!']")
    WebElement welcomeMessage;

    public WebElement getWelcomeMessage() {
        return welcomeMessage;
    }

    @FindBy (xpath = "//input")
    List<WebElement> inputFields;

    public List<WebElement> getInputFields() {
        return inputFields;
    }

    @FindBy (name = "email")
    WebElement email;

    public WebElement getEmail() {
        return email;
    }
}
