package org.squashtest.ta.selenium.Evenements;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.squashtest.ta.selenium.Authentification.CreatedAcountAuthentification;
import org.squashtest.ta.selenium.Authentification.TwetterAuthentification;
import org.squashtest.ta.selenium.ConfigTA;

import static java.nio.charset.StandardCharsets.*;

import java.util.Iterator;
import java.util.List;

public class Element_page_evenements {//

    WebDriver driver = null;
    int id_test_case = 94;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();
    String dataset_name = "data11111_recette";

    @Test
    public void testElement_page_evenements() throws Exception {
        ConfigTA cf = new ConfigTA();
        driver = ConfigTA.setUp();
        CreatedAcountAuthentification c = new CreatedAcountAuthentification(dataset_name, driver);
        driver = c.testCreatedAcountAuthentificationCall("call", driver, dataset_name);
        Thread.sleep(2000);
        //driver.findElement(By.id("btn-profil")).click();
        //Thread.sleep(2000);

        //driver.findElement(By.linkText("Evénements")).click();

        driver.findElement(By.cssSelector("body > div.container.clearfix > div > div.main > div.presentation_container > header > div > div > div.menu_scrolled > nav > ul > li:nth-child(1) > a")).click();
        Thread.sleep(2000);
        System.out.println("Evénements  page ");

        //driver.findElement(By.className("date_flex")).click();
        //Assert.assertTrue( driver.findElement(By.className("date_flex")).isDisplayed());
        //driver.findElement(By.cssSelector("div.date_slider.slick-initialized.slick-slider")).click();

        //driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='AOû'])[2]/following::small[1]")).click();
/*        for(int i=0;i<3;i++){
            driver.findElement(By.xpath("")).getAttribute("data-slick-index");
        }*/

        //Calendrier
//        driver.findElement(By.id("date-filter")).click();
//        driver.findElement(By.id("filter_event_from")).click();
//        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Suivant'])[1]/following::select[1]")).click();
//        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Suivant'])[1]/following::select[2]")).click();
//        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='de'])[1]/following::p[1]")).click();
//        driver.findElement(By.id("filter_event_to")).click();
//        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Suivant'])[1]/following::select[1]")).click();
//        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Suivant'])[1]/following::select[2]")).click();
//        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Next'])[1]/following::div[2]")).click();
//        driver.findElement(By.id("valid_event_daterange_filter")).click();


        Thread.sleep(2000);

        //  Verification des dates des evenements filtre avec la date choisi

//        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='calendrier'])[1]/following::span[2]")).click();
//        driver.findElement(By.id("event_category_filterSelectBoxIt")).click();
//
//        Select dropdown = new Select(driver.findElement(By.id("event_category_filterSelectBoxIt")));
//        dropdown.selectByVisibleText("développeurs");
//        //dropdown.selectByValue("développeurs");
//        //dropdown.selectByIndex(2);
//        Thread.sleep(2000);
//        driver.findElement(By.id("event_city_filterSelectBoxIt")).click();
//
//        Select dropdown1 = new Select(driver.findElement(By.id("event_city_filterSelectBoxIt")));
//        //dropdown1.selectByVisibleText("Casablanca");
//        dropdown1.selectByIndex(1);
//        driver.findElement(By.id("valid_event_categories_filter")).click();

        //Verification des resultats avec le filtrage choisi
        Thread.sleep(4000);
        //Boite a idee

       /*WebElement element1 = driver.findElement(By.cssSelector("body > div.container.clearfix > div > div.main > div.wrap > section.section_boite_idees.animated_section.arrived_section > div > div.bloc-etap-3.btn-white > button"));//Done :) but ...
        //WebElement element =driver.findElement(By.cssSelector("#event_detail_container > div > div.main > div.wrap.wrap-mobile > section.section_programme_event.animated_section.arrived_section > div > div.mb_20.parent_tab.event-arround-style > div.tab_continer"));
        Actions actions2 = new Actions(driver);
        actions2.moveToElement(element1);
        Thread.sleep(2000);
        actions2.perform();
        actions2.click();*/
       ///Today up
        //driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Next'])[2]/following::h3[1]")).click();
        //driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Partagez vos idées, votre avis nous intéresse !'])[1]/following::button[1]")).click();
        //driver.findElement(By.cssSelector("button.medium_txt.default_btn.open_contact")).click();
//        Actions action = new Actions(driver);
//        action.moveToElement(driver.findElement(By.cssSelector("button.medium_txt.default_btn.open_contact"))).click().build().perform();
//        Thread.sleep(2000);
            /*Formulaire de la boite */
//        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='suivez-nous'])[1]/following::div[5]")).click();
//        driver.findElement(By.id("contact_lastname")).click();
//        driver.findElement(By.id("contact_firstname")).click();
//        driver.findElement(By.name("email")).click();
//        driver.findElement(By.id("contact_object")).click();
//        driver.findElement(By.name("message")).click();
//        driver.findElement(By.name("message")).clear();
//        driver.findElement(By.name("message")).sendKeys("This is a test for some test :D");
//        driver.findElement(By.id("submit_contact_modal")).click();
//        driver.findElement(By.id("contact_object")).click();
//        driver.findElement(By.id("contact_object")).clear();
//        driver.findElement(By.id("contact_object")).sendKeys("Test");
//        driver.findElement(By.id("submit_contact_modal")).click();
//        driver.findElement(By.id("close_contact_modal_success")).click();

        /*Page d'un evenement */
        //driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Hackathon gaming'])[1]/following::p[1]")).click();
        //driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Start-ups'])[2]/following::small[1]")).click();
       //Main record
        //driver.findElement(By.cssSelector("#events_slider > div > div > div > div > a:nth-child(2)")).click();
        /*Injaz maghrib *///driver.findElement(By.cssSelector("#events_slider > div > div > div > div > a.slide_item.discover_event.slick-slide.slick-current.slick-active")).click();//Done :D

        /*C.R Event*/
        /*live video est selement pour les events passe*/
        driver.findElement(By.cssSelector("#events_slider > div > div > div > div > a:nth-child(3)")).click();
        //#events_slider > div > div > div > div > a:nth-child(3)
        //driver.findElement(By.linkText("C.R Event")).click();
        Thread.sleep(2000);
       // driver.findElement(By.id("display_live")).click();


        // closing live model
        /*Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.cssSelector("#event_live_modal > div > div > div > div.modal_header.clearfix > div.modal_header_btn"))).click().build().perform();
        Thread.sleep(2000); */




        Assert.assertTrue(driver.findElement(By.cssSelector("#event_detail_container > div > div.main > div.wrap.wrap-mobile > section.section_detail_event.animated_section.arrived_section > div > div > div > div.event_flex > div.event_flex_detail > div > span > small")).getText().equalsIgnoreCase("20/09/2018"));
        Assert.assertTrue(driver.findElement(By.cssSelector("#event_detail_container > div > div.main > div.wrap.wrap-mobile > section.section_detail_event.animated_section.arrived_section > div > div > div > div.event_flex > div.event_flex_detail > h3")).getText().equalsIgnoreCase("C.R EVENT"));
        Assert.assertTrue(driver.findElement(By.cssSelector("#event_detail_container > div > div.main > div.wrap.wrap-mobile > section.section_detail_event.animated_section.arrived_section > div > div > div > div.event_flex > div.event_flex_detail > p")).getText().contains("Casablanca"));
        System.out.println("Assert ville");
        Assert.assertTrue(driver.findElement(By.cssSelector("#event_detail_container > div > div.main > div.wrap.wrap-mobile > section.section_detail_event.animated_section.arrived_section > div > div > div > div.event_flex > div.event_flex_btn.third.special1 > button > span > small")).getText().contains("partager"));

        Assert.assertTrue(driver.findElement(By.cssSelector("#show_event_location > span.display_block > small")).getText().contains("plan sur carte"));
        Assert.assertTrue(driver.findElement(By.cssSelector("#event_detail_container > div > div.main > div.wrap.wrap-mobile > section.section_detail_event.animated_section.arrived_section > div > div > div > div.event_article.clearfix > div.p_30.light_txt.black_color.font_size_18.justify.content_description")).isDisplayed());
        Thread.sleep(2000);


        driver.findElement(By.id("show_event_location")).click();
        Assert.assertTrue(driver.findElement(By.id("map")).isDisplayed());
        //Refaire ce test avec l'evenement INJAZ AL-MAGHRIB COMPÉTITION NATIONALE 2016 car il contient bloc enventeur .....
       // Actions action= new Actions(driver);
        //action.moveToElement(By.className("modal_header_btn")).click().build().perform();
        System.out.println("Assert Maps");

        Actions action1 = new Actions(driver);
        action1.moveToElement(driver.findElement(By.cssSelector("#event_live_modal > div > div > div > div.modal_header.clearfix > div.modal_header_btn"))).click().build().perform();
        Thread.sleep(2000);

        // Linkdin share
        //driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='plan sur carte'])[1]/following::img[1]")).click();
        //driver.findElement(By.id("linkedin_share_btn")).click();


        //Twetter share
//        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='plan sur carte'])[1]/following::small[1]")).click();
//        System.out.println(driver.getWindowHandle());
//
//        driver.findElement(By.id("twitter_share_btn")).click();
//
//        System.out.println("tewtter tab ...");
//        Thread.sleep(2000);
//        Thread.sleep(2000);
//
//        //new Actions(driver).sendKeys(driver.findElement(By.tagName("html")), Keys.CONTROL).sendKeys(driver.findElement(By.tagName("html")),Keys.NUMPAD1).build().perform();
//       // new Actions(driver).sendKeys(driver.findElement(By.tagName("html")), Keys.CONTROL).sendKeys(driver.findElement(By.tagName("html")),Keys.NUMPAD2).build().perform();
//
//        System.out.println(driver.getWindowHandle());
//        driver.findElement(By.cssSelector("#username_or_email")).submit();
//        driver.findElement(By.id("username_or_email")).click();
//        driver.findElement(By.id("username_or_email")).clear();
//        driver.findElement(By.id("username_or_email")).sendKeys("chaimaarakhime@gmail.com");
//        driver.findElement(By.id("password")).click();
//        driver.findElement(By.id("password")).clear();
//        driver.findElement(By.id("password")).sendKeys("1995$2018");
//        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Mot de passe oublié ?'])[1]/following::input[2]")).click();
//        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Twitter'])[1]/following::img[1]")).click();

        /*System.out.println("Sharing on tewetter");
        Actions action2 = new Actions(driver);
        action2.moveToElement(driver.findElement(By.cssSelector("#event_live_modal > div > div > div > div.modal_header.clearfix > div.modal_header_btn"))).click().build().perform();
        Thread.sleep(2000);*/



        //Katalon record
        //Date de l'event
//        driver.findElement(By.cssSelector("#event_detail_container > div > div.main > div.wrap.wrap-mobile > section.section_detail_event.animated_section.arrived_section > div > div > div > div.event_flex > div.event_flex_detail > div.event_detail > span > small")).click();
//        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Start-ups'])[2]/following::h3[1]")).click();
//        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Hackathon gaming'])[1]/following::p[1]")).click();
//        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Hackathon gaming'])[1]/following::span[1]")).click();
//        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='digital'])[1]/following::img[1]")).click();
//        driver.findElement(By.id("modal_event_title")).click();
//        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Découvrir'])[1]/following::div[3]")).click();
//        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='plan sur carte'])[1]/following::small[1]")).click();
//        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='mon compte'])[2]/following::div[2]")).click();



        //Verfification d'afficage de programme
        Thread.sleep(7000);
        //driver.findElement(By.id("jour_0")).sendKeys(Keys.PAGE_DOWN);
        ///driver.findElement(By.cssSelector("#event_detail_container > div > div.main > div.wrap.wrap-mobile > section.section_programme_event.animated_section.arrived_section > div > div.mb_20.parent_tab.event-arround-style > div.display_flex1.event_program > div.event_program_title")).sendKeys(Keys.TAB);

        /*Verfification de l'affichage de programme Done :D */
        WebElement element = driver.findElement(By.id("jour_0_content"));//Done :) but ...
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        Thread.sleep(2000);
        actions.perform();
        actions.click();

        String myString =driver.findElement(By.cssSelector("#event_detail_container > div > div.main > div.wrap.wrap-mobile > section.section_programme_event.animated_section.arrived_section > div > div.mb_20.parent_tab.event-arround-style > div.display_flex1.event_program > div.event_program_title > h2 > span")).getText();
        byte[] ptext = myString.getBytes();
        String value = new String(ptext, UTF_8);
        System.out.println(value);

//Assert.assertThat(value).equals("programme de l'évènement");
//assertThat(myString)

        System.out.println(myString.equalsIgnoreCase("programme de l'évènement"));
        System.out.println(myString);
        Assert.assertTrue(myString.equalsIgnoreCase("programme de l'évènement"));

        /*Verification du bloc intervenant */
//        WebElement element1 = driver.findElement(By.cssSelector("#event_detail_container > div > div.main > div.wrap.wrap-mobile > section.section_programme_event.animated_section.arrived_section > div > div:nth-child(2) > div.event_intervenant_detail.event-item-slider.special1.slick-initialized.slick-slider.slick-dotted"));//Done :) but ...
//        Actions actions1 = new Actions(driver);
//        actions.moveToElement(element1);
//        Thread.sleep(2000);
//        actions.perform();
//        actions.click();
//        Assert.assertTrue(driver.findElement(By.cssSelector("#event_detail_container > div > div.main > div.wrap.wrap-mobile > section.section_programme_event.animated_section.arrived_section > div > div:nth-child(2) > div.display_flex1.event_program > div > h2 > span")).getText().equalsIgnoreCase("les intervenants"));

        /*Verification de l'affichage du slider */

//        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='MN'])[1]/following::p[1]")).click();
//        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='MN'])[1]/following::div[2]")).click();
//        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='MN'])[2]/following::span[1]")).click();
//        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Jermoumi Oussama'])[1]/following::p[1]")).click();
//        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Jermoumi Oussama'])[1]/following::span[1]")).click();
//        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='en partenariat avec'])[1]/following::img[1]")).click();



    }
}