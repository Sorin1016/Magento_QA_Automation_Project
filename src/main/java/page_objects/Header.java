package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Header extends BasePage {


    @FindBy(xpath = "(//a[contains(text(),'Sign In ')])[1]")
    private WebElement signInButton;

    @FindBy(css = ".panel.header")
    private WebElement welcomeMessage;

    @FindBy(css = ".action.showcart")
    private WebElement cartButton;

    @FindBy(css = "#top-cart-btn-checkout")
    private WebElement checkoutButton;

    public Header(WebDriver driver) {
        super(driver);
    }

    public void clickSignInButton() {
        clickElement(this.signInButton);
    }

    public String getWelcomeMessage() {
        return getText(this.welcomeMessage);
    }

    public void clickCartButton() {
        clickElement(this.cartButton);
    }

    public void clickCheckoutButton() {
        clickElement(this.checkoutButton);
    }

    public void scrollToCartButton() {
        scrollToElement(this.cartButton);
    }
}
