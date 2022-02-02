package com.sophossolutions.demos.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.sophossolutions.demos.userinterface.StarSharpHomePage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotPresent;

public class RegisterUnitBussines implements Task {

    private String nameBussinesnit;

    public RegisterUnitBussines(String nameBussinesnit) {
        this.nameBussinesnit = nameBussinesnit;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo( Click.on(LABEL_MENU_ORGANIZATION));
        actor.attemptsTo( Click.on(LABEL_MENU_BUSSINES_UNIT));
        actor.attemptsTo( Click.on(BUTTON_ADD_BUSSINES_UNIT));
        actor.attemptsTo(Enter.theValue(nameBussinesnit).into(LABEL_INPUT_NAME_BUSSINES));
        actor.attemptsTo( Click.on(SAVE_BUSSINES_UNIT));

    }

    public static RegisterUnitBussines registration(String nameBussinesnit) {
        return Tasks.instrumented(RegisterUnitBussines.class, nameBussinesnit);
    }
}
