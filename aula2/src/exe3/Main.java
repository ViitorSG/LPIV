package exe3;

public class Main {
    public static void main(String[] args) {
        double temperaturaEmCelsius = 25.0;
        System.out.println(temperaturaEmCelsius + "°C é igual a " + convertCelcius.celsiusParaFahrenheit(temperaturaEmCelsius) + "°F");
        System.out.println(temperaturaEmCelsius + "°C é igual a " + convertCelcius.celsiusParaKelvin(temperaturaEmCelsius) + "K");
        System.out.println(temperaturaEmCelsius + "°C é igual a " + convertCelcius.celsiusParaReaumur(temperaturaEmCelsius) + "Re");
        System.out.println(temperaturaEmCelsius + "°C é igual a " + convertCelcius.celsiusParaRankine(temperaturaEmCelsius) + "Ra");
    }
}
