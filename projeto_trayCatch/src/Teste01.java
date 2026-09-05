//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Teste01 {
    public static void main(String[] args) {

        try {

            int x[][] = new int[4][4];

            x[2][2] = 10;
            x[1][2] = 8;
            System.out.println(x[5][1]);

        }catch (Exception e){

            System.out.println("Aconteceu um erro: "+e);

        }
        finally{
            System.out.println("Matriz com try-catch");
        }

    }
}