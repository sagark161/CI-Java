import org.testng.Assert;
import org.testng.annotations.Test;

public class TestScenario02 {

    @Test
    void test03() {
        System.out.println("<<Executing Test03>>");
        Assert.assertEquals(2 + 1, 3, "Test03 to PASS");
    }

    @Test
    void test04() {
        System.out.println("<<Executing Test04>>");
        Assert.assertEquals(1 + 1, 2, "Test04 to PASS");
    }
}
