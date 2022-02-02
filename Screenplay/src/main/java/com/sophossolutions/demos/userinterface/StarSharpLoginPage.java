package com.sophossolutions.demos.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class StarSharpLoginPage {

    public static final Target LABEL_USER =
            Target.the("label para ingresar el nombre de usuario").
                    located(By.xpath("//input[@name=\"Username\"]"));

    public static final Target LABEL_PASSWORD =
            Target.the("label para ingresar el password").
                    located(By.xpath("//input[@name=\"Password\"]"));

    public static final Target BTN_LOGIN =
            Target.the("Boton de login ").
                    located(By.xpath("//*[@id=\"StartSharp_Membership_LoginPanel0_LoginButton\"]"));


}
