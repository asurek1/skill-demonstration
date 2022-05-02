import static org.junit.Assert.*;
import org.junit.*;  

public class SkillDemoTester {

    @Test
    public void testOne() {
        assertEquals(6, SkillDemo.multiply(2, 3));
    }
}
