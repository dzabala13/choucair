package com.sophossolutions.demos.tasks;

import com.sophossolutions.demos.models.Metting;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

import java.util.Map;
import java.util.Random;

import static com.sophossolutions.demos.userinterface.StarSharpScheduleMeetPage.*;

public class ScheduleNewMeeting implements Task {
   private Metting metting;

    public ScheduleNewMeeting(Metting metting) {
        this.metting =metting;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        int min = 1;
        int max = 10000;
        String random = String.valueOf((int)(Math.random()*(max-min+1)+min)) +(char)(new Random().nextInt(26) + 'a');


        actor.attemptsTo( Click.on(LABEL_MENU_MEETING));
        actor.attemptsTo( Click.on(LABEL_SUBMENU_MEETINGS));
        actor.attemptsTo( Click.on(BUTTON_NEW_MEETING));
        actor.attemptsTo(Enter.theValue(metting.getMeetingName()).into(LABEL_MEETING_NAME));
        actor.attemptsTo(Enter.theValue(metting.getMeetingNumber()).into(LABEL_MEETING_NUMBER));

        actor.attemptsTo(Enter.theValue(metting.getStarDateTimeMeeting()).into(SELECT_START_DATE));
        actor.attemptsTo(SelectFromOptions.byValue(metting.getStarDateMeeting()).from(SELECT_START_DATE_TIME));
        actor.attemptsTo(Enter.theValue(metting.getEndDateTimeMeeting()).into(SELECT_END_DATE));
        actor.attemptsTo(SelectFromOptions.byValue(metting.getEndDateMeeting()).from(SELECT_START_DATE_TIME));

        actor.attemptsTo( Click.on(DROP_DOWN_LOCATION));
        actor.attemptsTo(Enter.theValue(metting.getLocation()+random).into(LABEL_ENTER_LOCATION));
        actor.attemptsTo(Hit.the(Keys.ENTER).into(LABEL_ENTER_LOCATION));
        actor.attemptsTo(FillFormsMeeting.registration(random ,metting));

        actor.attemptsTo( Click.on(DROP_DOWNL_UNIT));
        actor.attemptsTo(Enter.theValue(metting.getNameBusinnesUnit()).into(LABEL_ENTER_UNIT));
        actor.attemptsTo(Hit.the(Keys.ENTER).into(LABEL_ENTER_UNIT));

        actor.attemptsTo( Click.on(DROP_DOWN_ORGANIZATE_BY));
        actor.attemptsTo(Enter.theValue(metting.getTitle()+random).into(LABEL_ENTER_ORGANIZATE_BY));
        actor.attemptsTo(Hit.the(Keys.ENTER).into(LABEL_ENTER_ORGANIZATE_BY));
        actor.attemptsTo(FillForms.registration(random ,metting));

        actor.attemptsTo( Click.on(DROP_DOWN_REPORTER));
        actor.attemptsTo(Enter.theValue(metting.getTitle()+random +"2").into(LABEL_ENTER_REPORTER));
        actor.attemptsTo(Hit.the(Keys.ENTER).into(LABEL_ENTER_REPORTER));
        actor.attemptsTo(FillForms.registration(random +"2",metting));

        actor.attemptsTo( Click.on(DROP_DOWN_CONTACT));
        actor.attemptsTo(Enter.theValue(metting.getTitle()+random +"3").into(LABEL_ENTER_CONTACT));
        actor.attemptsTo(Hit.the(Keys.ENTER).into(LABEL_ENTER_CONTACT));
        actor.attemptsTo(FillForms.registration(random +"3",metting));


        actor.attemptsTo( Click.on(DROP_DOWN_MEETING_TYPE));
        actor.attemptsTo(Enter.theValue(metting.getMeetingNumber()+random).into(LABEL_MEETING_TYPE));
        actor.attemptsTo(Hit.the(Keys.ENTER).into(LABEL_MEETING_TYPE));
        actor.attemptsTo(Enter.theValue(metting.getMeetingNumber()+random).into(LABEL_FORMS_NAME));
        actor.attemptsTo( Click.on(BUTTON_SAVE_DATA));

        actor.attemptsTo( Click.on(BUTTON_SAVE_MEETING));
    }

    public static ScheduleNewMeeting registrationMeeting(Metting metting) {
        return Tasks.instrumented(ScheduleNewMeeting.class,metting);
    }
}
