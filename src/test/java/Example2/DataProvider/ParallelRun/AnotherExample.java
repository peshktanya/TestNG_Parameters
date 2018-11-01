package Example2.DataProvider.ParallelRun;

import org.testng.annotations.Test;

public class AnotherExample {

    @Test(dataProvider = "create", dataProviderClass = StaticProvider.class)
    public void test(Integer n) {
            System.out.println(n);
        }



}
