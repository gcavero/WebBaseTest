package driver_manager;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Thi class represents the GoogleChrome WebDriver.
 */
public class Chrome implements IDriver {

    private static final Logger LOG = LogManager.getLogger(Chrome.class.getSimpleName());

    /**
     * This method is going to retrieve the instance of the Google Chrome WebDriver.
     *
     * @return Chrome driver
     */
    @Override
    public WebDriver initWebDriver() {
        LOG.info("Initializing Google Chrome Driver...");
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars");
        options.addArguments("-lang=en");

        return new ChromeDriver(options);
    }
}
