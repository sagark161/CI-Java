import org.testng.Assert;
import org.testng.annotations.Test;

public class TestScenario03 {

    @Test
    void test03() {
        Assert.assertEquals(1 + 12, 13, "Test05 to pass");
    }

    @Test
    void test04() {
        Assert.assertEquals(1 + 12, 13, "Test06 to fail");
    }
}
