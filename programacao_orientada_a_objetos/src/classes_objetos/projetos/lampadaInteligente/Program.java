package classes_objetos.projetos.lampadaInteligente;

public class Program {
    public static void main(String[] args) {


        Lampada lampada = new Lampada();

        lampada.ligar();
        System.out.println("Está ligada? "+lampada.estarLigada());

        lampada.aumentarIntensidade(80);
        System.out.println("Intensidade: "+ lampada.intensidade);

        lampada.modoNoturno();
        System.out.println("Intensidade noturna: "+lampada.intensidade);

        lampada.desligar();
        System.out.println("Está ligada? "+lampada.estarLigada());


    }
}
