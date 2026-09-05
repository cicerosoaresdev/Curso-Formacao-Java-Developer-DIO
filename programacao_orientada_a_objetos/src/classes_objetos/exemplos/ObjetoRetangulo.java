package classes_objetos.exemplos;

public class ObjetoRetangulo {
    public static void main(String[] args) {

        Retangulo retangulo = new Retangulo();
        Retangulo retangulo1 = new Retangulo();

        retangulo.largura = 3.0;
        retangulo.altura = 5.0;

        retangulo1.largura = 6.8;
        retangulo1.altura = 4.8;

        System.out.printf("A área do retângulo é : %.2f cm%n", retangulo.calcularArea());
        System.out.printf("O perimetro do retângulo é : %.2f cm%n", retangulo.calcularPerimetro());

    }
}
