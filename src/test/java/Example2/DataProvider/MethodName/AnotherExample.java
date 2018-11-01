package Example2.DataProvider.MethodName;
import org.testng.annotations.Test;

public class AnotherExample {

    @Test(dataProvider = "dp", dataProviderClass = StaticProvider.class)
    public void testMethodName1(String s) {
    }

    @Test(dataProvider = "dp", dataProviderClass = StaticProvider.class)
    public void testMethodName2(String s) {
    }


}
