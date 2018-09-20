package org.squashtest.ta.selenium.startup;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.squashtest.ta.selenium.Authentification.CreatedAcountAuthentification;
import org.squashtest.ta.selenium.ConfigTA;

public class Plus_lus {
    WebDriver driver = null;
    int id_test_case = 96;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();
    String dataset_name="data11111_recette";

    @Test
    public void testPlus_lus() throws Exception {
        ConfigTA cf= new ConfigTA();
        driver=ConfigTA.setUp();
        CreatedAcountAuthentification c= new CreatedAcountAuthentification(dataset_name, driver);
        driver=c.testCreatedAcountAuthentificationCall("call",driver,dataset_name);
        Thread.sleep(2000);
        Thread.sleep(2000);
        driver.findElement(By.linkText("Start-ups")).click();
        Thread.sleep(2000);
        System.out.println("Start up page ");

        //driver.findElement(By.id("popular_category_filterSelectBoxIt")).click();

        //WebElement element = driver.findElement(By.xpath("//div[@id='popular_actus_slider']/div/div/a/div/div"));//Done :) but ...
        WebElement element = driver.findElement(By.id("popular_category_filterSelectBoxItContainer"));//Done :) but ...
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        Thread.sleep(4000);
        actions.perform();

//       Select dropdown = new Select(driver.findElement(By.id("popular_category_filter")));
//       dropdown.selectByIndex(2);
        driver.findElement(By.id("popular_category_filterSelectBoxItContainer"));
        Select dropdown = new Select(driver.findElement(By.id("popular_category_filter")));
        Thread.sleep(2000);
        driver.findElement(By.linkText("start-up"));
        dropdown.selectByIndex(2);

    }
}
