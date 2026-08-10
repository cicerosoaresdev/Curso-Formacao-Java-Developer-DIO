public class Operadores {
    public static void main(String[] args) {
        String concatenacao = "?";
        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);
        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);
        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);
        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);
        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);

        System.out.println("Operadores unitarios");
         int numero = 5;
        System.out.println(numero);
        numero++;
        System.out.println(numero);
        numero--;
        System.out.println(numero);
        ++numero;
        System.out.println(numero);
        --numero;
        System.out.println(numero);
        System.out.println("Negar expreções booleanas");
        boolean variavel = true;
        System.out.println(variavel);
        variavel = !variavel;
        System.out.println(variavel);

        System.out.println("Operador Térnario");
        int a = 6, b = 6;

        /*// EXEMPLO DE CONDICIONAL ULTILIZANDO IF/ELSE
        if(a==b){
        resultado = "verdadeiro";
        }else{
        resultado = "falso";
        }*/

        // EXEMPLO DE CONDICIONAL ULTILIZANDO OPERADOR TERNARIO
        String resultado  = a == b ? "verdadiero" : "falso";
        System.out.println("Resultado: "+resultado);

        System.out.println("OPERADORES RELACIONAIS");
        int numero1 = 1, numero2 = 2;
        boolean simNao = numero1 == numero2;
        System.out.println("igual: "+simNao);
        simNao = numero1 != numero2;
        System.out.println("diferente: "+simNao);
        simNao = numero1 > numero2;
        System.out.println("maior: "+simNao);
        simNao = numero1 < numero2;
        System.out.println("menor: "+simNao);
        simNao = numero1 >= numero2;
        System.out.println("maiorIgual: "+simNao);
        simNao = numero1 <= numero2;
        System.out.println("moneorIgual: "+simNao);







    }
}
