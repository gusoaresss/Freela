/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Thiago
 */
public class ValidadorLogin {

    public boolean validarCampos(String usuario, String senha) {
        if (usuario == null || usuario.isEmpty()) {
            return false;
        }

        if (senha == null || senha.isEmpty()) {
            return false;
        }

        return true;
    }
}


