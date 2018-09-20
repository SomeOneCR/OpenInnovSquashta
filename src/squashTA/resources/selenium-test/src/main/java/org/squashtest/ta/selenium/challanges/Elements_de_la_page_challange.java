package org.squashtest.ta.selenium.challanges;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.squashtest.ta.selenium.Authentification.CreatedAcountAuthentification;
import org.squashtest.ta.selenium.ConfigTA;



public class Elements_de_la_page_challange {
    WebDriver driver= null;
    int id_test_case=91;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();
    String dataset_name="data11111_recette";

    @Test
    public void testElements_de_la_page_challange() throws Exception{
        ConfigTA cf= new ConfigTA();
        driver=ConfigTA.setUp();
        CreatedAcountAuthentification c= new CreatedAcountAuthentification(dataset_name, driver);
        driver=c.testCreatedAcountAuthentificationCall("call",driver,dataset_name);

        Thread.sleep(2000);
        //driver.findElement(By.cssSelector("#challenge_page > div > img.active_icn")).click();
        driver.findElement(By.id("challenge_page")).click();
        //js.executeScript("window.scrollBy(0,100)");
        Thread.sleep(2000);
        //Thread.sleep(1000);
        //driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Previous'])[1]/following::div[5]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Start-ups'])[2]/following::span[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Start-ups'])[2]/following::h3[1]")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Hackathon Gaming'])[1]/following::span[1]")).click();
        Thread.sleep(2000);
        //driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='gaming'])[1]/following::img[1]")).click();
        //Thread.sleep(2000);
        /*at this point there is a problem :/ pop up de partage l'icon de fermeture */ //driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Partager'])[1]/following::span[1]")).click();
        //driver.findElement(By.id("article_1")).click();
        //driver.findElement(By.id("article_2")).click();


        // WebElement element = driver.findElement(By.xpath("//*[@id=\"share_event\"]/div/div/div/div[1]/div[2]/button"));//icon de fermeture modal_header_btn


        //WebElement element = driver.findElement(By.className("modal_header_btn"));
        //WebElement element = driver.findElement(By.cssSelector("#share_event > div > div > div > div.modal_header.clearfix > div.modal_header_btn > button"));



        //Actions action = new Actions(driver);
        //WebElement we = driver.findElement(By.xpath("//*[@id=\"share_event\"]/div/div/div/div[1]/div[2]"));
        //action.moveToElement(we).moveToElement(driver.findElement(By.cssSelector("#share_event > div.modal-flex.special > div.modal_dialog > div.modal_content > div.modal_header.clearfix > div.modal_header_btn > button.close_popin.hide_popin > span.light_txt.display_inline.font_size_15"))).click().build().perform();


/*        WebElement element = driver.findElement(By.cssSelector("#share_event > div > div > div > div.modal_header.clearfix > div.modal_header_btn"));
        Actions action = new Actions(driver);

        action.moveToElement(element).build().perform();

        driver.findElement(By.linkText("FERMER")).click();//By.linkTest("Fermer")*/
        // WebDriverWait wait = new WebDriverWait(driver, 5);
        // wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#share_event > div.modal-flex.special > div.modal_dialog > div.modal_content > div.modal_header.clearfix > div.modal_header_btn > button.close_popin.hide_popin > span.light_txt.display_inline.font_size_15\"")));
        // driver.findElement(By.cssSelector("#share_event > div.modal-flex.special > div.modal_dialog > div.modal_content > div.modal_header.clearfix > div.modal_header_btn > button.close_popin.hide_popin > span.light_txt.display_inline.font_size_15\"")).click();




        // Verification de date : dd/mm/yyyy
        String DATEREGEX="^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[1,3-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";

        //driver.findElement(By.cssSelector("span.infos_tag.surrounded_tag.light_purple")).getText();
        Assert.assertTrue((driver.findElement(By.cssSelector("span.infos_tag.surrounded_tag.light_purple")).getText()).matches(DATEREGEX));

        // Test of title assert that the title on challange page is the same as the title on challange selected
        Assert.assertTrue(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Start-ups'])[2]/following::h3[1]")).isDisplayed());

        // Test Tag :div className=tag-event
        //mr_5 infos_container date_infos tag display_inline
        // assertThat(driver.findElement(By.cssSelector(".mr_5 infos_container date_infos tag display_inline")).isDisplayed());
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("span.font_size_12.infos_tag.free_tag.display_block")).findElement(By.xpath("//div[@id='challenge_container']/div/div[2]/section/div/div/div/div/div/div/div/div[2]/div[2]/span")).isDisplayed();
        //driver.findElement().click();

        // Onglet description
        Thread.sleep(2000);
        driver.findElement(By.id("article_1")).click();// pass
        Assert.assertTrue(driver.findElement(By.id("article_1")).isDisplayed());
        driver.findElement(By.id("article_2")).click(); // pass
        Assert.assertTrue(driver.findElement(By.id("article_2")).isDisplayed());
        driver.findElement(By.id("article_1")).click();
        Thread.sleep(2000);

        Thread.sleep(2000);
        // Galerie :Warning le nom Galerie est ecrit en blanc n'est pas visible
        Assert.assertTrue(driver.findElement(By.cssSelector("h2.medium_txt.uppercase > span")).isDisplayed()); // pass



    }
}
