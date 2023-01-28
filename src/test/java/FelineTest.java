import com.example.Feline;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {
    Feline feline = new Feline();

    @Test
    public void testEatMeatReturnListOfMeat() throws Exception {
        assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test
    public void testGetFamilyReturnFeline() throws Exception {
        String expected = "Кошачьи";
        assertEquals(expected, feline.getFamily());
    }

    @Test
    public void testGetKittensReturnOne() throws Exception {
        int expected = 1;
        assertEquals(expected, feline.getKittens());
    }
}
