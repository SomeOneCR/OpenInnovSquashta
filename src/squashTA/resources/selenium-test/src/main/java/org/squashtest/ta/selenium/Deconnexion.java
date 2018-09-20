package org.squashtest.ta.selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Deconnexion {
    WebDriver driver= null;
    int id_test_case=64;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();
    String dataset_name;





    @Test
    public  void testDeconnexion(WebDriver driver) throws Exception {

        driver.findElement(By.id("btn-profil")).click();
        driver.findElement(By.linkText("se déconnecter")).click();

    }


}
