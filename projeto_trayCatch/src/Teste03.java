import java.io.IOException;
import java.net.ServerSocket;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Teste03 {

    public static void limparTela(){
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) throws Exception{

        limparTela();
        exemplo5();


    }

    public static void exemplo1(){
        try {
            String texto = null;
            int tamanho = texto.length();
            System.out.printf("\nTamanho: %d\n", tamanho);
        }catch (NullPointerException e){

            System.out.println(e.getMessage());

        }
        System.out.println("Depois da execeção......");
    }

    public static void exemplo2(){
        try {
            int[] vetor = {0, 1, 2, 3, 4};
            System.out.printf("\nElemento 5: %d\n", vetor[5]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Depois da execeção......");

    }

    public static void  exemplo3(){
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Primeiro número: ");
            int n1 = input.nextInt();
            System.out.print("Segundo número: ");
            int n2 = input.nextInt();
            double res = n1 / n2;
            System.out.printf("\nResultado: %.2f\n", res);
            input.close();
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }

        System.out.println("Depois da execeção......");
    }

    public static void  exemplo4(){

            boolean novoCalculo = false;
            Scanner input = new Scanner(System.in);
            do {
                try {
                System.out.print("Primeiro número: ");
                int n1 = input.nextInt();
                System.out.print("Segundo número: ");
                int n2 = input.nextInt();
                double res = n1 / n2;
                System.out.printf("\nResultado: %.2f\n", res);
                }catch(ArithmeticException e){
                    System.out.println("Não é possivel dividir por zero.");
                }catch(InputMismatchException e){
                    System.out.println("Número inteiro invalido.");
                }catch (Exception e){
                    System.out.println("Ocorreu um exceção imprevista.");
                }
                input.nextLine();
                System.out.print("\nNovo calculo? (S/N): ");
                novoCalculo = input.nextLine().equalsIgnoreCase("S");
            }while (novoCalculo);

            input.close();


        System.out.println("Depois da execeção......");
    }

    public static void exemplo5() throws IOException{
        Scanner input = new Scanner(System.in);
        ServerSocket ss1 = new ServerSocket(7777);
        System.out.println("Porta aberta com sucesso #1");

        try {
            System.out.println("Digite um número: ");
            int x = input.nextInt();
            System.out.println("Número digitado: "+ x);


        }catch (Exception e){
            System.out.println("Número inteiro invalido.");
        }finally{
            ss1.close();
        }

        ServerSocket ss2 = new ServerSocket(7777);
        System.out.println("Porta aberta com sucesso #2");
        ss1.close();

        input.close();

    }






}
