package drivers;

public class SelectorDriver {
    public static String chooseDriver() {
        String deviceHost = System.getProperty("deviceHost", "emulation");

        if ("browserstack".equals(deviceHost)) {
            return "drivers.BrowserstackDriver";
        } else if ("emulation".equals(deviceHost)) {
            return "drivers.LocalDriver";
        } else if ("real".equals(deviceHost)) {
            return "drivers.LocalDriver";
        } else {
            throw new AssertionError("Некорректный хост: " + deviceHost);
        }
    }
}
