import org.easetech.easytest.annotation.DataLoader;
import org.easetech.easytest.annotation.Param;
import org.easetech.easytest.loader.LoaderType;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import java.net.MalformedURLException;

@RunWith(DataDrivenTestRunner.class)
public class ReadDataFromFileExample {


    @Test
    @DataLoader(filePaths = "drivers.csv", loaderType = LoaderType.CSV)
    public void testAddFromCSV(@Param(name = "browser") String browser,
                               @Param(name = "platform") String platform,
                               @Param(name = "instances") int number) throws MalformedURLException {
       System.out.println(browser + platform + number);

    }

}
