package classes_objetos.projetos.lampadaInteligente;

public class Lampada {

    // Atributos

    String marca;
    String cor;
    boolean ligada;
    int intensidade;

    final int INTENSIDADE_MINIMA = 0;
    final int INTENSIDADE_MAXIMA = 100;
    final int INTENCIDADE_MODO_NOTURNO = 20;

    //Métodos


    public void aumentarIntensidade(int aumentar){
         this.intensidade += aumentar;
         if (this.intensidade > INTENSIDADE_MAXIMA){
             this.intensidade = INTENSIDADE_MAXIMA;
         }
    }

    public void diminuirIntensidade(int diminuir){
         this.intensidade -= diminuir;
         if (this.intensidade < INTENSIDADE_MINIMA){
             intensidade = INTENSIDADE_MINIMA;
         }
    }


    public void ligar(){
        this.ligada = true;
    }

    public void desligar(){
        this.ligada = false;
    }

    public boolean estarLigada(){
        return this.ligada;
    }

    public void modoNoturno(){
        this.intensidade = INTENCIDADE_MODO_NOTURNO;
    }

}
