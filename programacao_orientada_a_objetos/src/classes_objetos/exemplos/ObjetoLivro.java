package classes_objetos.exemplos;

public class ObjetoLivro {
    public static void main(String[] args) {

        Livro livro1 = new Livro();
        Livro livro2 = new Livro();

        livro1.titulo = "Dom Casmurro";
        livro1.autor = "Machado de Assis";

        livro2.titulo = "Quando voce chegou";
        livro2.autor = "Gabriela Bortolotto";


        System.out.println("---- Livros Selecionados ----");
        livro1.mostrarInformacoes();
        livro2.mostrarInformacoes();
    }
}
