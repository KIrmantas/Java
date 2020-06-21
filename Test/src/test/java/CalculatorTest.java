import bir13.Calculator;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.Random;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

public class CalculatorTest {

//    @Mock
    private Calculator calc;
    private Calculator spyCalc;

    @Before
    public void setup() {
        System.out.println("Initializing");
//         calc = mock(bir13.Calculator.class);   // mok
        calc = new Calculator();
        spyCalc = spy(calc);
        when(spyCalc.add(3, 5)).thenReturn(123);
        when(spyCalc.add(1, 2)).thenReturn(2345);
    }


//    public bir13.Calculator calc;

//    @Before
//    public void  init() {  // pavadinimas nesvarbus
//        System.out.println("Initializing");
//        calc = new bir13.Calculator(); // sukuria klase, kurios nereikia aprasyti visuose testuose
//    }

    @Test
    public void add() {
//        bir13.Calculator calc = new bir13.Calculator();
        int result = spyCalc.add(3, 5);
//        assert  rezult == 8;
        assertEquals("Klaida: ", 8, result);
    }

    @Test
    public void sub() {
//        bir13.Calculator calc = new bir13.Calculator();
        int result = calc.sub(5, 3);
//        assert  rezult == 2;
        assertEquals(2, result);
    }

    @Test
    public void multiply() {
        int result = calc.multiply(5, 3);
//        assert  rezult == 2;

        assertEquals(15, result);
    }

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void shouldThrowExceptionWhenDividingBy0() {
// give
        expectedException.expect(ArithmeticException.class);
        expectedException.expectMessage("/ by zero");
        Calculator calculator = new Calculator();
        int number = new Random().nextInt();
// when
        calculator.divide(number, 0);
// then
// should throw expected exception
    }
    @Test
    public void divide() {
        int result = calc.divide(5, 3);
//        assert  rezult == 2;
        assertEquals(1, result);

    }


}