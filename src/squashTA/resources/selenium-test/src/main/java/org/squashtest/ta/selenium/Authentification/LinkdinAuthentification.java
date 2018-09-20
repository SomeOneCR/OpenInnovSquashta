package org.squashtest.ta.selenium.Authentification;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.squashtest.ta.selenium.ConfigTA;

public class LinkdinAuthentification  extends ConfigTA{

    WebDriver driver= null;
    int id_test_case=67;
    String  dataset_name;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

     public LinkdinAuthentification(int id_test_case,String dataset_name){
            this.dataset_name=dataset_name;
            this.id_test_case=id_test_case;
    }

    @Test
    public  void testLinkdinAuthentification() throws Exception {
        dataset_name="data10";
        ConfigTA cf= new ConfigTA();
        driver=ConfigTA.setUp();
        String app_url=cf.GetParameByName("in_url",id_test_case,dataset_name);
        System.out.println(app_url);
        driver.get(app_url);
        driver.findElement(By.id("cookies_nav_confirm")).click();
        driver.findElement(By.id("login_btn")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='facebook'])[2]/following::button[1]")).click();
        //driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='sélectionner un compte pour se connecter'])[1]/following::button[1]")).click();

        driver.findElement(By.id("session_key-login")).click();
        driver.findElement(By.id("session_key-login")).clear();
        driver.findElement(By.id("session_key-login")).sendKeys("chaimaarakhime@gmail.com");
        driver.findElement(By.id("session_password-login")).click();
        driver.findElement(By.id("session_password-login")).click();
        driver.findElement(By.id("session_password-login")).clear();
        driver.findElement(By.id("session_password-login")).sendKeys("1995$2018Cr");
        driver.findElement(By.id("btn-primary")).click();
       // driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Start-ups'])[1]/following::div[4]")).click();
        //verification of user name
        driver.findElement(By.id("btn-profil")).click();
        Assert.assertTrue((driver.findElement(By.className("profil_detail")).getText()).contains(cf.GetParameByName("out_user_name",id_test_case,dataset_name)));

    }
}
