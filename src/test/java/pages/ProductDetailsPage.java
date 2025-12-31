package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import utils.WaitUtils;

public class ProductDetailsPage {

    AndroidDriver driver;

    private final By addToCartBtn = By.xpath("//android.widget.Button[contains(@text,'ADD')]");

    public ProductDetailsPage(AndroidDriver driver) {
        this.driver = driver;
    }

    public void addToCart() {
        WaitUtils.waitForElement(driver, addToCartBtn);
        driver.findElement(addToCartBtn).click();
    }
}
