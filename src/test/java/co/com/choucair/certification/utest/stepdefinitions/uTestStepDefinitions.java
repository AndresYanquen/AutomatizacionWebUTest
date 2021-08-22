package co.com.choucair.certification.utest.stepdefinitions;

import co.com.choucair.certification.utest.model.UTestLoginData;
import co.com.choucair.certification.utest.questions.Message;
import co.com.choucair.certification.utest.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class uTestStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^than Andres wants to sign up in the website UTest$")
    public void thanAndresWantsToSignUpInTheWebsiteUTest()  {
        OnStage.theActorCalled("Andres").wasAbleTo(OpenUp.thePage());

    }

    @When("^he complete the form in the website UTest$")
    public void heCompleteTheFormInTheWebsiteUTest(List<UTestLoginData> uTestLoginData)  {
        OnStage.theActorInTheSpotlight().attemptsTo(JoinToday.onThePage(),
                CompletePersonalInformation.with(uTestLoginData.get(0)),
                CompleteLocationData.inThePlace(uTestLoginData.get(0)),
                CompleteDeviceInfo.aboutDevice(uTestLoginData.get(0)),
                SetPasswordAndAcceptTermsOfUse.forAccount(uTestLoginData.get(0))
                );


    }
    @Then("^he finds the text$")
    public void heFindsTheText(List<UTestLoginData> uTestLoginData)  {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Message.isThe(uTestLoginData.get(0).getMessageCompleted())));


    }



}
