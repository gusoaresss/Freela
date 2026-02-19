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

public class ValidadorSenhaTest {

    @Test
    void deveAceitarSenhaValida() {
        ValidadorSenha validador = new ValidadorSenha();
        assertTrue(validador.senhaValida("abc123"));
    }

    @Test
    void deveRejeitarSenhaCurta() {
        ValidadorSenha validador = new ValidadorSenha();
        assertFalse(validador.senhaValida("a1"));
    }

    @Test
    void deveRejeitarSenhaSemNumero() {
        ValidadorSenha validador = new ValidadorSenha();
        assertFalse(validador.senhaValida("abcdef"));
    }

    @Test
    void deveRejeitarSenhaSemLetra() {
        ValidadorSenha validador = new ValidadorSenha();
        assertFalse(validador.senhaValida("123456"));
    }
}
