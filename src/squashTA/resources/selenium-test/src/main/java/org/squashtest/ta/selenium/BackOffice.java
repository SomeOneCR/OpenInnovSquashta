package org.squashtest.ta.selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class BackOffice {
    WebDriver driver= null;
    int id_test_case=64;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();
    String dataset_name;





    @Test
    public  void testBackOffice() throws Exception {
        ConfigTA cf= new ConfigTA();
        driver=ConfigTA.setUp();
        //String app_url=cf.GetParameByName("in_url",id_test_case,"data101_recette");
        //String URL = "http:// + username + ":" + password + "@" + "link";
        String URL="https://inwi-digital:]M$-%[]4@inwi-digital.neoxia-maroc.net/admin";
        //static String authorizationHeaderValue = "Basic " + java.util.Base64.getEncoder().encodeToString( usernameAndPassword.getBytes() );

        driver.get(URL);
        //System.out.println(app_url);
        //driver.get(app_url);
        driver.findElement(By.name("username")).click();
        driver.findElement(By.name("username")).click();
        driver.findElement(By.name("username")).clear();
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).click();
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("admin");
        //driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Mot de passe'])[1]/following::button[1]")).click();
        //driver.findElement(By.linkText("Challenges")).click();
        //driver.findElement(By.cssSelector("body > app-root > div > div > div > app-challenges > div.row > div > table > tbody > tr:nth-child(7) > td:nth-child(7) > button:nth-child(4)")).click();
        Thread.sleep(2000);
       // driver.findElement(By.cssSelector("body > app-root > div > div > div > app-projects > div.row > div > table > tbody > tr:nth-child(6) > td:nth-child(9) > button.btn.btn-primary.primary_btn.btn-sm")).click();

        //driver.findElement(By.id("statut")).click();
        //new Select(driver.findElement(By.id("statut"))).selectByVisibleText("En cours");
        //driver.findElement(By.id("statut")).click();
        //driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Annuler'])[1]/following::button[1]")).click();

    }


}
