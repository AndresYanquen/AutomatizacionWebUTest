package co.com.choucair.certification.utest.tasks;

import co.com.choucair.certification.utest.model.UTestLoginData;
import co.com.choucair.certification.utest.userinterface.CompletePersonalInformationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;

import static co.com.choucair.certification.utest.userinterface.CompletePersonalInformationPage.*;
import static net.serenitybdd.screenplay.Tasks.*;

public class CompletePersonalInformation implements Task {

    private UTestLoginData uTestLoginData;

    public CompletePersonalInformation(UTestLoginData uTestLoginData) {
        this.uTestLoginData = uTestLoginData;
    }

    public static CompletePersonalInformation with(UTestLoginData uTestLoginData) {
        return instrumented(CompletePersonalInformation.class,uTestLoginData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(uTestLoginData.getFirstname()).into(LABEL_FIRST_NAME),
                Enter.theValue(uTestLoginData.getLastname()).into(LABEL_LAST_NAME),
                Enter.theValue(uTestLoginData.getEmail()).into(LABEL_EMAIL),
                SelectFromOptions.byVisibleText(uTestLoginData.getMonth()).from(MONTH),
                SelectFromOptions.byVisibleText(uTestLoginData.getDay()).from(DAY),
                SelectFromOptions.byVisibleText(uTestLoginData.getYear()).from(YEAR),
                Click.on(BUTTON_NEXTL)


                );


    }
}
