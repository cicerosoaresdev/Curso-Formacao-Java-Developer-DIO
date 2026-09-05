package classes_objetos.exemplos;

public class ObjetoPessoa {
    public static void main(String[] args) {
        //Objeto 01
        ModeloPessoa pessoa = new ModeloPessoa();
        //Objeto 02
        ModeloPessoa pessoa1 = new ModeloPessoa();
        //Caractisticas do objeto 01
        pessoa.nome = "Cícero";
        pessoa.idade = 32;

        //Caractisticas do objeto 02
        pessoa1.nome = "Maryanne";
        pessoa1.idade = 5;

        System.out.println("---- Apresentação Pesoal Simples ----");
        pessoa.apresentar();
        pessoa1.apresentar();




    }
}
