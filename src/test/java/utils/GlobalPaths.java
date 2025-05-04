package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalPaths {
    private static final Properties properties = new Properties();

    static {
        try (FileInputStream fis = new FileInputStream("src/test/resources/paths.properties")) {
            properties.load(fis);
        } catch (IOException e) {
            throw new RuntimeException("Failed to load paths.properties", e);
        }
    }

    private GlobalPaths() {
        // Private constructor to prevent instantiation
    }

    public static String getPath(String key) {
        return properties.getProperty(key);
    }

    public static String getPath(String key, String defaultValue) {
        return properties.getProperty(key, defaultValue);
    }
}