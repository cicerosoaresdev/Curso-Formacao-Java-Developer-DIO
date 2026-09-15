package classes_objetos.projetos.produtoDeLoja;

public class Loja {
    public static void main(String[] args) {
        Produto produto = new Produto();

        produto.nome = "TV";
        produto.codigo = "52364";
        produto.preco = 1399.99;
        produto.quantidadeEmEstoque = 25;

        produto.mostrarProduto();

        System.out.println();

        produto.reporEstoque(5);

        produto.vender(3,25);

        System.out.println();

    }
}
