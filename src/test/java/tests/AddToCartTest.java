package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.*;

public class AddToCartTest extends BaseTest {

    @Test
    public void addProductToCartTest() {

        HomePage home = new HomePage(driver);
        home.verifyHomePageLoaded();
        home.openFirstProduct();

        ProductDetailsPage details = new ProductDetailsPage(driver);
        details.addToCart();

        CartPage cart = new CartPage(driver);
        cart.verifyProductInCart();
    }
}
