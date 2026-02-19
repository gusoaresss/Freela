/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Thiago
 */
public class ValidadorSenha {

    public boolean senhaValida(String senha) {

        if (senha == null) {
            return false;
        }

        if (senha.length() < 6) {
            return false;
        }

        boolean temLetra = false;
        boolean temNumero = false;

        for (char c : senha.toCharArray()) {
            if (Character.isLetter(c)) {
                temLetra = true;
            }
            if (Character.isDigit(c)) {
                temNumero = true;
            }
        }

        return temLetra && temNumero;
    }
}
