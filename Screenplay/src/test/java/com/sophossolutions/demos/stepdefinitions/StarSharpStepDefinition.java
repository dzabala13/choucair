package com.sophossolutions.demos.stepdefinitions;

import com.sophossolutions.demos.models.Metting;
import com.sophossolutions.demos.models.UserStarSharp;
import com.sophossolutions.demos.tasks.Login;
import com.sophossolutions.demos.tasks.RegisterUnitBussines;
import com.sophossolutions.demos.tasks.ScheduleNewMeeting;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.questions.WebElementQuestion;

import java.util.Map;
import java.util.Objects;

import static com.sophossolutions.demos.userinterface.StarSharpLoginPage.*;
import static com.sophossolutions.demos.userinterface.StarSharpScheduleMeetPage.LABEL_FORMS_NAME;
import static com.sophossolutions.demos.userinterface.StarSharpScheduleMeetPage.ROW_MEETING;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class StarSharpStepDefinition {

    @Before
    public void setup() {
        setTheStage(new OnlineCast());
    }

    @Given("{string} desea ir a la pagina de {string}")
    public void deseaIrALaPaginaDe(String actorName, String url) {
        theActorCalled(actorName).wasAbleTo(Open.url(url));
    }

    @Given("Realizar la autenticacion en la pagina")
    public void realizarLaAutenticacionEnLaPagina(UserStarSharp userStarSharp) {
        theActorInTheSpotlight().attemptsTo(Login.in(userStarSharp.getName(), userStarSharp.getPassword(),
                LABEL_USER, LABEL_PASSWORD, BTN_LOGIN));
    }

    @When("Crear un tipo de Business Unit")
    public void crearUnTipoDeBusinessUnit(Map<String, String> dataTable) {

        theActorInTheSpotlight().attemptsTo(RegisterUnitBussines.registration(dataTable.get("nameBusinnesUnit")));

    }
    @When("Programar una nueva reunion")
    public void programarUnaNuevaReunion(Metting metting) {
        theActorInTheSpotlight().attemptsTo(ScheduleNewMeeting.registrationMeeting(metting));
    }
    @Then("validar que la reunion sea creada correctamente")
    public void validarQueLaReunionSeaCreadaCorrectamente() {
        theActorInTheSpotlight().should(seeThat(WebElementQuestion.the(ROW_MEETING)));
    }

}
