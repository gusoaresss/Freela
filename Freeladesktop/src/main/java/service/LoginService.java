/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

/**
 *
 * @author Thiago
 */
public class LoginService {

    public boolean autenticar(String login, String senha) {

        if (login == null || senha == null) {
            return false;
        }

        if (login.isEmpty() || senha.isEmpty()) {
            return false;
        }

        if (login.equals("admin") && senha.equals("123456")) {
            return true;
        }

        return false;
    }
}
