package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import utils.WaitUtils;

public class ProductListPage {

    AndroidDriver driver;

    private final By firstProduct = By.xpath("(//android.widget.ImageView)[1]");

    public ProductListPage(AndroidDriver driver) {
        this.driver = driver;
    }

    public void selectFirstProduct() {
        WaitUtils.waitForElement(driver, firstProduct);
        driver.findElement(firstProduct).click();
    }
}
