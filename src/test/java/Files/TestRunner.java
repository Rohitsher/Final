package Files;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
        glue = {"Sample"},monochrome = true,strict = true,
        plugin={"pretty","html:Files/HTMLDir","junit:Files/JUnitDir/report.xml","json:Files/JSONDir/report.json"}
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
