package base;

import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.ScreenshotUtils;

public class BaseTest {

    protected AndroidDriver driver;

    @BeforeMethod
    public void setUp() throws Exception {
        DriverManager.initDriver();
        driver = DriverManager.getDriver();
    }

    @AfterMethod
    public void tearDown() {
        ScreenshotUtils.captureScreenshot(driver);
        DriverManager.quitDriver();
    }
}
