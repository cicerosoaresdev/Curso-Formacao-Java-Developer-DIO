package classes_objetos.projetos.contaDeCarteira;

public class Program {
    public static void main(String[] args) {

        Carteira carteira = new Carteira();

        carteira.proprietario = "Cicero";
        carteira.saldo = 1000.00;
        carteira.limiteDiario = 500.00;
        carteira.totalGastoHoje = 0.0;

        carteira.mostrarResumo();

        System.out.println();

        carteira.adicionarDinheiro(200.00);

        carteira.gastar(1500.00);



        System.out.println();

        carteira.consultarSaldo();

        System.out.println();

        carteira.mostrarResumo();
















    }
}
