/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Thiago
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UsuarioTest {

    @Test
    void deveAceitarCadastroValido() {
        Usuario usuario = new Usuario("Thiago", "thiago@email.com", "abc123");
        assertTrue(usuario.cadastroValido());
    }

    @Test
    void deveRejeitarNomeVazio() {
        Usuario usuario = new Usuario("", "thiago@email.com", "abc123");
        assertFalse(usuario.cadastroValido());
    }

    @Test
    void deveRejeitarEmailInvalido() {
        Usuario usuario = new Usuario("Thiago", "thiagoemail.com", "abc123");
        assertFalse(usuario.cadastroValido());
    }

    @Test
    void deveRejeitarSenhaFraca() {
        Usuario usuario = new Usuario("Thiago", "thiago@email.com", "123");
        assertFalse(usuario.cadastroValido());
    }
}

