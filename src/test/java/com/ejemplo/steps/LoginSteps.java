package com.ejemplo.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.*;

public class LoginSteps {

    private String usuario;
    private String clave;
    private String mensaje;

    @Given("un usuario con usuario {string} y clave {string}")
    public void un_usuario_con_usuario_y_clave(String u, String c) {
        this.usuario = u;
        this.clave = c;
    }

    @When("intenta iniciar sesión")
    public void intenta_iniciar_sesion() {
        // Simulación: juan/1234 válido, resto inválido
        if ("juan".equals(usuario) && "1234".equals(clave)) {
            mensaje = "Bienvenido " + usuario;
        } else {
            mensaje = "Credenciales inválidas";
        }
    }

    @Then("el sistema muestra {string}")
    public void el_sistema_muestra(String esperado) {
        assertEquals(esperado, mensaje);
    }
}