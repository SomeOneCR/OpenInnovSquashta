package org.squashtest.ta.selenium.challanges;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.squashtest.ta.selenium.Authentification.CreatedAcountAuthentification;
import org.squashtest.ta.selenium.ConfigTA;

public class Participer_challange_rejoindre_une_equipe{
    WebDriver driver= null;
    int id_test_case=93;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();
    String dataset_name="data11111_recette";



    @Test
    public void testarticiper_challange_rejoindre_une_equipe() throws Exception{
        ConfigTA cf= new ConfigTA();
        driver=ConfigTA.setUp();
        CreatedAcountAuthentification c= new CreatedAcountAuthentification(dataset_name, driver);
        driver=c.testCreatedAcountAuthentificationCall("call",driver,dataset_name);
        Thread.sleep(2000);
        driver.findElement(By.id("challenge_page")).click();
        //js.executeScript("window.scrollBy(0,100)");
        Thread.sleep(2000);
        System.out.println("challange...");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Challenge en cours'])[1]/following::div[7]")).click();
        Thread.sleep(2000);

        //driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='partager'])[1]/following::button[1]")).click();
        driver.findElement(By.id("article_2")).click();
        Thread.sleep(2000);
        //driver.findElement(By.id("cancel_join_requests_and_projects")).click();
/*        try{
            WebElement ele=driver.findElement(By.id("cancel_join_requests_and_projects"));
            if(ele!=null)
                ele.click();
        }catch (Exception e){
            e.getStackTrace();
        }*/
        if(driver.findElement(By.cssSelector("#cancel_join_requests_and_projects_modal > div.modal-flex > div.modal_dialog > div.modal_content > div.modal_header.clearfix > div.modal_header_title > #title_notif")).isDisplayed())
            driver.findElement(By.id("cancel_join_requests_and_projects")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='fermer'])[7]/following::div[5]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='rejoindre une équipe'])[1]/following::button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[2]/div[2]/button")).click();
        driver.findElement(By.id("join_team_message")).click();
        driver.findElement(By.id("join_team_message")).clear();
        driver.findElement(By.id("join_team_message")).sendKeys("this is a message for test 2");
        driver.findElement(By.id("btn_join_team")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='fermer'])[31]/following::button[1]")).click();


    }
}
