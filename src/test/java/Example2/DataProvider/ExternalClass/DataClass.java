package Example2.DataProvider.ExternalClass;

import org.testng.annotations.DataProvider;

public class DataClass {
    @DataProvider(name = "test1")
    public static Object[][] createData() {
        return new Object[][] {
                { "firefox", "WINDOWS" },
                { "IE", "WINDOWS"} ,
                { "safari", "MAC"} ,
                { "chrome", "ANDROID"}
        };
    }
}
