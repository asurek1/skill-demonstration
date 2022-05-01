import static org.junit.Assert.*;
import org.junit.*;  

public class SkillDemoTester {

    @Test
    public void testOne() {
        assertEquals(5, SkillDemo.multiply(2, 3));
    }
}
