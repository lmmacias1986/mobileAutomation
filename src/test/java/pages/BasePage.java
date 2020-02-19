package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    private static final int KEYBOARD_ANIMATION_DELAY = 1000;
    private static final int XML_REFRESH_DELAY = 1000;

    protected final AppiumDriver driver;

    protected BasePage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
}