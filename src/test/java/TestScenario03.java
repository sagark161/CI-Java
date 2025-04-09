import org.testng.Assert;
import org.testng.annotations.Test;

public class TestScenario03 {

    @Test
    void test05() {
        Assert.assertEquals(1 + 10, 11, "Test05 to pass");
    }

    @Test
    void test06() {
        Assert.assertEquals(2 + 10, 14, "Test06 to fail");
    }
}
