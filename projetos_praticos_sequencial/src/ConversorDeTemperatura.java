import java.util.Locale;
import java.util.Scanner;

public class ConversorDeTemperatura {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        //TODO: Recebe um temperatura em Celsius e converta para as demais.

        System.out.print("Digite a temperatura atual em Celsius: ");
        double temperaturaCelsius = input.nextDouble();

        double temperaturaFahrenheit = converterParaFahrenheit(temperaturaCelsius);
        double temperaturaKelvin = converterParaKelvin(temperaturaCelsius);

        System.out.printf("A temperatura de %.2f graus Celsius convertida em Fahrenheit é igual a: %.2f graus.%n",
                temperaturaCelsius,
                temperaturaFahrenheit);

        System.out.printf("A temperatura de %.2f graus Celsius convertida em Kelvin é igual a: %.2f graus.%n",
                temperaturaCelsius,
                temperaturaKelvin);

        input.close();
    }

    public static double converterParaFahrenheit(double temperaturaCelsius){
        return temperaturaCelsius * 9.0 / 5.0 + 32.0;
    }

    public static double converterParaKelvin(double temperaturaCelsius){
        return temperaturaCelsius + 273.15;
    }
}
