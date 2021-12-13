package mystore;

import mystore.tareas.Decidido;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class CuandoUsuarioSeLoguea {

    Actor actor;

    @Managed
    WebDriver navegador;


    @Before
    public void prepararEscenario(){
        actor = Actor.named("Jorge");

        actor.can(BrowseTheWeb.with(navegador));
    }

    @Test
    public void ingresarAMyAccountCorrectamente(){
        /*
        * El actor se registra en nuestra plataforma de ventas
        * El actor quiere ingresar a su cuenta
        * El actor puede ver el subtitulo de la cuenta My account
        */
        actor.has(Decidido.ingresarConUsuarioYContrasena());

    }

}
