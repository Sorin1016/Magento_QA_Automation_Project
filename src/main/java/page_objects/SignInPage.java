package page_objects;

import constants.ConstantData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage {

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input[name='login[username]']")
    private WebElement emailField;

    @FindBy(css = "input[name='login[password]']")
    private WebElement passwordField;

    @FindBy(css = ".action.login.primary")
    private WebElement signInButton;

    public void inputCredentials() {
        sendKeys(this.emailField, ConstantData.EMAIL);
        sendKeys(this.passwordField, ConstantData.PASSWORD);
    }

    public void clickSignInButton() {
        clickElement(this.signInButton);
    }
}
