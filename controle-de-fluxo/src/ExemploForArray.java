public class ExemploForArray {
    public static void main(String[] args) {
        String alunos [] = {"Cícero", "Maryanne", "Leia","Thaylla","Alefe"};
        //for na forma nomar
      /*  for (int i = 0; i < alunos.length; i++){
            System.out.println("O aluno no indice i= "+ i +" é "+ alunos[i]);
        }

       */

        // for Abreviado

        for (String aluno : alunos){
            System.out.println("O nome do aluno é: " + aluno);
        }
    }

}
