import org.testng.Assert;
import org.testng.annotations.Test;

public class TestScenario02 {

    @Test
    void test03() {
        Assert.assertEquals(1 + 1, 2, "Test03 to PASS");
    }

    @Test
    void test04() {
        Assert.assertEquals(1 + 1, 2, "Test04 to PASS");
    }
}
