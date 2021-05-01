package utestreto.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import utestreto.models.UtestData;
import utestreto.questions.Answer;
import utestreto.tasks.*;

import java.util.List;


public class UtestStepDefinition {
    @Before
    public void setStage(){ OnStage.setTheStage(new OnlineCast());}

    @Given("^Then the user wants to register a new user to Utest$")
    public void ThentheuserwantstoregisteranewusertoUtest(){
        OnStage.theActorCalled("Jean").wasAbleTo(OpenUp.thePage());
    }

    @When("^He enters the data of the new user to the form$")
    public void Heentersthedataofthenewusertotheform(List<UtestData> utestData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SignUpStep1.onThePageStep1(utestData.get(0).getStrFirstName(),utestData.get(0).getStrLastName(), utestData.get(0).getStrEmail(),utestData.get(0).getStrMonth(), utestData.get(0).getStrDay(),utestData.get(0).getStrYear()),
                SignUpStep2.onThePageStep2(utestData.get(0).getStrCity(), utestData.get(0).getStrPostal()),
                SignUpStep3.onThePageStep3(),
                SignUpStep4.onThePageStep4(utestData.get(0).getStrPassword())
        );
    }

    @Then("^The user a welcome message to Utest$")
    public void TheuserawelcomemessagetoUtest(){
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe("Complete Setup")));
    }
}
