package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.HomePage;

public class SmokeTest extends BaseTest {

    @Test
    public void launchTest() {
        System.out.println(driver.getPageSource());
    }

}
