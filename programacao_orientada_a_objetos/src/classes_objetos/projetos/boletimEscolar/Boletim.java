package classes_objetos.projetos.boletimEscolar;

public class Boletim {
    Aluno aluno;
    double nota1;
    double nota2;
    double nota3;

    final double NOTA_MEDIA = 7.0;
    final double NOTA_MINIMA = 5.0;


    public double calcularMedia(){
        return (nota1+nota2+nota3) / 3;
    }

    public boolean estaAprovado(){
        return calcularMedia() >= NOTA_MEDIA;
    }

    public boolean estaDeRecuperacao(){
        return calcularMedia() >= NOTA_MINIMA;
    }

    public double calcularNotaNecessaria(){
        if (estaAprovado() == false){
            return NOTA_MEDIA - calcularMedia();
        }
        return 0.0;
    }


    public void mostrarResultado(){
        System.out.println("------ Resultado Geral ------\n");
        System.out.printf("Média do Aluno: %.2f%n",calcularMedia());
        if (estaAprovado() == true){
            System.out.println("Aluno Aprovado!");

        }else if (estaDeRecuperacao() == true){
            System.out.println("Aluno de Recuperação!");
            System.out.printf("Quanto falta para atingir média: %.2f%n", calcularNotaNecessaria());

        }else {
            System.out.println("Aluno Reprovado!");
        }
    }
}
