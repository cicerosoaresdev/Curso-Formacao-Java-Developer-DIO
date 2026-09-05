package classes_objetos.exemplos;

public class Produto {

    String nome;
    double preco;

    public void mostrarPreco(){
        System.out.printf("O nome do Produto é chamdo de " +
                "%s e seu preço é R$ %.2f%n", nome, preco);
    }

}
