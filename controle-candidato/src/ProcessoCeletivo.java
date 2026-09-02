import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoCeletivo {
    public static void main(String[] args) {

        System.out.println("\n----- Processo seletivo -----\n");
        String [] candidatos = {"FELIPE", "MARIA", "JULIA", "PAULO", "AUGUSTO"};
        for (String canditado: candidatos) {
            entrandoEmContato(canditado);
        }

    }
    // CASE 04

    public static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando){
                tentativasRealizadas++;
            }else {
                System.out.println("CONTATO REALIZADO COM SUCESSO");
            }


        }while (continuarTentando && tentativasRealizadas < 3);

        if (atendeu){
            System.out.println("CONSEGUIMOS CONTATO COM "+candidato+" NA "+ tentativasRealizadas +" TENTATIVA");
        }else {
            System.out.println("NÃO CONSEGUIMOS CONTATO COM "+ candidato + " NÚMERO MAXIMO TENTATIVAS "+ tentativasRealizadas +" REALIZADAS");
        }
    }



    // metodo auxiliar
    public static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    // CASE 03
    public static void imprimirSelecionados(){
        String [] candidatos = {"FELIPE", "MARIA", "JULIA", "PAULO", "AUGUSTO"};
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

        for (int indice = 1; indice < candidatos.length; indice++){
            System.out.println("O candidato de nº"+ indice +" é "+ candidatos[indice]);

        }

        }



    // CASE 02
    public static void  selecaoCandidatos(){
        String [] candidatos = {"FELIPE", "MARIA", "JULIA", "PAULO", "AUGUSTO",
                                "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};
        int cadidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while(cadidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido =valorPretendido();

            System.out.printf("O candidato %s solicitou este salário: %.2f%n",candidato,salarioPretendido);
            if (salarioBase >= salarioPretendido){
                System.out.printf("O cadidato %s foi selecionado para a vaga%n",candidato);
                cadidatosSelecionados ++;
            }
            candidatoAtual++;
        }
    }
    // CASE 01 - Analisando can
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800.0, 2200.0);
    }

    public static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CADIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        }else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");

        }


    }
}
