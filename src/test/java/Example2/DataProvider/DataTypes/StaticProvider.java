package Example2.DataProvider.DataTypes;

import org.testng.annotations.DataProvider;

import java.lang.reflect.Method;

public class StaticProvider {

    @DataProvider(name = "create")
    public static Object[][] createData() {
            return new Object[][] {
                    new Object[] {new Integer(42)},
                    new Object[] {new Integer(-1)},
                    new Object[] {new Integer(0)},
                    new Object[] {new Integer(54)}
            };
        }

}
