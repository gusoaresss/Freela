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

public class ValidadorLoginTest {

    @Test
    void deveRetornarTrueQuandoCamposPreenchidos() {
        ValidadorLogin validador = new ValidadorLogin();
        boolean resultado = validador.validarCampos("admin", "123");

        assertTrue(resultado);
    }

    @Test
    void deveRetornarFalseQuandoUsuarioVazio() {
        ValidadorLogin validador = new ValidadorLogin();
        boolean resultado = validador.validarCampos("", "123");

        assertFalse(resultado);
    }

    @Test
    void deveRetornarFalseQuandoSenhaVazia() {
        ValidadorLogin validador = new ValidadorLogin();
        boolean resultado = validador.validarCampos("admin", "");

        assertFalse(resultado);
    }
}

