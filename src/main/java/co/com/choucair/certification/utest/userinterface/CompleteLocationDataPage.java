package co.com.choucair.certification.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CompleteLocationDataPage extends PageObject {

    public static final Target CITY =  Target.the("campo para Ciudad")
            .located(By.id("city"));


    public static final Target ZIP =  Target.the("campo para Codigo Postal")
            .located(By.id("zip"));


    public static final Target COUNTRY =  Target.the("campo para País")
            .located(By.xpath("/html[1]/body[1]/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[3]/div[1]/div[4]/div[2]/div[1]/div[1]/div[1]/span[1]/span[2]"));

    public static final Target COUNTRY_ITEM =  Target.the("campo para Pais")
            .located(By.xpath("//div[contains(text(),'Colombia')]"));

    public static final Target BUTTON_NEXT_D =  Target.the("boton siguiente")
            .located(By.xpath("//a[@class='btn btn-blue pull-right']"));
}
