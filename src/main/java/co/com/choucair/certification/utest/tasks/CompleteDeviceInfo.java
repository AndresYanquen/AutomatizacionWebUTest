package co.com.choucair.certification.utest.tasks;

import co.com.choucair.certification.utest.model.UTestLoginData;
import co.com.choucair.certification.utest.userinterface.CompleteDeviceInfoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class CompleteDeviceInfo implements Task {
    private UTestLoginData uTestLoginData;

    public CompleteDeviceInfo(UTestLoginData uTestLoginData) {
        this.uTestLoginData = uTestLoginData;
    }

    public static CompleteDeviceInfo aboutDevice(UTestLoginData uTestLoginData) {
        return Tasks.instrumented(CompleteDeviceInfo.class, uTestLoginData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CompleteDeviceInfoPage.OS),
                Click.on(CompleteDeviceInfoPage.OS_ITEM),
                Click.on(CompleteDeviceInfoPage.VERSION),
                Click.on(CompleteDeviceInfoPage.VERSION_ITEM),
                Click.on(CompleteDeviceInfoPage.LENGUAGE),
                Click.on(CompleteDeviceInfoPage.LENGUAGE_ITEM),
                Click.on(CompleteDeviceInfoPage.MOBILE_DEVICE),
                Click.on(CompleteDeviceInfoPage.MOBILE_DEVICE_ITEM),
                Click.on(CompleteDeviceInfoPage.MODEL),
                Click.on(CompleteDeviceInfoPage.MODEL_ITEM),
                Click.on(CompleteDeviceInfoPage.OPERATING_SYSTEM),
                Click.on(CompleteDeviceInfoPage.OPERATING_SYSTEM_ITEM),
                Click.on(CompleteDeviceInfoPage.BUTTON_NEXT_LASTSTEP)

                );

    }
}
