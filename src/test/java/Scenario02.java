import org.testng.Assert;
import org.testng.annotations.Test;

public class Scenario02 {

    @Test
    void test03() {
        Assert.assertEquals(1 + 1, 2, "Test03 to pass");
    }

    @Test
    void test04() {
        Assert.assertEquals(1 + 1, 5, "Test04 to fail");
    }
}
