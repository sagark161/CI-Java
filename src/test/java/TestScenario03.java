import org.testng.Assert;
import org.testng.annotations.Test;

public class TestScenario03 {

    @Test
    void test03() {
        Assert.assertEquals(1 + 10, 11, "Test05 to pass");
    }

    @Test
    void test04() {
        Assert.assertEquals(2 + 12, 14, "Test06 to fail");
    }
}
