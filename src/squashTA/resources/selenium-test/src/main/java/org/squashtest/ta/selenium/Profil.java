package org.squashtest.ta.selenium;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.squashtest.ta.selenium.Authentification.CreatedAcountAuthentification;

import java.util.List;

public class Profil {
    WebDriver driver = null;
    int id_test_case = 94;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();
    String dataset_name="data11111_recette";

/*    public CreatedAcountAuthentification(int id_test_case,String dataset_name,WebDriver driver){
        this.dataset_name=dataset_name;
        this.id_test_case=id_test_case;
        this.driver=driver;
    }*/
// id input file profil =change_profile_img
// piece jointe id =account_files
    @Test
    public void testProfil() throws Exception {
        ConfigTA cf= new ConfigTA();
        driver=ConfigTA.setUp();
        CreatedAcountAuthentification c= new CreatedAcountAuthentification(dataset_name, driver);
        driver=c.testCreatedAcountAuthentificationCall("call",driver,dataset_name);
        Thread.sleep(2000);
        driver.findElement(By.id("btn-profil")).click();
        driver.findElement(By.linkText("mon compte")).click();

        //Assert.assertEquals(driver.findElement(By.className("profil_detail")).getText(),"Rakhim Test");
        // Assert.assertTrue((driver.findElement(By.className("profil_detail")).getText()).contains(cf.GetParameByName("out_user_name",id_test_case,"data101_recette")));
       // driver.findElement(By.cssSelector("button.edition_profile_switcher")).click();

        // verification de profil
        Thread.sleep(2000);
        //driver.findElement(By.id("profile_name")).click();
        //driver.findElement(By.id("profile_name")).clear();
        //driver.findElement(By.id("profile_name")).sendKeys("Rakhimnew");
       // driver.findElement(By.id("profile_prenom")).click();
        //driver.findElement(By.id("profile_prenom")).clear();
        //driver.findElement(By.id("profile_prenom")).sendKeys("Chaimaenew");
        //driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='champ obligatoire.'])[2]/following::button[1]")).click();
        //driver.findElement(By.cssSelector("#account_form > div.section_profile_head > div > div > div.profile_btn_action.special > button")).click();
        //section_profile_head
        //driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='prénom'])[1]/following::button[1]")).click();
        //driver.findElement(By.className("section_profile_head")).click();
        // 1 driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='prénom'])[1]/following::button[1]")).click();
        driver.findElement(By.className("profile_form_head")).click();//this works
        Thread.sleep(2000);
        driver.findElement(By.id("profile_name")).click();
        driver.findElement(By.id("profile_name")).clear();
        driver.findElement(By.id("profile_name")).sendKeys("Rakhimn");
        driver.findElement(By.id("profile_prenom")).click();
        driver.findElement(By.id("profile_prenom")).clear();
        driver.findElement(By.id("profile_prenom")).sendKeys("Chaimaen");
        //Done :D

        //Assert
       // Assert.assertTrue(driver.findElement(By.id("profile_name")).getAttribute(""));
       // driver.findElement(By.xpath("//form[@id='account_form']/div/div/div/div[3]/button")).click();
       // driver.findElement(By.className("control_container")).click();
        driver.findElement(By.xpath("//*[@id=\"general_info_section\"]/ul/li/div[2]/div[1]/div[1]/div[3]")).click();//This works too :D
        Thread.sleep(4000);
        //driver.findElement(By.id("dp1536593447555")).click();
        //Date picker
/*        WebElement dateWidget = driver.findElement(your locator);
        List<WebElement> columns=dateWidget.findElements(By.tagName("td"));

        for (WebElement cell: columns){
            //Select 13th Date
            if (cell.getText().equals("13")){
                cell.findElement(By.linkText("13")).click();
                break;
            }*/
        //Assert.assertThat(driver.findElement(By.id("dp1536740421647")).getText());
        System.out.println("Date de naissance verification ... :/ ");
        Assert.assertTrue(driver.findElement(By.cssSelector("#general_info_section > ul > li > div.accordion_content > div:nth-child(1) > div:nth-child(1) > div.profile_info > label")).getText().contains("date de naissance"));
        //Verifier format Date
        System.out.println("Date verification ... :/ ");

        String DATEREGEX="^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[1,3-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";

        driver.findElement(By.cssSelector("#general_info_section > ul > li > div.accordion_content > div:nth-child(1) > div:nth-child(1) > div.profile_info > div")).click();

        //WebElement dateBox = driver.findElement(By.id("#ui-datepicker-div > table"));//dayes table

        //Fill date as mm/dd/yyyy as 09/25/2013

        String birthday="30-janvier -1995";
        String[] br=birthday.split("-");
        String day=br[0];
        //Years select
        driver.findElement(By.cssSelector("#ui-datepicker-div > div > div > select")).click();
        Select dropdownYears= new Select(driver.findElement(By.cssSelector("#ui-datepicker-div > div > div > select")));
        dropdownYears.selectByVisibleText(br[2]);
        System.out.println("sddcdcdc");

        //Day selection
        WebElement dateWidgetFrom = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Suivant'])[1]/following::div[1]"));
        //System.out.println("sddcdcdc");
        //driver.findElement(By.linkText("30")).click();
        //Done

       /* WebElement previous=driver.findElement(By.className("ui-datepicker-prev ui-corner-all"));
        WebElement next=driver.findElement(By.className("ui-datepicker-next ui-corner-all"));
        previous.click();
        previous.click();
        previous.click();
        previous.click();
        previous.click();
        previous.click();*/

        //Select month
        while(!driver.findElement(By.cssSelector("#ui-datepicker-div > div > div > span")).getText().equals("janvier")){
            driver.findElement(By.cssSelector("#ui-datepicker-div > div > a.ui-datepicker-prev.ui-corner-all")).click();
            Thread.sleep(2000);

        }


        System.out.println(driver.findElement(By.cssSelector("#ui-datepicker-div > div > div > span")).getText());
        driver.findElement(By.linkText(br[0])).click();


        //This are the rows of the from date picker table
        //List<WebElement> rows = dateWidgetFrom.findElements(By.tagName("tr"));

        //This are the columns of the from date picker table
        /*List<WebElement> columns = dateWidgetFrom.findElements(By.tagName("td"));
        System.out.println(columns.toString());
        for (WebElement cell: columns) {
            *//*
            //If you want to click 18th Date
            if (cell.getText().equals("18")) {
            *//*
            System.out.println(cell.getText());
            //Select Today's Date
            if (cell.getText().equals("27")) {
                System.out.println(cell.getText());
                cell.click();
                cell.click();
                break;
            }
        }*/

        //Wait for 4 Seconds to see Today's date selected.
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Assert.assertTrue((driver.findElement(By.id("dp1536740421647")).getText()).matches(DATEREGEX));
        System.out.println("Date verification Done :D ");

        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='*'])[4]/following::span[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='champ obligatoire.'])[4]/following::button[1]")).click();

        driver.findElement(By.id("edit_account_city")).click();
        driver.findElement(By.id("edit_account_city")).clear();
        driver.findElement(By.id("edit_account_city")).sendKeys("TestCity");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='champ obligatoire.'])[5]/following::button[1]")).click();
        driver.findElement(By.id("edit_account_tel")).click();
        driver.findElement(By.id("edit_account_tel")).clear();
        driver.findElement(By.id("edit_account_tel")).sendKeys("06251487965");
        System.out.println("Phone number verification ... :/ ");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='champ obligatoire.'])[6]/following::button[1]")).click();
        driver.findElement(By.id("edit_account_function")).click();
        driver.findElement(By.id("edit_account_function")).clear();
        driver.findElement(By.id("edit_account_function")).sendKeys("FonctionTest");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='champ obligatoire.'])[7]/following::button[1]")).click();
        //Thread.sleep(2000);
        driver.findElement(By.id("edit_account_entreprise")).click();
        driver.findElement(By.id("edit_account_entreprise")).clear();
        driver.findElement(By.id("edit_account_entreprise")).sendKeys("Ecole Test");
        //Done :D

        System.out.println("metier vref .... :/");
        driver.findElement(By.xpath("//div[@id='general_info_section']/ul/li/div[2]/div[4]/div/div[3]/button")).click();
        driver.findElement(By.cssSelector("#general_info_section > ul > li > div.accordion_content > div:nth-child(4) > div:nth-child(1) > div.profile_info > div")).click();

        //System.out.println("metier vref :D");
        //driver.findElement(By.id("type_profile")).click();
        //driver.findElement(By.id("type_profile")).click();
        Thread.sleep(2000);
        Select dropdown = new Select(driver.findElement(By.name("type_profile")));
        dropdown.selectByIndex(2);
        System.out.println("Veref metier Done :D");

        System.out.println("Veref Niveau d'etude ... :/");

        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='champ obligatoire.'])[9]/following::button[1]")).click();





        driver.findElement(By.cssSelector("#general_info_section > ul > li > div.accordion_content > div:nth-child(4) > div:nth-child(2) > div.profile_info > div > div")).click();
        //driver.findElement(By.name("studies_level")).click();
        //driver.findElement(By.name("studies_level")).click();
        Select dropdown1 = new Select(driver.findElement(By.name("studies_level")));
        dropdown1.selectByIndex(18);
        System.out.println("Veref Niveau d'etude Done :D");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='champ obligatoire.'])[11]/following::button[1]")).click();
        driver.findElement(By.name("experience_years")).click();
        driver.findElement(By.name("experience_years")).clear();
        driver.findElement(By.name("experience_years")).sendKeys("5");

        // Done

        driver.findElement(By.id("account_files")).sendKeys("C:\\Users\\admin\\Desktop\\cucumber-_-LOGO.png");
        Thread.sleep(4000);

        //driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='pièces jointes'])[2]/following::img[1]")).click();

        //driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='témoignage'])[2]/following::button[1]")).click();

        driver.findElement(By.cssSelector("#general_info_section > ul > li > div.accordion_content > div:nth-child(7) > div")).click();
        driver.findElement(By.id("edit_account_temoignage")).click();
        driver.findElement(By.id("edit_account_temoignage")).clear();
        driver.findElement(By.id("edit_account_temoignage")).sendKeys("thhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        //Done
       // driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='témoignage'])[2]/following::button[2]")).click();

        //driver.findElement(By.linkText("enregistrer")).click();

        // Verification de la photo de profil C:\Users\admin\Desktop\XEUt2.png
        driver.findElement(By.id("change_profile_img")).sendKeys("C:\\Users\\admin\\Desktop\\XEUt2.png");
        Thread.sleep(4000);
        driver.findElement(By.cssSelector("#general_info_section > ul > li > div.accordion_content > div.align_center.p_25 > button")).click();//Submit


    }
}
