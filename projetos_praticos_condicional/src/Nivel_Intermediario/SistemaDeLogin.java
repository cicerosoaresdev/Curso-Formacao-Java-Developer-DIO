package Nivel_Intermediario;

import java.util.Locale;
import java.util.Scanner;

public class SistemaDeLogin {

    private static final String USUARIO_CADASTRO = "cicero";
    private static final String SENHA_CADASTRO = "T94l25";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\n======Informe suas credenciais abaixo=====\n");
        System.out.print("Usuário: ");
        String usuario = input.nextLine();

        System.out.print("Senha: ");
        String senha = input.nextLine();

        System.out.println("\n");
        verificarCredenciais(usuario, senha);
        System.out.println("\n");



        input.close();
    }
    public static void verificarCredenciais(String usuario, String senha){

        if (usuario == null || usuario.isEmpty() || senha == null || senha.isEmpty()){
            System.out.println("Erro: A campos Vazios");
        } else if (USUARIO_CADASTRO.equals(usuario) && SENHA_CADASTRO.equals(senha)){
            System.out.print("Bem-vindo! Welcome!");

        }else if (!USUARIO_CADASTRO.equals(usuario)){
            System.out.println("Atenção!");
            System.out.print("Usuario incorreto");
        }else {
            System.out.println("Atenção!");
            System.out.print("Senha incorreta");
        }

    }

}

