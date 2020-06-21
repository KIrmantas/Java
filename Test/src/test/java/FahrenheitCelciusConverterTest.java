import bir13.FahrenheitCelciusConverter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;
import static org.junit.runners.Parameterized.*;

@RunWith(Parameterized.class)

public class FahrenheitCelciusConverterTest {

    @Parameters
    public static Collection<Double[]> fahrAndCels() {
        return Arrays.asList(new Double[][] {
                {356d, 180d}, {212., 100.}, {0., -17.77777777777778}, {32., 0.}
        });
    }

    @Parameter(0)
    public double fahr;

    @Parameter(1)
    public double cels;

    public FahrenheitCelciusConverter FahCel = new FahrenheitCelciusConverter();

    @Test
    public void toCelciusAll() {
        double rez = FahCel.toCelcius(fahr);
        assert Double.compare(rez, cels) == 0;
    }

    @Test
    public void toCelcius() {
        double rez = FahCel.toCelcius(32);
        assert Double.compare(rez, 0.) == 0;
    }

    @Test
    public void toFahrenheit() {
        double rez = FahCel.toFahrenheit(0);
        assertEquals( 32, rez, 0.01) ;
    }
}