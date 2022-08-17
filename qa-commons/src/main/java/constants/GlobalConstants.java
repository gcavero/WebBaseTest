package constants;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

/**
 * This class holds values used in testing.
 */
public final class GlobalConstants {
    private static final Logger LOGGER = LogManager.getLogger(GlobalConstants.class.getSimpleName());
    private static final Map<String, String> GLOBALCONSTANTSMAP = new HashMap<>();

    static {
        initSLConstants();
    }

    /**
     * Private constructor that prevents instantiation of the class.
     */
    private GlobalConstants() {
    }

    /**
     * This method retrieves a value for a key.
     *
     * @param key to get
     * @return the value of a key
     */
    public static String get(final String key) {
        if (GLOBALCONSTANTSMAP.size() == 0) {
            initSLConstants();
        }
        return GLOBALCONSTANTSMAP.get(key);
    }

    /**
     * This method adds the constants values to the map.
     */
    private static void initSLConstants() {
        GLOBALCONSTANTSMAP.put("ENV", "");
    }

    /**
     * This method adds new constant value to the map.
     *
     * @param key   of the constant
     * @param value of the constant
     */
    public static void set(final String key, final String value) {
        LOGGER.info(String.format("New entry: [%s, %s]", key, value));
        GLOBALCONSTANTSMAP.put(key, value);
    }
}
