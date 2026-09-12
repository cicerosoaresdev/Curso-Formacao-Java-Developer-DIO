package classes_objetos.projetos.contaDeCarteira;

public class Carteira {
    String proprietario;
    double saldo;
    double limiteDiario;
    double totalGastoHoje;


    public void adicionarDinheiro(double valor) {
        if (valor > 0.0){
            saldo += valor;
            System.out.println("Deposito Realizado!");
        }else {
            System.out.println("Valor do deposito invalido!");
        }

    }

    public boolean podeGastar(double valor){
        return valor > 0.0
                && valor <= saldo
                && valor <= limiteDiario - totalGastoHoje;

    }


    public void gastar(double valor){
        if (podeGastar(valor)) {
            saldo -= valor;
            totalGastoHoje += valor;
            System.out.println("Gasto realizado com sucesso");
        }else {
            System.out.println("Não foi possível realizar o gasto");
        }

    }



    public void consultarSaldo(){
        System.out.printf("Saldo atual: R$ %.2f%n", saldo);

    }

    public double consultarTotalGastoHoje(){
        return totalGastoHoje;
    }

    public double consultarLimiteRestante(){
        return limiteDiario - totalGastoHoje;
    }


    public void mostrarResumo(){

        System.out.println("-------- Resumo da Conta ---------");
        System.out.printf("Proprietário da conta: %s%n", proprietario);
        System.out.printf("Saldo atual: R$ %.2f%n", saldo);
        System.out.printf("Limite diário: R$ %.2f%n", limiteDiario);
        System.out.printf("Total gasto hoje: R$ %.2f%n", totalGastoHoje);
        System.out.printf("Limite restante: R$ %.2f%n", consultarLimiteRestante());
        System.out.println("----------------------------------");

    }
}

