package classes_objetos.exemplos;

public class Temperatura {
    public static void main(String[] args) {

        Termometro temperatura = new Termometro();

        temperatura.celsius = 38.0;
        System.out.printf("Temperatura em graus celsius: %.2f%n", temperatura.celsius);
        System.out.printf("Fica em Fahrenheit: %.2f%n",temperatura.emFahrenheit());


        System.out.println("O tempo esquentou.");
        temperatura.aquecer(9.0);



        System.out.printf("Temperatura em graus celsius: %.2f%n", temperatura.celsius);
        System.out.printf("Fica em Fahrenheit: %.2f%n",temperatura.emFahrenheit());



    }
}
