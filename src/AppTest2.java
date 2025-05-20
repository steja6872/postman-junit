import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest2 {

    @Test
    public void testFactorialOfFive() {
        assertEquals(120, App.factorial(5));
    }
}
