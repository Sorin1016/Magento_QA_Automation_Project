package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Utils;

public class WomenPage extends BasePage{
    public WomenPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "(//a[@class='product-item-link'])[7]")
    private WebElement jacketNumber7;

    @FindBy(xpath = "(//div[@id='option-label-size-143-item-167'])[7]")
    private WebElement jacketNumber7Size;

    @FindBy(xpath = "(//div[@id='option-label-color-93-item-57'])[4]")
    private WebElement jacketNumber7Color;

    @FindBy(xpath = "(//button[@class='action tocart primary'])[7]")
    private WebElement jacketNumber7AddToCartButton;

    @FindBy(xpath = "(//a[@class='product-item-link'])[2]")
    private WebElement jacketNumber2;

    @FindBy(xpath = "(//div[@id='option-label-size-143-item-169'])[2]")
    private WebElement jacketNumber2Size;

    @FindBy(xpath = "(//div[@id='option-label-color-93-item-50'])[2]")
    private WebElement jacketNumber2Color;

    @FindBy(xpath = "(//button[@class='action tocart primary'])[2]")
    private WebElement jacketNumber2AddToCartButton;



    public void fullPickJacketNumber7() {
        scrollToElement(this.jacketNumber7);
        Utils.waitInSeconds(1);
        clickElement(this.jacketNumber7Size);
        clickElement(this.jacketNumber7Color);
        clickElement(this.jacketNumber7AddToCartButton);
    }

    public void fullPickJacketNumber2() {
        scrollToElement(this.jacketNumber2);
        Utils.waitInSeconds(1);
        clickElement(this.jacketNumber2Size);
        clickElement(this.jacketNumber2Color);
        clickElement(this.jacketNumber2AddToCartButton);
    }
}
