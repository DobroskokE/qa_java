import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)

public class LionParametrizedTest {
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
            Lion lion = new Lion(sex);
            assertEquals(expected, lion.doesHaveMane());
        }
}
