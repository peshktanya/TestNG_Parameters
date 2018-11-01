package Example2.DataProvider.ExternalClass;

import org.testng.annotations.Test;

public class DataProviderTest {

    @Test(dataProviderClass = DataClass.class, dataProvider = "test1")
    public void verifyExternalClassData(String browser, String platform) {

        System.out.println(browser + " " + platform);
    }


}
