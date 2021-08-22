package co.com.choucair.certification.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CompleteDeviceInfoPage extends PageObject {

    public static final Target OS =  Target.the("campo para Computador")
            .located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]"));

    public static final Target OS_ITEM =  Target.the("campo para seleccionar Cmputador")
            .located(By.xpath("//div[contains(text(),'Windows')]"));

    public static final Target VERSION =  Target.the("campo para Version de Sistema Operativo")
            .located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/span[1]"));

    public static final Target VERSION_ITEM =  Target.the("Campo para seleccionar version de sistema operativo")
            .located(By.xpath("/html[1]/body[1]/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/ul[1]/li[1]/div[19]/span[1]/div[1]"));

    public static final Target LENGUAGE =  Target.the("campo para Lenguaje")
            .located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[3]/div[2]/div[1]/div[1]/span[1]"));

    public static final Target LENGUAGE_ITEM =  Target.the("campo para item Lenguaje")
            .located(By.xpath("//div[contains(text(),'Spanish')]"));

    public static final Target MOBILE_DEVICE =  Target.the("campo para marca de Movil")
            .located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/span[1]"));

    public static final Target MOBILE_DEVICE_CLICK =  Target.the("campo para marca de Movil")
            .located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/input[1]"));

    public static final Target MOBILE_DEVICE_ITEM =  Target.the("campo para item Marca Movil")
            .located(By.xpath("//div[contains(text(),'Lenovo')]"));

    public static final Target MODEL =  Target.the("campo para modelo")
            .located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[2]/div[2]/div[1]/div[1]/span[1]"));

    public static final Target MODEL_ITEM =  Target.the("campo para item modelo")
            .located(By.xpath("//div[contains(text(),'IdeaPad K1')]"));

    public static final Target OPERATING_SYSTEM =  Target.the("campo para OS")
            .located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[3]/div[2]/div[1]/div[1]/span[1]"));

    public static final Target OPERATING_SYSTEM_ITEM =  Target.the("campo para item OS")
            .located(By.xpath("//div[contains(text(),'Android 4.1.1')]"));

    public static final Target BUTTON_NEXT_LASTSTEP =  Target.the("campo para boton siguiente ultima parte")
            .located(By.xpath("//span[contains(text(),'Next: Last Step')]"));
}
