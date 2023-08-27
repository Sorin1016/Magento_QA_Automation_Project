package page_objects;

import constants.ConstantData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class CheckoutPage extends BasePage{
    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "span[data-bind='text: $parent.qty']")
    private List<WebElement> itemsQuantity;

    @FindBy(css = "span[data-bind='text: getCartSummaryItemsCount()']")
    private WebElement itemsQuantityInCart;

    @FindBy(css = ".block.items-in-cart")
    private WebElement orderSummaryButton;

    @FindBy(css = "input[name='firstname']")
    private WebElement firstNameField;

    @FindBy(css = "input[name='lastname']")
    private WebElement lastNameField;

    @FindBy(css = "input[name='company']")
    private WebElement companyField;

    @FindBy(css = "input[name='street[0]']")
    private WebElement streetAddressField;

    @FindBy(css = "input[name='city']")
    private WebElement cityField;

    @FindBy(css = "input[name='postcode']")
    private WebElement postalCodeField;

    @FindBy(css = "input[name='telephone']")
    private WebElement phoneNumberField;

    @FindBy(css = "button[data-role='opc-continue']")
    private WebElement continueCheckoutButton;

    @FindBy(css = "input[value='tablerate_bestway']")
    private WebElement shippingMethodCheckBox;

    @FindBy(css = "span[data-bind=\"i18n: 'Place Order'\"]")
    private WebElement placeOrderButton;

    @FindBy(css = "span[data-bind=\"i18n: 'New Address'\"]")
    private WebElement newAddressButton;

    @FindBy(css = "input[type='checkbox']")
    private WebElement saveAddressCheckBox;

    @FindBy(xpath = "(//select[@class='select'])[2]")
    private WebElement countryField;

    @FindBy(xpath = "(//select[@class='select'])[1]")
    private WebElement stateField;

    @FindBy(css = "#billing-address-same-as-shipping-checkmo")
    private WebElement sameAddressCheckBox;

    @FindBy(css = ".order-number")
    private WebElement orderNumber;

    @FindBy(css = ".action.primary.action-save-address")
    private WebElement shipHereButton;

    public boolean checkIfQuantityMatched() {
        int quantity = 0;
        for (WebElement e : itemsQuantity) {
            Integer.valueOf(getText(e));
            quantity += Integer.valueOf(getText(e));
        }
        if (quantity == Integer.valueOf(getText(this.itemsQuantityInCart))) {
            return true;
        }
        return false;
    }

    public void clickOrderSummaryButton() {
        clickElement(this.orderSummaryButton);
    }

    public void clearFields() {
        clearText(this.firstNameField);
        clearText(this.lastNameField);
    }

    public void fillFirstNameField() {
        scrollToElement(this.firstNameField);
        sendKeys(this.firstNameField, ConstantData.FIRST_NAME);
    }

    public void fillLastNameField() {
        sendKeys(this.lastNameField, ConstantData.LAST_NAME);
    }

    public void fillCompanyField() {
        sendKeys(this.companyField, ConstantData.COMPANY_NAME);
    }

    public void fillStreetAddressField() {

        sendKeys(this.streetAddressField, ConstantData.STREET_ADDRESS);
    }

    public void fillCityField() {

        sendKeys(this.cityField, ConstantData.CITY_NAME);
    }

    public void fillPostalCodeField() {

        sendKeys(this.postalCodeField, ConstantData.POSTAL_CODE);
    }

    public void fillPhoneNumberField() {

        sendKeys(this.phoneNumberField, ConstantData.PHONE_NUMBER);
    }


    public void clickNextCheckOutButton() {
        clickElement(this.continueCheckoutButton);
    }

    public void scrollToContinueCheckoutButton() {
        scrollToElement(this.continueCheckoutButton);
    }

    public void chooseShippingMethod() {
        if (!this.shippingMethodCheckBox.isEnabled()){
            clickElement(this.shippingMethodCheckBox);
        }
    }

    public void clickPlaceOrderButton() {
        clickElement(this.placeOrderButton);
    }

    public void clickNewAddressButton() {
        clickElement(this.newAddressButton);
    }

    public void clickSaveAddressCheckBox() {
        if (this.saveAddressCheckBox.isEnabled()) {
            clickElement(this.saveAddressCheckBox);
        }
    }

    public void selectCountry() {
        Select selectCountry = new Select(this.countryField);
        selectCountry.selectByValue(ConstantData.ROMANIA_COUNTRY);
    }

    public void selectState() {
        Select selectState = new Select(this.stateField);
        selectState.selectByValue(ConstantData.HUNEDOARA_STATE);
    }

    public void checkSameAddress() {
        if (!this.sameAddressCheckBox.isEnabled()) {
            clickElement(this.sameAddressCheckBox);
        }
    }

    public void printOrderNumber() {
        System.out.println(getText(this.orderNumber));
    }

    public void clickShipHereButton() {
        clickElement(this.shipHereButton);
    }
}
