package org.squashtest.ta.selenium.CreateAccount;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.squashtest.ta.selenium.ConfigTA;

public class CreateAccountByFacebook {
    WebDriver driver= null;
    int id_test_case=79;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();
    String dataset_name;


    @Test
    public  void testCreateAccountByFacebook() throws Exception {
        dataset_name="data1011_recette";
        ConfigTA cf= new ConfigTA();
        driver=ConfigTA.setUp();
        String app_url=cf.GetParameByName("in_url",id_test_case,dataset_name);

        System.out.println(app_url);
        driver.get(app_url);
        driver.findElement(By.id("cookies_nav_confirm")).click();
        driver.findElement(By.id("login_btn")).click();
        driver.findElement(By.id("show_create_account")).click();

        driver.findElement(By.id("firstname")).clear();
        driver.findElement(By.id("firstname")).sendKeys(cf.GetParameByName("in_first_name",id_test_case,dataset_name));
        driver.findElement(By.id("formRegister_email")).click();
        driver.findElement(By.id("formRegister_email")).clear();
        driver.findElement(By.id("formRegister_email")).sendKeys(cf.GetParameByName("in_email",id_test_case,dataset_name));
        driver.findElement(By.id("register_pswd")).click();
        driver.findElement(By.id("register_pswd")).clear();
        driver.findElement(By.id("register_pswd")).sendKeys(cf.GetParameByName("in_mdp",id_test_case,dataset_name));
        driver.findElement(By.id("register_conf_pswd")).click();
        driver.findElement(By.id("register_conf_pswd")).clear();
        driver.findElement(By.id("register_conf_pswd")).sendKeys(cf.GetParameByName("in_mdp",id_test_case,dataset_name));
        //driver.findElement(By.id("cgu_checkbox")).click();
        //driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)=concat('s', \"'\", 'abonner à la newsletter')])[1]/preceding::span[4]")).click();
        //problem on checkbox click
        driver.findElement(By.cssSelector("p.mb_10 > label.styled_checkbox > span.input_mask")).click();
        driver.findElement(By.id("confirm_create_account")).click();
       // driver.findElement(By.id("resend_email")).click();
        //driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='confirmation compte'])[1]/following::button[1]")).click();
        //driver.findElement(By.xpath("//div[10]/div/div/div/div/div[2]/button/span")).click();
        //driver.findElement(By.xpath("//div[@id='mail_confirmation']/div/div/div/div/div[2]/button/span")).click();
        //driver.findElement(By.cssSelector("#mail_confirmation > div.modal-flex > div.modal_dialog > div.modal_content > div.modal_header.clearfix > div.modal_header_btn > button.close_popin.hide_popin > span.light_txt.display_inline.font_size_15")).click();
        //driver.findElement(By.className("close_popin hide_popin")).click();

        //verification of user name
        driver.findElement(By.id("btn-profil")).click();
        //Assert.assertEquals(driver.findElement(By.className("profil_detail")).getText(),"Rakhim Test");
        Assert.assertTrue((driver.findElement(By.className("profil_detail")).getText()).contains(cf.GetParameByName("out_user_name",id_test_case,"data101_recette")));


    }
}
