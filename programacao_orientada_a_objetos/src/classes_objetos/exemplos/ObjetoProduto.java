package classes_objetos.exemplos;

public class ObjetoProduto {
    public static void main(String[] args) {

        Produto produto1 = new Produto();
        produto1.nome = "TV";
        produto1.preco = 1523.99;

        produto1.mostrarPreco();

        Produto produto2 = new Produto();
        produto2.nome = "Geladeira";
        produto2.preco = 2499.99;

        produto2.mostrarPreco();
    }
}
