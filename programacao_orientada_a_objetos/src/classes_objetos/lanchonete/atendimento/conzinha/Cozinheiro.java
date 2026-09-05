package classes_objetos.lanchonete.atendimento.conzinha;

import classes_objetos.lanchonete.atendimento.Atendente;

public class Cozinheiro {



    public void pedirParaTrocarGas(Almoxarife meuAmigo){
        meuAmigo.trocarGas();
    }

    public  void pedirIngedientes(Almoxarife almoxarife){
        almoxarife.entregarIngredientes();
    }
}
