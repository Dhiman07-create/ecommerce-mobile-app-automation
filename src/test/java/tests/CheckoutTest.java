package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;

public class CheckoutTest extends BaseTest {

    @Test
    public void checkoutFlowTest() {

        CartPage cart = new CartPage(driver);
        cart.proceedToCheckout();

        Assert.assertTrue(cart.isCheckoutPageDisplayed(),
                "Checkout page is not displayed");
    }
}
