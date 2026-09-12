package classes_objetos.projetos.boletimEscolar;

public class Boletim {
    Aluno aluno;
    double nota1;
    double nota2;
    double nota3;

 final static double MEDIA_APROVACAO = 7.0;
 final static double MEDIA_MINIMA_RECUPERACAO = 5.0;


    public double calcularMedia(){
        return (nota1+nota2+nota3) / 3;
    }

    public boolean estaAprovado(){
        return calcularMedia() >= MEDIA_APROVACAO;
    }


    public boolean estaDeRecuperacao(){
        double media = calcularMedia();
        return media >= MEDIA_MINIMA_RECUPERACAO
                && media < MEDIA_APROVACAO;
    }

    public boolean estaReprovado(){
        return calcularMedia() < MEDIA_MINIMA_RECUPERACAO;
    }




    public double calcularNotaNecessaria(){
        double media = calcularMedia();
        if (estaDeRecuperacao()){
            return MEDIA_MINIMA_RECUPERACAO - media;
        }
        return 0.0;
    }


    public void mostrarResultado(){

        double media = calcularMedia();

        System.out.println("------ Resultado Geral ------\n");
        System.out.printf("Nota 1: %.2f%n",nota1);
        System.out.printf("Nota 2: %.2f%n",nota2);
        System.out.printf("Nota 3: %.2f%n",nota3);
        System.out.printf("Média do aluno: %.2f%n",media);
        if (estaAprovado()){
            System.out.println("Situação: Aluno aprovado!");

        }else if (estaDeRecuperacao()){
            System.out.println("Situação: Aluno de recuperação!");
            System.out.printf(
                    "Quanto falta para atingir média %.2f%n: %.2f%n",
                    MEDIA_APROVACAO, calcularNotaNecessaria());

        }else {
            System.out.println("Situação: Aluno reprovado!");
        }
    }
}
