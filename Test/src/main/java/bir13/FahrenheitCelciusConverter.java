package bir13;

public class FahrenheitCelciusConverter {

    public double toCelcius(double fahranheit) {
        return (fahranheit - 32) * 5 / 9;
    }

    public double toFahrenheit(double celcius) {
        return (celcius * 9 / 5 + 32);
    }
}
