import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest3 {

    @Test
    public void testFactorialOfNegative() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            App.factorial(-3);
        });
        assertEquals("Input must be non-negative", exception.getMessage());
    }
}
