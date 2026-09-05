package classes_objetos.exemplos;

public class ObjetoConta {
    public static void main(String[] args) {

        ContaBancaria conta1 = new ContaBancaria();
        conta1.titular = "Cicero";
        conta1.saldo = 1500.00;

        System.out.println("Na conta do "+conta1.titular +" tem: ");
        conta1.mostrarSaldo();

        System.out.println("Deposito realizado de 500 reais");
        conta1.depositar(500.00);

        System.out.println("Valor atualizado agora:");
        conta1.mostrarSaldo();

        System.out.println("Realizado um saca de 950 reais");
        conta1.sacar(950.00);

        System.out.println("Valor atualizado agora:");
        conta1.mostrarSaldo();






    }
}
