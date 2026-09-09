package classes_objetos.Exercicios.Perfio_do_Usuario;

public class Usuario {
    // Atributos
    String nome;
    String email;
    int idade;
    String cidade;
    String telefone;

    //Métodos

    public void aprensentar(){
        System.out.println("Olá, sou o "+this.nome);

    }

    public boolean maiorDeIdade(){
        if (this.idade >= 18){
            return true;
        }else {
            return false;
        }
    }

    public void mostraResulmo(){
        System.out.println("\n======= Informações do Usúario ========\n");
        System.out.println("Nome: "+this.nome);
        System.out.println("Email: "+this.email);
        System.out.println("Idade: "+this.idade);
        System.out.println("Cidade: "+this.cidade);
        System.out.println("Telefone: "+this.telefone);

    }


}
