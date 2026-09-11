package classes_objetos.exemplos;

public class Caneta {
    public static void main(String[] args) {
        ModelCaneta c1 = new ModelCaneta();
        c1.modelo = "Bic";
        c1.cor = "Azul";
        //c1.ponta = 0.5;
        c1.carga = 80;
       // c1.tampada = false;
        c1.rabiscar();
        c1.status();



    }
}
