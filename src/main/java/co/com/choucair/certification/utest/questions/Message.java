package co.com.choucair.certification.utest.questions;

import co.com.choucair.certification.utest.userinterface.SetPasswordAndAcceptTermsOfUsePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import org.mockito.stubbing.Answer;

public class Message implements Question<Boolean> {
    private String messageCompleted;

    public Message(String messageCompleted) {
        this.messageCompleted = messageCompleted;
    }

    public static Question<Boolean> isThe(String messageCompleted) {
        return new Message(messageCompleted);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String registro_completo= Text.of(SetPasswordAndAcceptTermsOfUsePage.MESSAGE_COMPLETED).viewedBy(actor).asString();
        if(messageCompleted.equals(registro_completo)){
            result=true;
        }else{
            result = false;
        }

        return result;
    }
}
