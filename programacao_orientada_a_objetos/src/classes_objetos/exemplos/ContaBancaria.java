package classes_objetos.exemplos;

public class ContaBancaria {

    String titular;
    double saldo;

    public double depositar(double valor){
        return this.saldo += valor;
    }

    public double sacar(double valor){
        return this.saldo -= valor;
    }

    public void mostrarSaldo(){
        System.out.printf("Saldo: R$ %.2f%n", saldo);
    }

}
