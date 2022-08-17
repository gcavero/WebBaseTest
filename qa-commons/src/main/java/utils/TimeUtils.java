package utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.Instant;

/**
 * Time utils class.
 */
public final class TimeUtils {

    private static final Logger LOGGER = LogManager.getLogger(TimeUtils.class.getName());

    /**
     * Constructor to prevent instantiation.
     */
    private TimeUtils() {
    }

    /**
     * This method sleep the tread for a period of time.
     *
     * @param millis to sleep.
     */
    public static void waitFixedTime(final int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException ex) {
            LOGGER.info(ex.getMessage());
        }
    }

    /**
     * Method to get TimeStamp.
     *
     * @return TimeStamp.
     */
    public static String getTimeStamp() {
        return Instant.now().toString();
    }
}
