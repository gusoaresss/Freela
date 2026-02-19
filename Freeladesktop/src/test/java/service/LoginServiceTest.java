package service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoginServiceTest {

    @Test
    void deveAutenticarUsuarioCorreto() {
        LoginService service = new LoginService();

        boolean resultado = service.autenticar("admin", "123456");

        assertTrue(resultado);
    }

    @Test
    void naoDeveAutenticarSenhaErrada() {
        LoginService service = new LoginService();

        boolean resultado = service.autenticar("admin", "errada");

        assertFalse(resultado);
    }

    @Test
    void naoDeveAutenticarLoginErrado() {
        LoginService service = new LoginService();

        boolean resultado = service.autenticar("usuario", "123456");

        assertFalse(resultado);
    }
}
