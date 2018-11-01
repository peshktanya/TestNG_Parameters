package Example1.xml;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterSetUpTest {


    @Test
    public void testSingleString() {
        System.out.println("test is running...");

    }

    @Parameters({ "first-name", "last-name" })
    @BeforeMethod
    public void beforeTest(String firstName, String lastName) {

        System.out.println(lastName+ " " + firstName);
    }




}
