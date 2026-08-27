import java.util.Scanner;

public class Teste {
    // Abaixo segue um exemplo de código que você pode ou não utilizar
        public static void main(String[] args) {
            Scanner leitor = new Scanner(System.in);
            System.out.print("Digite um numero: ");
            int N = leitor.nextInt();
            String jogador1, jogador2;
// TODO: complete os espaços em branco com sua solução para o problema
            for (int i = 0; i < N; i++) {
                System.out.print("Jogador 1: ");
                jogador1 = leitor.next();
                System.out.print("Jogador 2: ");
                jogador2 = leitor.next();
                if(jogador1.equalsIgnoreCase("ataque") &&
                        jogador2.equalsIgnoreCase("ataque")){
                    System.out.println("Aniquilação mutua");
                } else if (jogador1.equalsIgnoreCase("papel") &&
                        jogador2.equalsIgnoreCase("papel")) {
                    System.out.println("Ambos venceram");

                } else if (jogador1.equalsIgnoreCase("pedra") &&
                        jogador2.equalsIgnoreCase("pedra")) {
                    System.out.println("Sem ganhador");
                }else if (jogador1.equalsIgnoreCase("ataque")) {
                    System.out.println("Jogador 1 venceu");

                } else if (jogador2.equalsIgnoreCase("ataque")) {
                    System.out.println("Jogador 2 venceu");

                } else if (jogador2.equalsIgnoreCase("papel")) {
                    System.out.println("Jogador 1 venceu");

                } else {
                    System.out.println("Jogador 2 venceu");

                }

            }
        }
    }

