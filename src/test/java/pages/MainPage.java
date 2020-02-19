package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class MainPage extends BasePage {

    @AndroidFindBy(id = "org.traeg.fastip:id/billAmtEditText")
    private MobileElement billAmountField;

    @AndroidFindBy(id = "org.traeg.fastip:id/calcTipButton")
    private MobileElement calculateButton;

    @AndroidFindBy(id = "org.traeg.fastip:id/totalAmtTextView")
    private MobileElement totalAmountBill;

    @AndroidFindBy(id = "org.traeg.fastip:id/tipAmtTextView")
    private MobileElement tipAmount;


    public MainPage(AppiumDriver driver) {
        super(driver);
    }

    public String getTotalBill() {
        return totalAmountBill.getText();
    }

    public void typeAmount(String amount) {
        this.billAmountField.sendKeys(amount);
    }

    public String tipAmount() {
        return  this.tipAmount.getText();
    }

    public void clickCalculateButton() {
        this.calculateButton.click();
    }

    public boolean buttonDisplayed() {
        return this.calculateButton.isDisplayed();
    }
}
