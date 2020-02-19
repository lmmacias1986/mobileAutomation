package tests.abstractBaseTest;

import cucumber.api.testng.AbstractTestNGCucumberTests;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public abstract class TestBase extends AbstractTestNGCucumberTests {

    public static AndroidDriver<MobileElement> driver;

    @BeforeTest
    public abstract void setUpPage();

    @BeforeSuite
    public void setUpAppium() throws MalformedURLException {

        final String URL_STRING = "http://127.0.0.1:4723/wd/hub";

        URL url = new URL(URL_STRING);

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("browserName", ""); //Leave blank if automating an App
        capabilities.setCapability("platformVersion", "9");
        capabilities.setCapability("deviceName", "Android Emulator");
        capabilities.setCapability("appPackage","org.traeg.fastip");
        capabilities.setCapability("appActivity",".MainActivity");
        capabilities.setCapability(MobileCapabilityType.UDID, "emulator-5554");
        capabilities.setCapability("app", "/Users/mmacias/IdeaProjects/MobileTestingGNB/src/test/resources/apps/Fastip.apk");

        capabilities.setCapability(AndroidMobileCapabilityType.UNICODE_KEYBOARD, "true");
        capabilities.setCapability(AndroidMobileCapabilityType.RESET_KEYBOARD, "true");
        capabilities.setCapability("autoGrantPermissions", "true");


        driver = new AndroidDriver<MobileElement>(url, capabilities);

        driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
    }

    @AfterSuite
    public void tearDownAppium() {
        driver.quit();
    }

    @AfterClass
    public void restartApp() {
        driver.resetApp();
    }
}