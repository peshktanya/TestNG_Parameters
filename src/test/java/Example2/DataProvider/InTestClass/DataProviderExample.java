package Example2.DataProvider.InTestClass;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {

    @Test(dataProvider = "test1")
    public void verifyData(String browser, String platform) {

        System.out.println(browser + " " + platform);
    }

    @DataProvider(name = "test1")
    public Object[][] createData() {
        return new Object[][] {
                { "firefox", "WINDOWS" },
                { "IE", "WINDOWS"} ,
                { "safari", "MAC"} ,
                { "chrome", "ANDROID"}
        };
    }


}
