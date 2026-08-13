package Nivel_Iniciante;

import java.util.Locale;
import java.util.Scanner;

public class CalculadoraDeIdade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        //TODO: Calcula a idade aproximada subtraindo o ano de nascimento do ano atual.

        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = input.nextInt();

        System.out.print("Digite o ano atual: ");
        int anoAtual = input.nextInt();

        int idadeAproximada = calcularIdade(anoNascimento, anoAtual);

        System.out.println("Sua idade aproximada é : " + idadeAproximada + " anos");

        input.close();
    }

    public static int calcularIdade(int anoNascimento, int anoAtual){
        return anoAtual - anoNascimento;
    }


}
