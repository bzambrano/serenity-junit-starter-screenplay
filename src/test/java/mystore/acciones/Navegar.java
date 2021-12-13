package mystore.acciones;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

/**
 * file packagemystore.acciones
 */
public class Navegar implements Interaction {



    @Override
    @Step("El {0} navega hacia una pagina ")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url(opcionUrl));
    }

    public static Performable hacia(String opcionUrl) {

        //Todo se debe consulta que hace esta linea de condigo por que no es claro lo que se explica en el curso
        return Instrumented.instanceOf(Navegar.class).withProperties(opcionUrl);
    }

    private final String opcionUrl;

    public Navegar(String opcionUrl){
        this.opcionUrl=opcionUrl;

    }
}
