package Example1.xml;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersOptionalTest {

    @Parameters({ "number", "last-name" })
    @Test
    public void testOptional(@Optional("62") int number, String lastName) {
        System.out.println("Optional is used  " + number + " " + lastName);
    }

    @Parameters({ "name", "last-name" })
    @Test
    public void testParamOptional(@Optional("Petro") String firstName, String lastName) {
        System.out.println("Optional is not used " + firstName + " " + lastName);
    }


}
