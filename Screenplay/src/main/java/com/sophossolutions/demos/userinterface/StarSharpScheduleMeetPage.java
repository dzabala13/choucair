package com.sophossolutions.demos.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class StarSharpScheduleMeetPage {

    public static final Target LABEL_MENU_MEETING =
            Target.the("Label para visualizar el submenu de munu Metting ").
                    located(By.xpath("//*[@class=\"s-sidebar-link-text\" and contains(text(),\"Meeting\")]"));

    public static final Target LABEL_SUBMENU_MEETINGS =
            Target.the("Label para visualizar el submenu de menu Meetings").
                    located(By.xpath("//*[@class=\"s-sidebar-link-text\" and contains(text(),\"Meetings\")]"));

    public static final Target BUTTON_NEW_MEETING =
            Target.the("boton para agendar una nueva reunion").
                    located(By.xpath("//*[@class=\"tool-button add-button icon-tool-button\"]"));

    public static final Target LABEL_MEETING_NAME =
            Target.the("Label para ingresar el nombre de la reunion").
                    located(By.xpath("//*[@id=\"Serenity_Pro_Meeting_MeetingDialog10_MeetingName\"]"));

    public static final Target LABEL_MEETING_NUMBER =
            Target.the("Label para visualizar el numero de la reunion").
                    located(By.xpath("//*[@id=\"Serenity_Pro_Meeting_MeetingDialog10_MeetingNumber\"]"));

    public static final Target DROP_DOWN_MEETING_TYPE =
            Target.the("desplegar el dop dwon para visualizar el tipo de reunion").
                    located(By.xpath("//*[@id=\"select2-chosen-6\"]"));

    public static final Target LABEL_MEETING_TYPE =
            Target.the("Label para visualizar el tipo de la reunion").
                    located(By.xpath("//*[@id=\"s2id_autogen6_search\"]"));

    public static final Target DROP_DOWN_LOCATION =
            Target.the("desplegar el dop dwon para visualizar la ubicacion de reunion").
                    located(By.xpath("//*[@id=\"select2-chosen-7\"]"));

    public static final Target LABEL_ENTER_LOCATION =
            Target.the("Label para ingresar la ubicacion de la reunion").
                    located(By.xpath("//*[@id=\"s2id_autogen7_search\"]"));


    public static final Target LABEL_FORMS_ENTER_LOCATION_NAME =
            Target.the("Label diligenciar el nombre de la ubicacion").
                    located(By.xpath("//*[@id=\"Serenity_Pro_Meeting_MeetingLocationDialog33_Name\"]"));

    public static final Target LABEL_FORMS_ENTER_LOCATION_ADRRES =
            Target.the("Label diligenciar la direccion de la ubicacion").
                    located(By.xpath("//*[@id=\"Serenity_Pro_Meeting_MeetingLocationDialog33_Address\"]"));

    public static final Target LABEL_FORMS_ENTER_LOCATION_LATITUDED =
            Target.the("Label diligenciar el latitud de la ubicacion").
                    located(By.xpath("//*[@id=\"Serenity_Pro_Meeting_MeetingLocationDialog33_Latitude\"]"));

    public static final Target LABEL_FORMS_ENTER_LOCATION_lOMGITUDE =
            Target.the("Label diligenciar el longitud de la ubicacion").
                    located(By.xpath("//*[@id=\"Serenity_Pro_Meeting_MeetingLocationDialog33_Longitude\"]"));


    public static final Target DROP_DOWNL_UNIT =
            Target.the("desplegar el dop dwon para visualizar la unit de la reunion").
                    located(By.xpath("//*[@id=\"s2id_Serenity_Pro_Meeting_MeetingDialog10_UnitId\"]"));

    public static final Target LABEL_ENTER_UNIT =
            Target.the("Label diligenciar el unidad de la reunion").
                    located(By.xpath("//*[@id=\"s2id_autogen8_search\"]"));

    public static final Target LABEL_FORMS_ENTER_LOCATION_UNIT =
            Target.the("Label para visualizar el numero de la reunion").
                    located(By.xpath("//*[@id=\"Serenity_Pro_Organization_BusinessUnitDialog112_Name\"]"));

    public static final Target DROP_DOWN_ORGANIZATE_BY =
            Target.the("desplegar el dop dwon de organizar la reunion por").
                    located(By.xpath("//*[@id=\"select2-chosen-9\"]"));

    public static final Target LABEL_ENTER_ORGANIZATE_BY =
            Target.the("Label para ingresar la reunion por").
                    located(By.xpath("//*[@id=\"s2id_autogen9_search\"]"));

    public static final Target LABEL_FORMS_ENTER_ORGANIZATE_BY_TITTLE =
            Target.the("Label para ingresar en el formulario el titulo de organizar la reunion por").
                    located(By.xpath("//*[@name=\"Title\"]"));

    public static final Target LABEL_FORMS_ENTER_ORGANIZATE_BY_FIRST_NAME =
            Target.the("Label para ingresar en el formulario el name de organizar la reunion por").
                    located(By.xpath("//*[@name=\"FirstName\"]"));

    public static final Target LABEL_FORMS_ENTER_ORGANIZATE_BY_LAST_NAME =
            Target.the("Label para ingresar en el formulario el apellido de organizar la reunion por").
                    located(By.xpath("//*[@name=\"LastName\"]"));

    public static final Target LABEL_FORMS_ENTER_ORGANIZATE_BY_EMAIL =
            Target.the("Label para ingresar en el formulario el email de organizar la reunion por").
                    located(By.xpath("//*[@name=\"Email\"]"));

    public static final Target LABEL_FORMS_ENTER_ORGANIZATE_BY_ENTITRY =
            Target.the("Label para ingresar en el formulario el entitry de organizar la reunion por").
                    located(By.xpath("//*[@name=\"IdentityNo\"]"));

    public static final Target LABEL_FORMS_ENTER_ORGANIZATE_BY_USER_DROP_DOWN =
            Target.the("Label para desplegar el label de organizar reunion por ").
                    located(By.xpath("//*[@class=\"s-TemplatedDialog ui-dialog-content ui-widget-content\"]//*[@class=\"select2-chosen\"]"));

    public static final Target LABEL_FORMS_ENTER_ORGANIZATE_BY_USER_SELECT =
            Target.the("Label para ingresar en el formulario el user de organizar la reunion por").
                    located(By.xpath("//*[contains(@id,'select')]//*[contains(text(),'admin')]"));

    public static final Target DROP_DOWN_REPORTER =
            Target.the("Desplegar el campo de report").
                    located(By.xpath("//*[@id=\"select2-chosen-10\"]"));

    public static final Target LABEL_ENTER_REPORTER =
            Target.the("label para ingresar el reporter").
                    located(By.xpath("//*[@id=\"s2id_autogen10_search\"]"));

    public static final Target LABEL_FORMS_ENTER_REPORT_TITTLE =
            Target.the("Desplegar el campo de report").
                    located(By.xpath("//*[@id=\"Serenity_Pro_Organization_ContactDialog81_Title\"]"));

    public static final Target LABEL_FORMS_ENTER_REPORT_FIRST_NAME =
            Target.the("Label para visualizar el numero de la reunion").
                    located(By.xpath("//*[@id=\"Serenity_Pro_Organization_ContactDialog81_FirstName\"]"));

    public static final Target LABEL_FORMS_ENTER_REPORT_LAST_NAME =
            Target.the("Label para visualizar el numero de la reunion").
                    located(By.xpath("//*[@id=\"Serenity_Pro_Organization_ContactDialog81_LastName\"]"));

    public static final Target LABEL_FORMS_ENTER_REPORT_EMAIL =
            Target.the("Label para visualizar el numero de la reunion").
                    located(By.xpath("//*[@id=\"Serenity_Pro_Organization_ContactDialog81_Email\"]"));

    public static final Target LABEL_FORMS_ENTER_REPORT_ENTITRY =
            Target.the("Label para visualizar el numero de la reunion").
                    located(By.xpath("//*[@id=\"Serenity_Pro_Organization_ContactDialog81_IdentityNo\"]"));

    public static final Target LABEL_FORMS_ENTER_REPORT_USER_DROP_DOWN =
            Target.the("Label para visualizar el numero de la reunion").
                    located(By.xpath("//*[@id=\"select2-chosen-108\"]"));

    public static final Target LABEL_FORMS_ENTER_REPORT_USER_SELECT =
            Target.the("Label para visualizar el numero de la reunion").
                    located(By.xpath("//*[@id=\"select2-result-label-109\"]"));


    public static final Target BUTTON_SAVE_DATA =
            Target.the("boton para guardar los datos ingresados").
                    located(By.xpath("(//*[@class=\"tool-button save-and-close-button icon-tool-button\"])[2]"));


    public static final Target DROP_DOWN_CONTACT =
            Target.the("Desplegar la lista de contactos").
                    located(By.xpath("//*[@id=\"select2-chosen-12\"]"));

    public static final Target LABEL_ENTER_CONTACT =
            Target.the("Label para ingresar un contacto").
                    located(By.xpath("//*[@id=\"s2id_autogen12_search\"]"));

    public static final Target LABEL_FORMS_NAME =
            Target.the("Label para ingresar el nombre en el formulario").
                    located(By.xpath("//*[@name=\"Name\"]"));


    public static final Target SELECT_START_DATE_TIME =
            Target.the("Label para ingresar el tiempo de inicio de la reunion").
                    located(By.xpath("(//*[@class='editor s-DateTimeEditor time'])"));

    public static final Target SELECT_START_DATE =
            Target.the("Label para ingresar el tiempo de inicio de la reunion").
                    located(By.xpath("//*[@name=\"StartDate\"]"));

    public static final Target SELECT_END_DATE =
            Target.the("Label para ingresar la fecha fin de la reunion ").
                    located(By.xpath("//*[@name=\"EndDate\"]"));

    public static final Target BUTTON_SAVE_MEETING =
            Target.the("botton para guardar la reunion").
                    located(By.xpath("(//*[@class=\"tool-button save-and-close-button icon-tool-button\"])[1]"));


    public static final Target ROW_MEETING =
            Target.the("visualizar que se halla creado la reunion").
                    located(By.xpath("//*[@class=\"ui-widget-content slick-row even\"]"));



}
