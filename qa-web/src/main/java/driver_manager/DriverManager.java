package driver_manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.PropertyAccessor;

import java.time.Duration;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * This class is going to handle WebDriver that is being used.
 */
public final class DriverManager {

    private static final Logger LOG = LogManager.getLogger(DriverManager.class.getSimpleName());

    private static final int IMPLICIT_TIME_WAIT = PropertyAccessor.getInstance().getImplicitTimeWait();
    private static final int EXPLICIT_TIME_WAIT = PropertyAccessor.getInstance().getExplicitTimeWait();
    private static DriverManager instance;
    private WebDriver driver;
    private WebDriverWait wait;

    /**
     * Constructor to prevent instantiation.
     */
    private DriverManager() {
        initWebDriver();
    }

    /**
     * This function used the singleton patter to retrieve just one instance of a DriverManager.
     *
     * @return an instance of a DriverManager.
     */
    public static DriverManager getInstance() {
        if (instance == null) {
            instance = new DriverManager();
        }
        return instance;
    }

    /**
     * This method is going to be use initialize an instance of a WebDriver.
     */
    private void initWebDriver() {
        driver = FactoryDriver.getDriver(PropertyAccessor.getInstance().getBrowser().toUpperCase()).initWebDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICIT_TIME_WAIT));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(EXPLICIT_TIME_WAIT));
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(IMPLICIT_TIME_WAIT));
        LOG.info("Driver created with hash " + driver.hashCode());
        LOG.info("DriverWait created with hash " + wait.hashCode());
    }

    /**
     * This method retrieves the instance of a WebDriver.
     *
     * @return driver
     */
    public WebDriver getWebDriver() {
        return driver;
    }

    /**
     * This method retrieves the instance of a WebDriverWait.
     *
     * @return wait
     */
    public WebDriverWait getWebDriverWait() {
        return wait;
    }

    public void closeDriver() {
        driver.close();
    }

    public void quitDriver() {
        driver.quit();
    }
}
