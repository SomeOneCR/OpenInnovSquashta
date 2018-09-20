package org.squashtest.ta.selenium.Evenements;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.squashtest.ta.selenium.Authentification.CreatedAcountAuthentification;
import org.squashtest.ta.selenium.ConfigTA;

public class Participer_event_no_places {
    WebDriver driver = null;
    int id_test_case = 94;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();
    String dataset_name = "data11111_recette";

    @Test
    public void testParticiper_event_no_places() throws Exception {
        ConfigTA cf = new ConfigTA();
        driver = ConfigTA.setUp();
        CreatedAcountAuthentification c = new CreatedAcountAuthentification(dataset_name, driver);
        driver = c.testCreatedAcountAuthentificationCall("call", driver, dataset_name);
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("body > div.container.clearfix > div > div.main > div.presentation_container > header > div > div > div.menu_scrolled > nav > ul > li:nth-child(1) > a")).click();
        Thread.sleep(2000);
        System.out.println("Evénements  page ");
        driver.findElement(By.cssSelector("#events_slider > div > div > div > div > a.slide_item.discover_event.slick-slide.slick-current.slick-active")).click();//Done :D
        System.out.println(driver.findElement(By.cssSelector("#participate")).getCssValue("color"));
        System.out.println(driver.findElement(By.cssSelector(".default_btn.btn-disabled")).getCssValue("background-color"));
        Assert.assertTrue(driver.findElement(By.cssSelector(".default_btn.btn-disabled")).getCssValue("background-color").equalsIgnoreCase("rgba(158, 157, 157, 1)"));
    }
}