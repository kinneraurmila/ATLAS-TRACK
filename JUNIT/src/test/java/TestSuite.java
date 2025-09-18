
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({CalculatorTest.class, StringEqualityTest.class})
public class TestSuite {
    // This class remains empty. It is used only as a holder for the above annotations.
}
