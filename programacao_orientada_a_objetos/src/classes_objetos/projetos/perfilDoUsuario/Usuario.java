package classes_objetos.projetos.perfilDoUsuario;

public class Usuario {
    // Atributos
    String nome;
    String email;
    int idade;
    String cidade;
    String telefone;

    final int IDADE_MINIMA_CONTA = 18;

    //Métodos

    public void apresentar(){
        System.out.println("Olá, sou o "+this.nome);

    }

    public boolean maiorDeIdade(){
        return idade >= IDADE_MINIMA_CONTA;
    }

    public boolean podeCriarConta(){
        return maiorDeIdade();
    }

    public void alterarCidade(String novaCidade){
        this.cidade = novaCidade;

    }

    public void mostrarResumo(){
        System.out.println("\n======= Informações do Usuário ========\n");
        System.out.println("Nome: "+this.nome);
        System.out.println("Email: "+this.email);
        System.out.println("Idade: "+this.idade);
        System.out.println("Cidade: "+this.cidade);
        System.out.println("Telefone: "+this.telefone);

    }


}
