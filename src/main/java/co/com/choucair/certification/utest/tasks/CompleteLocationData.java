package co.com.choucair.certification.utest.tasks;

import co.com.choucair.certification.utest.model.UTestLoginData;
import co.com.choucair.certification.utest.userinterface.CompleteLocationDataPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static co.com.choucair.certification.utest.userinterface.CompleteLocationDataPage.*;
import static co.com.choucair.certification.utest.userinterface.CompletePersonalInformationPage.MONTH;

public class CompleteLocationData implements Task {

    private UTestLoginData uTestLoginData;

    public CompleteLocationData(UTestLoginData uTestLoginData) {
        this.uTestLoginData = uTestLoginData;
    }

    public static CompleteLocationData inThePlace(UTestLoginData uTestLoginData) {
        return Tasks.instrumented(CompleteLocationData.class,uTestLoginData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(uTestLoginData.getCity()).into(CITY),
                Hit.the(Keys.ARROW_DOWN).into(CITY),
                Hit.the(Keys.ENTER).into(CITY),
                Enter.theValue(uTestLoginData.getZip()).into(ZIP),
                Click.on(COUNTRY),
                Click.on(COUNTRY_ITEM),
                Click.on(BUTTON_NEXT_D)



                );

    }
}
