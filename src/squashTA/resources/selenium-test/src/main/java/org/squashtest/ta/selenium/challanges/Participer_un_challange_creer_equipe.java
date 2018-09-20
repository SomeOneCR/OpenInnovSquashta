package org.squashtest.ta.selenium.challanges;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import org.squashtest.ta.selenium.Authentification.CreatedAcountAuthentification;
import org.squashtest.ta.selenium.ConfigTA;
import org.squashtest.ta.selenium.Deconnexion;

public class Participer_un_challange_creer_equipe {

    WebDriver driver= null;
    int id_test_case=92;
    String dataset_name="data11111_recette";
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();
    public String call_steps="";
    JavascriptExecutor js = (JavascriptExecutor) driver;


    @Test
    public void testParticiper_un_challange_creer_equipe() throws Exception{
        ConfigTA cf= new ConfigTA();
        driver=ConfigTA.setUp();
        CreatedAcountAuthentification c= new CreatedAcountAuthentification(dataset_name, driver);
        driver=c.testCreatedAcountAuthentificationCall("call",driver,dataset_name);
        Thread.sleep(2000);

        driver.findElement(By.id("challenge_page")).click();
        System.out.println("Scroller");
        Thread.sleep(2000);
        //js.executeScript("window.scrollBy(0,100)");
        Thread.sleep(2000);
        //driver.get("https://inwi-digital.neoxia-maroc.net/challenges");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Challenge en cours'])[1]/following::div[7]")).click();

       // driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='J-45'])[1]/following::h3[1]")).click();
        driver.findElement(By.id("article_1")).click();
        //Verification des elements dans la page chalange
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















        System.out.println("Description ...");

        driver.findElement(By.id("article_2")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Laila Bounacer'])[1]/following::h3[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Vous avez un projet ?'])[1]/following::button[1]")).click();
        Thread.sleep(4000);
        System.out.println("test of model");
        /*if(driver.findElement(By.cssSelector("#cancel_join_requests_and_projects_modal > div.modal-flex > div.modal_dialog > div.modal_content > div.modal_header.clearfix > div.modal_header_title > #title_notif")).isDisplayed())
            driver.findElement(By.id("cancel_join_requests_and_projects")).click();*/

