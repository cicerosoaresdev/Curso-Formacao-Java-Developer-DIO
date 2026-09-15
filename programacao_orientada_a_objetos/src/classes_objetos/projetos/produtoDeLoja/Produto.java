package classes_objetos.projetos.produtoDeLoja;

public class Produto {
    String codigo;
    String nome;
    double preco;
    int quantidadeEmEstoque;

    final double PORCENTAGEM_MINIMA = 0.0;
    final double PORCENTAGEM_MAXIMA = 100.0;


    public double calcularValorEmEstoque() {
        return this.preco * this.quantidadeEmEstoque;
    }

    public double aplicarDesconto(double percentual) {
        if (percentual < PORCENTAGEM_MINIMA || percentual > PORCENTAGEM_MAXIMA) {
            System.out.println("Erro: percentual de desconto inválido.");
            return preco;
        } else {
            double valorDesconto = this.preco * percentual / 100.0;

            System.out.println("Desconto aplicado com sucesso!");

            return this.preco - valorDesconto;
        }

    }

    public void reporEstoque(int quantidade) {
        if (quantidade > 0) {
            this.quantidadeEmEstoque += quantidade;
            System.out.println("Reposição realizada com sucesso!");
        } else {
            System.out.println("Erro:digite uma quantidade positivos");
        }
    }

    public boolean estaDisponivel(){
        return quantidadeEmEstoque > 0;
    }

    public void vender(int quantidade, double percentualConDesconto) {
        if (quantidade <= 0) {
            System.out.println("Erro: a quantidade vendida deve ser positiva.");
            return;
        }
         if (quantidade > this.quantidadeEmEstoque) {
            System.out.println("Estoque insuficiente!");
            return;
        }

         double precoComDesconto = aplicarDesconto(percentualConDesconto);
         double valorTotalVenda = precoComDesconto * quantidade;

            this.quantidadeEmEstoque -= quantidade;
            double valoDaCompra = quantidade * preco;

            System.out.println("Venda realizada com sucesso!");
            System.out.printf(
                    "Quantidade vendida: %d%n",
                    quantidade
            );

        System.out.printf(
                "Valor total da compra:R$ %.2f%n",
                valoDaCompra);
        System.out.printf(
                "Preço original por unidade: R$ %.2f%n",
                this.preco
        );
        System.out.printf(
                "Preço com desconto por unidade: R$ %.2f%n",
                precoComDesconto
        );
        System.out.printf(
                "Valor total da venda: R$ %.2f%n",
                valorTotalVenda
        );

    }


    public void mostrarProduto() {
        System.out.println("---------- Produto ----------");
        System.out.printf("Código: %s%n", this.codigo);
        System.out.printf("Nome: %s%n", this.nome);
        System.out.printf("Preço: R$ %.2f%n", this.preco);
        System.out.printf(
                "Quantidade em estoque: %d%n",
                this.quantidadeEmEstoque);
        System.out.printf(
                "Valor total em estoque: R$ %.2f%n",
                calcularValorEmEstoque()
        );
        System.out.printf(
                "Está disponível? %s%n",
                estaDisponivel() ? "Sim" : "Não"
        );
        System.out.println("-----------------------------");
    }
}


