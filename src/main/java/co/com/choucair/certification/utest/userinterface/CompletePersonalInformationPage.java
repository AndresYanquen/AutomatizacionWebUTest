package co.com.choucair.certification.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class CompletePersonalInformationPage extends PageObject {

    public static final Target LABEL_FIRST_NAME = Target.the("campo para primer nombre")
            .located(By.id("firstName"));

    public static final Target LABEL_LAST_NAME = Target.the("campo para segundo nombre")
            .located(By.id("lastName"));

    public static final Target LABEL_EMAIL = Target.the("campo para email")
            .located(By.id("email"));

    public static final Target MONTH =  Target.the("campo para email")
            .located(By.id("birthMonth"));

    public static final Target DAY =  Target.the("campo para email")
            .located(By.id("birthDay"));

    public static final Target YEAR =  Target.the("campo para email")
            .located(By.id("birthYear"));

    public static final Target BUTTON_NEXTL =  Target.the("boton siguiente")
            .located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[2]/a"));
}
