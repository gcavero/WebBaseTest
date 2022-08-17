package utils;

import constants.GlobalConstants;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.Instant;

/**
 * String utils class.
 */
public final class StringUtils {
    private static final Logger LOGGER = LogManager.getLogger(StringUtils.class.getSimpleName());

    /**
     * Constructor to prevent instantiation.
     */
    private StringUtils() {
    }

    /**
     * This method concatenates a timestamp.
     *
     * @param stringItem to concatenates.
     * @return new string.
     */
    public static String replaceStringWithTimeStamp(final String stringItem) {
        return stringItem.replace("+timestamp", (String.valueOf(Instant.now().toEpochMilli())));
    }

    /**
     * This method validate the real value if is necessary the timestamp
     *
     * @param value to add or no timestamp
     * @return real value with or not timestamp
     */
    public static String setTimeStamp(String value) {
        String realValue = value;
        if (value.toLowerCase().contains("+timestamp")) {
            realValue = replaceStringWithTimeStamp(realValue);
            GlobalConstants.set(value, realValue);
            LOGGER.info("Stored Constant: Key: " + value + "Value: " + realValue);
        }

        return realValue;
    }

    public static String getGlobalValueTimeStamp(String key) {
        String realValue = key;
        if (realValue.toLowerCase().contains("+timestamp")) {
            realValue = GlobalConstants.get(key);
            LOGGER.info("Used Constant: Key: " + key + "Value: " + realValue);
        }
        return realValue;
    }
}
