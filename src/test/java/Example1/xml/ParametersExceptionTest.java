package Example1.xml;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersExceptionTest {

    @Parameters({ "first-name", "last-name" })
    @Test
    public void testInteger(int firstName, String lastName) {
        System.out.println("Different data types " + firstName + " " + lastName);
    }

}
