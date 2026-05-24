package tests;

import tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void verifyLoginTest() {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("Admin", "admin123");

        DashboardPage dashboardPage = new DashboardPage(driver);

        Assert.assertTrue(dashboardPage.isDashboardDisplayed());
    }
}
