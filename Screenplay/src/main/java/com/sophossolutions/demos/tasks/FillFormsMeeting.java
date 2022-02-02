package com.sophossolutions.demos.tasks;

import com.sophossolutions.demos.models.Metting;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.Map;

import static com.sophossolutions.demos.userinterface.StarSharpScheduleMeetPage.*;

public class FillFormsMeeting implements Task {

    String numberInscription;
    private Metting metting;

    public FillFormsMeeting(String numberInscription, Metting metting) {
        this.numberInscription = numberInscription;
        this.metting= metting;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue(metting.getLocation()+numberInscription).into(LABEL_FORMS_ENTER_LOCATION_NAME));
        actor.attemptsTo(Enter.theValue(metting.getAddress()+numberInscription).into(LABEL_FORMS_ENTER_LOCATION_ADRRES));
        actor.attemptsTo(Enter.theValue(metting.getLatitud()+numberInscription).into(LABEL_FORMS_ENTER_LOCATION_LATITUDED));
        actor.attemptsTo(Enter.theValue(metting.getLongitude()+numberInscription).into(LABEL_FORMS_ENTER_LOCATION_lOMGITUDE));
        actor.attemptsTo( Click.on(BUTTON_SAVE_DATA));

    }

    public static FillFormsMeeting registration(String numberInscription, Metting metting) {
        return Tasks.instrumented(FillFormsMeeting.class, numberInscription, metting);
    }
}
