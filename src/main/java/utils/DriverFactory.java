package utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {

    public static WebDriver initializeDriver(String browser) {

        WebDriver driver = null;

        if (browser.equalsIgnoreCase("chrome")) {

            ChromeOptions options = new ChromeOptions();

            // Required for CI/CD pipeline
            options.addArguments("--headless=new");
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-dev-shm-usage");
            options.addArguments("--disable-gpu");
            options.addArguments("--remote-allow-origins=*");
            options.addArguments("--window-size=1920,1080");

            // Stability improvements
            options.addArguments("--disable-extensions");
            options.addArguments("--disable-infobars");
            options.addArguments("--start-maximized");

            driver = new ChromeDriver(options);

            driver.manage().timeouts()
                  .implicitlyWait(Duration.ofSeconds(10));
        }

        return driver;
    }
}
