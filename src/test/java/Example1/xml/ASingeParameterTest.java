package Example1.xml;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ASingeParameterTest {

    @Parameters({ "first-name" })
    @Test
    public void testSingleString(String firstName) {
        System.out.println("Simple example " + firstName);

    }
}
