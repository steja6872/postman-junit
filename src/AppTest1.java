import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest1 {

    @Test
    public void testFactorialOfZero() {
        assertEquals(1, App.factorial(0));
    }

    @Test
    public void testFactorialOfOne() {
        assertEquals(1, App.factorial(1));
    }
}
