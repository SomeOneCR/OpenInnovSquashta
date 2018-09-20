package org.squashtest.ta.selenium.Authentification;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.squashtest.ta.selenium.ConfigTA;

public class TwetterAuthentification {



    WebDriver driver= null;
    int id_test_case=68;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @Test
    public  void testTewetterAuthentification() throws Exception {
        ConfigTA cf= new ConfigTA();
        driver=ConfigTA.setUp();
        // String app_url=cf.GetParameByName("in_url",id_test_case);
        //  System.out.println(app_url);
        // driver.get(app_url);
        driver.findElement(By.id("cookies_nav_confirm")).click();
        driver.findElement(By.id("login_btn")).click();
        // driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='linkedin'])[1]/following::button[1]")).click();
        //driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='sélectionner un compte pour se connecter'])[1]/following::button[1]")).click();
        // driver.findElement(By.className("default-btn-social db-stwitter")).click();
        driver.findElement(By.linkText("twitter")).click();
        driver.findElement(By.id("username_or_email")).click();
        driver.findElement(By.id("username_or_email")).clear();
        driver.findElement(By.id("username_or_email")).sendKeys("chaimaarakhime@gmail.com");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("1995$2018");
        driver.findElement(By.id("allow")).click();

        //verification of user name
        driver.findElement(By.id("btn-profil")).click();
        //Assert.assertEquals(driver.findElement(By.className("profil_detail")).getText(),"Rakhim Test");
        // Assert.assertTrue((driver.findElement(By.className("profil_detail")).getText()).contains(cf.GetParameByName("out_user_name",id_test_case)));





    }

    public  WebDriver testTewetterAuthentificationCall(WebDriver driver1) throws Exception {
        this.driver=driver1;
        driver.findElement(By.id("cookies_nav_confirm")).click();
        driver.findElement(By.id("login_btn")).click();
        // driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='linkedin'])[1]/following::button[1]")).click();
        //driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='sélectionner un compte pour se connecter'])[1]/following::button[1]")).click();
        // driver.findElement(By.className("default-btn-social db-stwitter")).click();
        driver.findElement(By.linkText("twitter")).click();
        driver.findElement(By.id("username_or_email")).click();
        driver.findElement(By.id("username_or_email")).clear();
        driver.findElement(By.id("username_or_email")).sendKeys("chaimaarakhime@gmail.com");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("1995$2018");
        driver.findElement(By.id("allow")).click();

        //verification of user name
        driver.findElement(By.id("btn-profil")).click();
        //Assert.assertEquals(driver.findElement(By.className("profil_detail")).getText(),"Rakhim Test");
        // Assert.assertTrue((driver.findElement(By.className("profil_detail")).getText()).contains(cf.GetParameByName("out_user_name",id_test_case)));


        return driver;


    }
}
