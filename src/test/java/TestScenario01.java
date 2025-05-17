import org.testng.Assert;
import org.testng.annotations.Test;

public class TestScenario01 {

    @Test
    void test01() {
        Assert.assertEquals(1 + 1, 3, "Test01 to pass");
    }

    @Test(enabled = false)
    void test02() {
        Assert.assertEquals(1 + 1, 2, "Test01 to Pass");
    }
}
