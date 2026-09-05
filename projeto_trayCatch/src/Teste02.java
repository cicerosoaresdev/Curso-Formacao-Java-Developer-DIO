public class Teste02 {
    public static void main(String[] args) {

        try {

            int resultado = 10 / 0;
        }catch (Exception e){
            System.out.println("Valor 0 no divisor: "+ e);
        }

    }
}
