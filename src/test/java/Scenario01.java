import org.testng.Assert;
import org.testng.annotations.Test;

public class Scenario01 {

    @Test
    void test01() {
        Assert.assertEquals(1 + 1, 2, "Test01 to pass");
    }

    @Test
    void test02() {
        Assert.assertEquals(1 + 1, 2, "Test01 to Pass");
    }
}
