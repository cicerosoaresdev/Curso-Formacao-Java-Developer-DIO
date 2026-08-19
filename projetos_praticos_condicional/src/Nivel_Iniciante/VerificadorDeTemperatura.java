package Nivel_Iniciante;

import java.util.Locale;
import java.util.Scanner;

public class VerificadorDeTemperatura {

    private static final double LIMITE_CALOR_FORTE = 32.0;
    private static final double LIMITE_TEMPERATURA_AMENA = 22.0;
    private static final double LIMITE_FRIO_MODERADO = 10.0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        //TODO:Verifique a faixa de temperatura e classifique.

        System.out.print("Digite uma temperatura em graus Celsius: ");
        if (!input.hasNextDouble()){
            System.out.println("Entrada inválida. Digite apenas números.");
            input.close();
            return;
        }
        double temperatura = input.nextDouble();

        classificarTemperatura(temperatura);

        input.close();
    }

    public static void classificarTemperatura(double temperatura){
        String faixa;
        if (temperatura > LIMITE_CALOR_FORTE ){
            faixa = "Calor Forte";
            System.out.println("A temperatura está "+ temperatura + " graus");
            System.out.println("Atenção! "+faixa+". Use tecidos leves como linho e algodão");
        }else if (temperatura >= LIMITE_TEMPERATURA_AMENA){
            faixa = "Temperatura Amena!";
            System.out.println("A temperatura está "+ temperatura + " graus");
            System.out.println("Atenção! "+faixa+". Use calças e camisas de manga longa leves.");
        } else if (temperatura >= LIMITE_FRIO_MODERADO){
            faixa = "Frio Moderado!";
            System.out.println("A temperatura está "+ temperatura + " graus");
            System.out.println("Atenção! "+faixa+". Aposte em tricôs, suéteres médios ou moletons.");
        }else{
            faixa = "Frio Intenso!";
            System.out.println("A temperatura está "+ temperatura + " graus");
            System.out.println("Atenção! "+faixa+".adote o método de camadas " +
                    "com blusa térmica e casaco pesado.");
        }

    }


}
