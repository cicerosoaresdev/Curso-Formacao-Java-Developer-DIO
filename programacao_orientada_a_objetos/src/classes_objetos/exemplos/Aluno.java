package classes_objetos.exemplos;

public class Aluno {

    String nome;
    double nota;

    public void mostrarSituacao(){
        if (nota >= 7.0){
            System.out.println("Aprovado!");
        }else {
            System.out.println("Reprovado!");
        }

    }


}
