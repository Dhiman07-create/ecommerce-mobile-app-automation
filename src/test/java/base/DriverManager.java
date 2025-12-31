package base;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Optional;

public class DriverManager {

    private static AndroidDriver driver;

    public static void initDriver() throws MalformedURLException {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");

        caps.setCapability("deviceName", "emulator-5554");
        caps.setCapability("udid", "emulator-5554");

        caps.setCapability("appPackage", "webkul.opencart.mobikul");
        caps.setCapability("appActivity", "webkul.opencart_flutter.mobikul.MainActivity");

        caps.setCapability("noReset", true);
        caps.setCapability("autoGrantPermissions", true);

// Optional but recommended for Flutter apps
        caps.setCapability("newCommandTimeout", 300);

        driver = new AndroidDriver(
                new URL("http://127.0.0.1:4723"),
                caps
        );
    }

    public static AndroidDriver getDriver() {
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}
