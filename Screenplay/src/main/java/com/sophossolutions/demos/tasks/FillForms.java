package com.sophossolutions.demos.tasks;

import com.sophossolutions.demos.models.Metting;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.Map;

import static com.sophossolutions.demos.userinterface.StarSharpScheduleMeetPage.*;
import static com.sophossolutions.demos.userinterface.StarSharpScheduleMeetPage.BUTTON_SAVE_DATA;

public class FillForms implements Task {

    String numberInscription;
    private Metting metting;

    public FillForms(String numberInscription, Metting metting) {
        this.numberInscription = numberInscription;
        this.metting = metting;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue(metting.getTitle()+numberInscription).into(LABEL_FORMS_ENTER_ORGANIZATE_BY_TITTLE));
        actor.attemptsTo(Enter.theValue(metting.getFirstName()+numberInscription).into(LABEL_FORMS_ENTER_ORGANIZATE_BY_FIRST_NAME));
        actor.attemptsTo(Enter.theValue(metting.getLastName()+numberInscription).into(LABEL_FORMS_ENTER_ORGANIZATE_BY_LAST_NAME));
        actor.attemptsTo(Enter.theValue(metting.getEmail()).into(LABEL_FORMS_ENTER_ORGANIZATE_BY_EMAIL));
        actor.attemptsTo(Enter.theValue(metting.getMeetingNumber()+numberInscription).into(LABEL_FORMS_ENTER_ORGANIZATE_BY_ENTITRY));
        actor.attemptsTo(Click.on(LABEL_FORMS_ENTER_ORGANIZATE_BY_USER_DROP_DOWN));
        actor.attemptsTo(Click.on(LABEL_FORMS_ENTER_ORGANIZATE_BY_USER_SELECT));
        actor.attemptsTo(Click.on(BUTTON_SAVE_DATA));

    }

    public static FillForms registration(String numberInscription, Metting metting) {
        return Tasks.instrumented(FillForms.class, numberInscription, metting);
    }
}
