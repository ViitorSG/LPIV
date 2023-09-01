package exe3;

public class convertCelcius {
    public static double celsiusParaFahrenheit(double celsius) {
        double fahrenheit = (celsius * 9/5) + 32;
        return fahrenheit;
    }

    public static double celsiusParaKelvin(double celsius) {
        double kelvin = celsius + 273.15;
        return kelvin;
    }

    public static double celsiusParaReaumur(double celsius) {
        double reaumur = celsius * 4/5;
        return reaumur;
    }

    public static double celsiusParaRankine(double celsius) {
        double rankine = (celsius + 273.15) * 9/5;
        return rankine;
    }
}
