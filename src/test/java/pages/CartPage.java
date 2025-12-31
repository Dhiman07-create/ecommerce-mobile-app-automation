package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.testng.Assert;
import utils.WaitUtils;

public class CartPage {

    AndroidDriver driver;

    private final By cartItem = By.xpath("//android.widget.TextView");
    private final By checkoutBtn = By.xpath("//android.widget.Button[contains(@text,'Checkout')]");

    public CartPage(AndroidDriver driver) {
        this.driver = driver;
    }

    public void verifyProductInCart() {
        WaitUtils.waitForElement(driver, cartItem);
        Assert.assertTrue(driver.findElement(cartItem).isDisplayed());
    }

    public void proceedToCheckout() {
        WaitUtils.waitForElement(driver, checkoutBtn);
        driver.findElement(checkoutBtn).click();
    }

    public boolean isCheckoutPageDisplayed() {
        return driver.getPageSource().contains("Checkout");
    }
}
