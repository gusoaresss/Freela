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

public class ValidadorEmailTest {

    @Test
    void deveAceitarEmailValido() {
        ValidadorEmail validador = new ValidadorEmail();
        assertTrue(validador.emailValido("thiago@email.com"));
    }

    @Test
    void deveRejeitarEmailSemArroba() {
        ValidadorEmail validador = new ValidadorEmail();
        assertFalse(validador.emailValido("thiagoemail.com"));
    }

    @Test
    void deveRejeitarEmailSemPonto() {
        ValidadorEmail validador = new ValidadorEmail();
        assertFalse(validador.emailValido("thiago@emailcom"));
    }

    @Test
    void deveRejeitarEmailVazio() {
        ValidadorEmail validador = new ValidadorEmail();
        assertFalse(validador.emailValido(""));
    }
}
