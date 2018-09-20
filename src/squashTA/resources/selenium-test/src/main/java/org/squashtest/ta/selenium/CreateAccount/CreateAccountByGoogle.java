package org.squashtest.ta.selenium.CreateAccount;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.squashtest.ta.selenium.ConfigTA;

public class CreateAccountByGoogle {
    WebDriver driver= null;
    int id_test_case=65;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @Test
    public void testCreateAccountByGoogle() throws Exception{
        ConfigTA cf= new ConfigTA();
        driver=ConfigTA.setUp();
        driver.get("https://inwi-digital.neoxia-maroc.net/");
        driver.findElement(By.id("cookies_nav_confirm")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Start-ups'])[1]/following::span[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='linkedin'])[1]/following::button[1]")).click();
        driver.findElement(By.id("identifierId")).clear();
        driver.findElement(By.id("identifierId")).sendKeys("sarah9mortaji");
        driver.findElement(By.cssSelector("#identifierNext > div.ZFr60d.CeoRYc")).click();
        driver.findElement(By.name("hiddenPassword")).clear();
        driver.findElement(By.name("hiddenPassword")).sendKeys("/sara/@9.");
        driver.findElement(By.cssSelector("span.RveJvd.snByac")).click();
        driver.findElement(By.cssSelector("button.default_btn.width_240.close_first_authentification_modal")).click();
        driver.findElement(By.cssSelector("#btn-profil > div > img.active_icn")).click();
    }
}
