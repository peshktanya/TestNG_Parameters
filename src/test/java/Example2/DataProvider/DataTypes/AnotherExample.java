package Example2.DataProvider.DataTypes;

import org.testng.annotations.Test;

public class AnotherExample {

    @Test(dataProvider = "create", dataProviderClass = StaticProvider.class)
    public void test(int n) {

        System.out.println(n);
        }

}
