package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {

    WebDriver driver;

    By dashboardText = By.xpath("//h6[text()='Dashboard']");

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isDashboardDisplayed() {
        return driver.findElement(dashboardText).isDisplayed();
    }
}
