package co.com.choucair.certification.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SetPasswordAndAcceptTermsOfUsePage extends PageObject {
    public static final Target PASSWORD =  Target.the("campo para contraseña")
            .located(By.xpath("//input[@id='password']"));

    public static final Target CONFIRM_PASSWORD =  Target.the("campo para confirmar contraseña")
            .located(By.xpath("//input[@id='confirmPassword']"));

    public static final Target STAY_INFORMED =  Target.the("campo para mantenerse informado")
            .located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[4]/label[1]/span[1]"));

    public static final Target TERMS_OF_USE =  Target.the("campo para aceptar terminos de uso")
            .located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[5]/label[1]/span[1]"));

    public static final Target PRIVACY_SECURITY =  Target.the("campo para aceptar politicas de privacidad y seguridad")
            .located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[6]/label[1]/span[1]"));

    public static final Target BUTTON_COMPLETE =  Target.the("boton para completar")
            .located(By.xpath("//span[contains(text(),'Complete Setup')]"));

    public static final Target MESSAGE_COMPLETED =  Target.the("mensaje de registro completado")
            .located(By.xpath("//span[contains(text(),'The last step')]"));
}