        //driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='créer une équipe'])[1]/following::button[1]")).click();
        System.out.println("Remplir le formulaire");
        driver.findElement(By.name("name_project")).click();
        driver.findElement(By.name("name_project")).clear();
        driver.findElement(By.name("name_project")).sendKeys("ProjectTest1");
        driver.findElement(By.id("logo_project")).sendKeys("C:\\Users\\admin\\Desktop\\cucumber-_-LOGO.png");
        driver.findElement(By.name("name_entity")).click();
        driver.findElement(By.name("name_entity")).clear();
        driver.findElement(By.name("name_entity")).sendKeys("test test1");
        driver.findElement(By.name("legal_status")).click();
        driver.findElement(By.name("legal_status")).clear();
        driver.findElement(By.name("legal_status")).sendKeys("test");
        driver.findElement(By.id("entity_logo")).sendKeys("C:\\Users\\admin\\Desktop\\cucumber-_-LOGO.png");
        Thread.sleep(4000);
        //driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Logo entité'])[1]/following::small[2]")).click();
        driver.findElement(By.name("num_team")).click();
        driver.findElement(By.name("num_team")).clear();
        driver.findElement(By.name("num_team")).sendKeys("1");
        driver.findElement(By.name("num_team")).click();
        driver.findElement(By.name("num_team")).click();
        driver.findElement(By.name("num_team")).clear();
        driver.findElement(By.name("num_team")).sendKeys("2");
        driver.findElement(By.name("experience_years")).click();
        driver.findElement(By.name("experience_years")).clear();
        driver.findElement(By.name("experience_years")).sendKeys("5");
        driver.findElement(By.name("experience_price")).click();
        driver.findElement(By.name("experience_price")).clear();
        driver.findElement(By.name("experience_price")).sendKeys("test tes");
        driver.findElement(By.id("submit_project_general_information")).click();
        // Done
        Thread.sleep(2000);
        driver.findElement(By.name("idea_project")).click();
        driver.findElement(By.name("idea_project")).clear();
        driver.findElement(By.name("idea_project")).sendKeys("test tstestetstesssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssstest tstestetstessssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss");
        //driver.findElement(By.name("concept_project")).click();
        //driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Décrivez votre projet'])[1]/following::div[3]")).click();
        driver.findElement(By.name("concept_project")).click();
        driver.findElement(By.name("concept_project")).clear();
        driver.findElement(By.name("concept_project")).sendKeys("testsettestestetstest tstestetstesssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssstest tstestetstessssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss");
        driver.findElement(By.name("presentation_team")).click();
        driver.findElement(By.name("presentation_team")).clear();
        driver.findElement(By.name("presentation_team")).sendKeys("testsettsetestestest tstestetstesssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssstest tstestetstessssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss");
        driver.findElement(By.name("competitive_analysis")).click();
        driver.findElement(By.name("competitive_analysis")).clear();
        driver.findElement(By.name("competitive_analysis")).sendKeys("yyyyyyyyytest tstestetstesssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssstest tstestetstessssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss");
        driver.findElement(By.name("public_project")).click();
        driver.findElement(By.name("public_project")).clear();
        driver.findElement(By.name("public_project")).sendKeys("efqzefqztest tstestetstesssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssstest tstestetstessssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss");
        driver.findElement(By.name("best_project")).click();
        driver.findElement(By.name("best_project")).clear();
        driver.findElement(By.name("best_project")).sendKeys("dsdsddzdtest tstestetstesssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssstest tstestetstessssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss");
        driver.findElement(By.id("submit_project_description")).click();
        //Done
        //driver.findElement(By.id("rs_link_1_typeSelectBoxIt")).click();
        //driver.findElement(By.name("rs_link1_value")).click();
        //driver.findElement(By.cssSelector("div.mr_10.flex_grow > #rs_link_1_type")).click();
       // driver.findElement(By.cssSelector("div.mr_10.flex_grow > #rs_link_1_type")).sendKeys("facebook.com/index.php");
        //driver.findElement(By.id("rs_link_1_type")).click();
        //driver.findElement(By.id("rs_link_1_type")).sendKeys("facebook.com/index.php");
        //driver.findElement(By.className("default_btn remove-rs-link")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Champ obligatoire.'])[1]/following::button[1]")).click();
        driver.findElement(By.name("youtube_link")).click();
        driver.findElement(By.name("youtube_link")).clear();
        driver.findElement(By.name("youtube_link")).sendKeys("jsndckjsndc");
        driver.findElement(By.id("upload_file")).sendKeys("C:\\Users\\admin\\Desktop\\cucumber-_-LOGO.png");
        driver.findElement(By.name("motivation")).click();
        driver.findElement(By.name("motivation")).clear();
        driver.findElement(By.name("motivation")).sendKeys("test tstestetstesssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssstest tstestetstesssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssstest tstestetstessssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss");
        driver.findElement(By.id("submit_project_attachement")).click();
        //Done
        //driver.findElement(By.id("collaborator_email")).click();
       // driver.findElement(By.id("collaborator_email")).clear();
       // driver.findElement(By.id("collaborator_email")).sendKeys("testtest@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.id("submit_collaborators")).click();

        //Approuver le projet cree dans le backOffice

        ///Deconnexion et connexion avec un autre compte

           // Deconnexion.testDeconnexion(driver);
        //Deconnexion deconnexion= new Deconnexion();
        //deconnexion.testDeconnexion(driver);

        //driver.findElement(By.id("btn-profil")).click();
        Thread.sleep(2000);
        System.out.println("Try to logout... :/");
        //Thread.sleep(2000);
        driver.findElement(By.cssSelector("img.default_icn")).click();
        driver.findElement(By.id("btn-profil")).click();
        Thread.sleep(2000);
        //driver.findElement(By.linkText("se déconnecter")).click();
        driver.findElement(By.cssSelector("#menu_notif_widget_container > div:nth-child(2) > div > ul > li:nth-child(2) > a")).click();
        /*Deconnexion Done :D*/

        //Thread.sleep(4000);
        //WebElement.sendKeys(Keys.RETURN);
        //driver.PressKey(Keys.ENTER);
        //Alert alert = driver.switchTo().alert();

        //alert.accept();//for two buttons, choose the affirmative one
        //driver.switchTo().alert().sendKeys(Keys.ENTER);
        //driver.switchTo().alert().accept();
        //driver.get("https://inwi-digital.neoxia-maroc.net/logout");
        //sdriver.getWindowHandle()


    }
}
