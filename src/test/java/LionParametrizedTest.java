import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)

public class LionParametrizedTest {
        @Before
        public void init() {
            MockitoAnnotations.openMocks(this);
        }
        @Mock
        Feline feline;

        private final String sex;
        private final boolean expected;

        public LionParametrizedTest(String sex, boolean expected){
            this.sex = sex;
            this.expected = expected;
        }

        @Parameterized.Parameters(name = "Тестовые данные: {0} {1}") // добавили аннотацию
        public static Object[][] getSexData() {
            return new Object[][] {
                    { "Самец", true},
                    { "Самка", false},
            };
        }

        @Test
        public void testDoesHaveManeReturnBoolean() throws Exception {
            Lion lion = new Lion(sex, feline);
            assertEquals(expected, lion.doesHaveMane());
        }
}
