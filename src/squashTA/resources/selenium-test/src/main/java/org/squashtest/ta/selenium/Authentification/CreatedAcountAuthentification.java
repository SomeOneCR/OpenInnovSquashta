package org.squashtest.ta.selenium.Authentification;

import com.google.common.annotations.VisibleForTesting;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.squashtest.ta.selenium.ConfigTA;


public class CreatedAcountAuthentification {

        WebDriver driver= null;
        int id_test_case=64;
        private boolean acceptNextAlert = true;
        private StringBuffer verificationErrors = new StringBuffer();
        String dataset_name;
        String etat="call";

        public CreatedAcountAuthentification(int id_test_case,String dataset_name,WebDriver driver){
                this.dataset_name=dataset_name;
                this.id_test_case=id_test_case;
                this.driver=driver;
        }
    public CreatedAcountAuthentification(String dataset_name,WebDriver driver) throws Exception{
        this.dataset_name=dataset_name;
        //ConfigTA cf= new ConfigTA();

        //driver=ConfigTA.setUp();
        //testCreatedAcountAuthentificationCall("call",driver,dataset_name);

    }


    @Test
    public  void testCreatedAcountAuthentification() throws Exception {
        ConfigTA cf= new ConfigTA();
        driver=ConfigTA.setUp();
        String app_url=cf.GetParameByName("in_url",id_test_case,"data101_recette");

        System.out.println(app_url);
        driver.get(app_url);
        driver.findElement(By.id("cookies_nav_confirm")).click();
        driver.findElement(By.id("login_btn")).click();
        driver.findElement(By.id("authentif_email")).click();
        driver.findElement(By.id("authentif_email")).clear();
        driver.findElement(By.id("authentif_email")).sendKeys(cf.GetParameByName("in_email",id_test_case,"data101_recette"));
        driver.findElement(By.id("authentif_psswd")).click();
        driver.findElement(By.id("authentif_psswd")).clear();
        driver.findElement(By.id("authentif_psswd")).sendKeys(cf.GetParameByName("in_mdp",id_test_case,"data101_recette"));
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='entrez votre identifiant et mot de passe'])[1]/following::span[4]")).click();
        driver.findElement(By.id("btn_login")).click();
        //driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Bienvenue sur la plateforme inwi innov.'])[1]/following::img[2]")).click();
        //verification of user name
        //driver.findElement(By.id("btn-profil")).click();
        //Assert.assertEquals(driver.findElement(By.className("profil_detail")).getText(),"Rakhim Test");
        // Assert.assertTrue((driver.findElement(By.className("profil_detail")).getText()).contains(cf.GetParameByName("out_user_name",id_test_case,"data101_recette")));

    }



    public  WebDriver testCreatedAcountAuthentificationCall(String etat,WebDriver driver_call,String dataset_name) throws Exception {

            ConfigTA cf= new ConfigTA();
            driver=driver_call;
            String app_url=cf.GetParameByName("in_url",id_test_case,"data101_recette");
            System.out.println("authentification call");
            System.out.println(app_url);
            driver.get(app_url);
            driver.findElement(By.id("cookies_nav_confirm")).click();
            driver.findElement(By.id("login_btn")).click();
            driver.findElement(By.id("authentif_email")).click();
            driver.findElement(By.id("authentif_email")).clear();
            driver.findElement(By.id("authentif_email")).sendKeys(cf.GetParameByName("in_email",id_test_case,"data101_recette"));
            driver.findElement(By.id("authentif_psswd")).click();
            driver.findElement(By.id("authentif_psswd")).clear();
            driver.findElement(By.id("authentif_psswd")).sendKeys(cf.GetParameByName("in_mdp",id_test_case,"data101_recette"));
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='entrez votre identifiant et mot de passe'])[1]/following::span[4]")).click();
            driver.findElement(By.id("btn_login")).click();
            //driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Bienvenue sur la plateforme inwi innov.'])[1]/following::img[2]")).click();
            //verification of user name
            //driver.findElement(By.id("btn-profil")).click();
            //Assert.assertEquals(driver.findElement(By.className("profil_detail")).getText(),"Rakhim Test");
            // Assert.assertTrue((driver.findElement(By.className("profil_detail")).getText()).contains(cf.GetParameByName("out_user_name",id_test_case,"data101_recette")));
            return driver;


    }





   /* public  WebDriver testCreatedAcountAuthentificationcall() throws Exception {
       // this.driver=wd;
        ConfigTA cf= new ConfigTA();
        driver=ConfigTA.setUp();
        String app_url=cf.GetParameByName("in_url",id_test_case,"data101_recette");

        System.out.println(app_url);
        driver.get(app_url);
        driver.findElement(By.id("cookies_nav_confirm")).click();
        driver.findElement(By.id("login_btn")).click();
        driver.findElement(By.id("authentif_email")).click();
        driver.findElement(By.id("authentif_email")).clear();
        driver.findElement(By.id("authentif_email")).sendKeys(cf.GetParameByName("in_email",id_test_case,"data101_recette"));
        driver.findElement(By.id("authentif_psswd")).click();
        driver.findElement(By.id("authentif_psswd")).clear();
        driver.findElement(By.id("authentif_psswd")).sendKeys(cf.GetParameByName("in_mdp",id_test_case,"data101_recette"));
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='entrez votre identifiant et mot de passe'])[1]/following::span[4]")).click();
        driver.findElement(By.id("btn_login")).click();
        //driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Bienvenue sur la plateforme inwi innov.'])[1]/following::img[2]")).click();
        //verification of user name
        driver.findElement(By.id("btn-profil")).click();
        //Assert.assertEquals(driver.findElement(By.className("profil_detail")).getText(),"Rakhim Test");
        Assert.assertTrue((driver.findElement(By.className("profil_detail")).getText()).contains(cf.GetParameByName("out_user_name",id_test_case,"data101_recette")));
        return driver;

    }*/

}
