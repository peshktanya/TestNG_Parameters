package Example2.DataProvider.MethodName;

import org.testng.annotations.DataProvider;

import java.lang.reflect.Method;

public class StaticProvider {

    @DataProvider(name = "dp")
    public static Object[][] createData(Method m) {
        System.out.println(m.getName());
        return new Object[][] { new Object[] { "Name" }};
    }

}
