import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTester {
    
    @Test
    public void factorialTester() {
        assertEquals(120, SkillDemo.factorial(4));
    }
}
