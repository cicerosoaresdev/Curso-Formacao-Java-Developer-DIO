package classes_objetos.lanchonete;

import classes_objetos.lanchonete.atendimento.Atendente;
import classes_objetos.lanchonete.atendimento.conzinha.Almoxarife;

public class Estabelecimento {
    public static void main(String[] args) {

        Almoxarife almoxarife = new Almoxarife();
        //ações que não precisam estarem dísponiveis para toda a aplicação
        almoxarife.controlarEntrada();
        almoxarife.controlarSaida();


        Atendente atendente = new Atendente();
        atendente.pegarLancheCozinha();
        atendente.receberPagamento();
        atendente.servindoMesa();



    }
}
