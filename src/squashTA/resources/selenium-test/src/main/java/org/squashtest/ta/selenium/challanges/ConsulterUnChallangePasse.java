package org.squashtest.ta.selenium.challanges;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.squashtest.ta.selenium.ConfigTA;

public class ConsulterUnChallangePasse {
    WebDriver driver= null;
    int id_test_case=90;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @Test
    public void testConsulterUnChallangePasse() throws Exception{
        ConfigTA cf= new ConfigTA();
        driver=ConfigTA.setUp();

        driver.get("https://inwi-digital.neoxia-maroc.net/");
        driver.findElement(By.id("cookies_nav_confirm")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Start-ups'])[1]/following::span[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='linkedin'])[1]/following::button[1]")).click();

    }
}

