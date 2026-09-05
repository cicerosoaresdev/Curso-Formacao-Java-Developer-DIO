package classes_objetos.exemplos;

public class Termometro {
    double celsius;

    public double emFahrenheit(){
        return celsius * (9.0 / 5.0) + 32.0;
    }

    public double aquecer(double graus){
        return celsius += graus;

    }

}
