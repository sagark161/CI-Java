import org.testng.Assert;
import org.testng.annotations.Test;

public class TestScenario01 {

    @Test
    void test01() {
        System.out.println("<<Executing Test01>>");
        Assert.assertEquals(1 + 1, 4, "Test01 to pass");
    }

    @Test
    void test02() {
        System.out.println("<<Executing Test02>>");
        Assert.assertEquals(1 + 1, 2, "Test01 to Pass");
    }
}
