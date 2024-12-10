import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculateIndexTest {

    @Test
    public void testCalculateIndex() {
        int len = 2;

        assertEquals(1, CustomHashMap.calculateIndex(Integer.valueOf(1), len));
        assertEquals(1, CustomHashMap.calculateIndex(Integer.valueOf(0), len));
        assertEquals(0, CustomHashMap.calculateIndex(Integer.valueOf(-1), len));
    }
}