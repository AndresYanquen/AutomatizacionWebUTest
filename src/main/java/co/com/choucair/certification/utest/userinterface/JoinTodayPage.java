package co.com.choucair.certification.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class JoinTodayPage extends PageObject {

    public static final Target LOGIN_BTN = Target.the("buttons show the form to login")
            .located(By.linkText("Join Today"));




}
