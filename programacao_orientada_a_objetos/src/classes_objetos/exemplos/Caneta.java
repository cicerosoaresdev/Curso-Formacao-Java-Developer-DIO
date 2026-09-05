package classes_objetos.exemplos;

public class Caneta {
    public static void main(String[] args) {
        ModelCaneta c1 = new ModelCaneta();
        c1.modelo = "Bic";
        c1.cor = "Azul";
        c1.ponta = 0.5;
        c1.tampar();

        c1.status();
        c1.rabiscar();

        ModelCaneta c2 = new ModelCaneta();
        c2.modelo = "Fabel Castel";
        c2.cor = "Preta";
        c2.ponta = 0.7;
        c2.destampar();
        c2.status();


    }
}
