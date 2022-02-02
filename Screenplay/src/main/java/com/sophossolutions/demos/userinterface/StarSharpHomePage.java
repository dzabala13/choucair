package com.sophossolutions.demos.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class StarSharpHomePage {

    public static final Target LABEL_MENU_ORGANIZATION =
            Target.the("Label para visualizar el submenu de munu organization ").
                    located(By.xpath("//*[@class=\"s-sidebar-link-text\" and contains(text(),\"Organization\")]"));
    public static final Target LABEL_MENU_BUSSINES_UNIT =
            Target.the("Label para visualizar el submenu de munu organization ").
                    located(By.xpath("//*[@class=\"s-sidebar-link-text\" and contains(text(),\"Business Units\")]"));


    public static final Target BUTTON_ADD_BUSSINES_UNIT =
            Target.the("Boton para agregar bussines unit").
                    located(By.xpath("//*[@class=\"tool-button add-button icon-tool-button\"]"));

    public static final Target LABEL_INPUT_NAME_BUSSINES =
            Target.the("input para ingresar el nombre del bussines unit").
                    located(By.xpath("//*[@id=\"Serenity_Pro_Organization_BusinessUnitDialog3_Name\"]"));

    public static final Target SAVE_BUSSINES_UNIT =
            Target.the("button save bussines unit").
                    located(By.xpath("//*[@class=\"tool-button save-and-close-button icon-tool-button\"]"));

    public static final Target CLOSE_BUTTON =
            Target.the("button save bussines unit").
                    located(By.xpath("//*[@class=\"ui-dialog-titlebar-close\"]"));
}
