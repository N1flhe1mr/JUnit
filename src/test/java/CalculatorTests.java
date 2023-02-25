import org.junit.jupiter.api.*;
import org.junit.jupiter.api.function.Executable;
import ru.netology.Calculator;

public class CalculatorTests {
    Calculator calculator;

    @BeforeEach
    public void beforeEachTest() {
        calculator = new Calculator();
    }

    @AfterEach
    public void afterEachTest() {
        calculator = null;
    }

    @Test
    public void testPlus() {
        // given:
        final int a = 10, b = 1, expected = 11;
        // when:
        int result = calculator.plus.apply(a, b);
        // then:
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testMinus() {
        // given:
        final int a = 10, b = 1, expected = 9;
        // when:
        int result = calculator.minus.apply(a, b);
        // then:
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testMultiply() {
        // given:
        final int a = 10, b = 1, expected = 10;
        // when:
        int result = calculator.multiply.apply(a, b);
        // then:
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testDivide() {
        // given:
        final int a = 10, b = 1, expected = 10;
        // when:
        int result = calculator.divide.apply(a, b);
        // then:
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testDivideByZeroWithNoException() {
        // given:
        final int a = 10, b = 1;
        // when:
        Executable executable = () -> calculator.divide.apply(a, b);
        // then:
        Assertions.assertDoesNotThrow(executable);
    }
}
