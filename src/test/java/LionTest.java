import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)

public class LionTest {
    @Mock
    Feline feline;

    @Test
    public void testGetKittensReturnOne() throws Exception {
        int expected = 1;
        Lion lion = new Lion("Самец",feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        assertEquals(expected, lion.getKittens());
    }

    @Test
    public void testDoesHaveManeException() {
        String sex = "другой";
        String expected = "Используйте допустимые значения пола животного - самей или самка";
        try {
            Lion  lion = new Lion(sex, feline);
            lion.doesHaveMane();
        } catch (Exception exception) {
            assertEquals(expected, exception.getMessage());
        }
    }

    @Test
    public void testGetFoodReturnListOfMeat() throws Exception {
        Lion lion = new Lion("Самка",feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }
}
