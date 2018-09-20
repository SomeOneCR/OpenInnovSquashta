package org.squashtest.ta.selenium.Authentification;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.squashtest.ta.selenium.ConfigTA;

public class FacebookAuthentification {
    WebDriver driver= null;
    int id_test_case=65;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @Test
    public  void testFacebookAuthentification() throws Exception {
        ConfigTA cf= new ConfigTA();
        driver=ConfigTA.setUp();
        String app_url=cf.GetParameByName("in_url",id_test_case,"data110_recette");
        System.out.println(app_url);
        driver.get(app_url);
        driver.findElement(By.id("cookies_nav_confirm")).click();
        driver.findElement(By.id("login_btn")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='twitter'])[2]/following::button[1]")).click();
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("rakhimchaimaa@gmail.com");
        driver.findElement(By.id("pass")).clear();
        driver.findElement(By.id("pass")).sendKeys("/it'sokchaimae/$.");
        driver.findElement(By.id("loginbutton")).click();
        //verification of user name
        driver.findElement(By.id("btn-profil")).click();
        Assert.assertTrue((driver.findElement(By.className("profil_detail")).getText()).contains(cf.GetParameByName("out_user_name",id_test_case,"data1000_recette")));
    }
}
