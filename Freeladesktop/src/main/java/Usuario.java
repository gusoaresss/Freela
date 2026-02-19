/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Thiago
 */
public class Usuario {

    private String nome;
    private String email;
    private String senha;

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public boolean cadastroValido() {

        ValidadorEmail validadorEmail = new ValidadorEmail();
        ValidadorSenha validadorSenha = new ValidadorSenha();

        if (nome == null || nome.isEmpty()) {
            return false;
        }

        if (!validadorEmail.emailValido(email)) {
            return false;
        }

        if (!validadorSenha.senhaValida(senha)) {
            return false;
        }

        return true;
    }
}

