package co.com.choucair.certification.maloneydavid.stepdefinitions;
import co.com.choucair.certification.maloneydavid.model.AcademyChoucairData;
import co.com.choucair.certification.maloneydavid.tasks.Login;
import co.com.choucair.certification.maloneydavid.tasks.OpenUp;
import co.com.choucair.certification.maloneydavid.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import co.com.choucair.certification.maloneydavid.questions.Answer;

import java.util.List;

public class  ChoucairAcademyStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^that brandon wants to learn automation at the academy Choucair$")
    public void thatBrandonWantsToLearnAutomationAtTheAcademyChoucair(List<AcademyChoucairData> LstAcademyChoucairData)
    throws Exception{
        OnStage.theActorCalled("Brandon").wasAbleTo(OpenUp.thePage(), (Login.onThePage(LstAcademyChoucairData.get(0).getStrUser(),LstAcademyChoucairData.get(0).getStrPassword())));
    }

    @When("^he search fot the course$")
    public void heSearchFotTheCourseRecursosAutomatizacionBancolombia(List<AcademyChoucairData> LstAcademyChoucairData)
            throws Exception{
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(LstAcademyChoucairData.get(0).getStrCourse()));

    }

    @Then("^he finds the course called recources$")
    public void heFindsTheCourseCalledRecourcesRecursosAutomatizacionBancolombia(List<AcademyChoucairData> LstAcademyChoucairData)
            throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(LstAcademyChoucairData.get(0).getStrCourse())));
    }
}
