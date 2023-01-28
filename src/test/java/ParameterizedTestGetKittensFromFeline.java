import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)

public class ParameterizedTestGetKittensFromFeline {
    Feline feline = new Feline();
    private final int kittensCount;
    private final int expected;

    public ParameterizedTestGetKittensFromFeline(int kittensCount, int expected) {
        this.kittensCount = kittensCount;
        this.expected = expected;
    }

    @Parameterized.Parameters // добавили аннотацию
    public static Object[][] getKittensCountData() {
        return new Object[][] {
                { 1, 1},
                { 10, 10},
        };
    }

    @Test
    public void testGetKittensReturnKittensCount() {
        Assert.assertEquals(expected, feline.getKittens(kittensCount));
    }
}
