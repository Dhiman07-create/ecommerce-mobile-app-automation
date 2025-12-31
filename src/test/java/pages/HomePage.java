package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import utils.WaitUtils;

public class HomePage {

    AndroidDriver driver;

    private final By productList = By.xpath("//android.widget.TextView");

    public HomePage(AndroidDriver driver) {
        this.driver = driver;
    }

    public void verifyHomePageLoaded() {
        WaitUtils.waitForElement(driver, productList);
    }

    public void openFirstProduct() {
        driver.findElements(productList).get(0).click();
    }
}
