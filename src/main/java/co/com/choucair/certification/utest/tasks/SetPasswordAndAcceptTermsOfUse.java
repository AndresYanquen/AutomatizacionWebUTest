package co.com.choucair.certification.utest.tasks;

import co.com.choucair.certification.utest.model.UTestLoginData;
import co.com.choucair.certification.utest.userinterface.SetPasswordAndAcceptTermsOfUsePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class SetPasswordAndAcceptTermsOfUse implements Task {
    private UTestLoginData uTestLoginData;

    public SetPasswordAndAcceptTermsOfUse(UTestLoginData uTestLoginData) {
        this.uTestLoginData = uTestLoginData;
    }

    public static SetPasswordAndAcceptTermsOfUse forAccount(UTestLoginData uTestLoginData) {

        return Tasks.instrumented(SetPasswordAndAcceptTermsOfUse.class, uTestLoginData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SetPasswordAndAcceptTermsOfUsePage.PASSWORD),
                Enter.theValue(uTestLoginData.getPassword()).into(SetPasswordAndAcceptTermsOfUsePage.PASSWORD),
                Click.on(SetPasswordAndAcceptTermsOfUsePage.CONFIRM_PASSWORD),
                Enter.theValue(uTestLoginData.getPassword()).into(SetPasswordAndAcceptTermsOfUsePage.CONFIRM_PASSWORD),
                Click.on(SetPasswordAndAcceptTermsOfUsePage.STAY_INFORMED),
                Click.on(SetPasswordAndAcceptTermsOfUsePage.TERMS_OF_USE),
                Click.on(SetPasswordAndAcceptTermsOfUsePage.PRIVACY_SECURITY)

                );
    }
}
