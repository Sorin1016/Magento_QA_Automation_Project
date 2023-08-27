package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import utils.Utils;

import java.util.List;

public class HomePage extends BasePage{

    protected Actions action;
    public HomePage(WebDriver driver) {
        super(driver);
        this.action = new Actions(driver);
    }

    @FindBy(css = "#ui-id-4")
    private WebElement womenButton;

    @FindBy(css = "#ui-id-9")
    private WebElement topsButton;

    @FindBy(css = "#ui-id-11")
    private WebElement jacketsButton;

    @FindBy(xpath = "(//input[@class='item-qty cart-item-qty'])[1]")
    private WebElement quantityItemsField;

    @FindBy(css = "span[data-bind=\"text: getCartParam('summary_count')\"]")
    private WebElement quantityOfItems;

    public void hoverToWomenJackets() {
        action.moveToElement(this.womenButton).perform();
        Utils.waitInSeconds(1);
        action.moveToElement(this.topsButton).perform();
        Utils.waitInSeconds(1);
        clickElement(this.jacketsButton);
    }
}
