package org.squashtest.ta.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.regex.Pattern;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.gson.Gson;
import org.squashtest.ta.selenium.Config.*;

public class ConfigTA {
	
	 private boolean acceptNextAlert = true;
	static  private StringBuffer verificationErrors = new StringBuffer();
	static String  username="admin";
	static	String password="admin";
	 static String usernameAndPassword = username + ":" + password;
	 static String authorizationHeaderValue = "Basic " + java.util.Base64.getEncoder().encodeToString( usernameAndPassword.getBytes() );
	
	 static Client client = ClientBuilder.newClient();
	 
	@Before
	public static WebDriver setUp() throws Exception {
	        //System.setProperty("webdriver.chrome.driver","src\\squashTA\\resources\\chromedriver.exe");
		
		//driver = webdriver.Chrome(executable_path="/usr/local/bin/chromedriver");
	        //WebDriver driver = new ChromeDriver();
                System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
                ChromeOptions chromeOptions = new ChromeOptions();
                WebDriver driver = new ChromeDriver(chromeOptions);
	        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	        driver.manage().window().maximize();
	        return driver;
	    }
	
	public static JsonObject GetDatasetById(int id) throws Exception{
		JsonObject jsonobject=null;
		WebTarget target= client.target("http://51.254.229.137:9090/squash/api/rest/latest/test-cases/"+id+"/datasets");
		
		Invocation.Builder invocationBuilder = target.request(MediaType.APPLICATION_JSON)
										             .header("Authorization", authorizationHeaderValue)
										             ;
		Response response=invocationBuilder.get();
		String value = response.readEntity(String.class);
		Gson gson = new Gson();
		jsonobject=gson.fromJson(value,JsonObject.class);
		System.out.println(jsonobject.toString());

		return jsonobject;
	}
	public void GetDatasetByName(){

	}
	public static Test_plan GetTestPlan(int id){
		Test_plan jsonobject=null;
		WebTarget target= client.target("http://127.0.0.1:7900/squash/api/rest/latest/iterations/"+id+"/test-plan");

		Invocation.Builder invocationBuilder = target.request(MediaType.APPLICATION_JSON)
				.header("Authorization", authorizationHeaderValue)
				;
		Response response=invocationBuilder.get();
		String value = response.readEntity(String.class);
		Gson gson = new Gson();
		jsonobject=gson.fromJson(value,Test_plan.class);
		System.out.println(jsonobject.toString());

		return jsonobject;
	}

/*	public Parameter_values[] getParametreVal(int id,String  parameter_name,String dataset_name) throws Exception{

		JsonObject obj=ConfigTA.GetDatasetById(id);
		//JsonObject obj=ConfigTA.GetDatasetById(37);
		System.out.println(obj.get_embedded().getDatasets()[0].toString());
		Parameter_values[] par_val=obj.get_embedded().getDatasets()[0].getParameter_values();

	}*/

	/*public void initTest(int id,String datasetname) throws Exception{
		JsonObject obj=ConfigTA.GetDatasetById(id);
		int size=obj.get_embedded().getDatasets()[0].getParameter_values().length;
		String param_name=obj.get_embedded().getDatasets()[0].getParameter_values()[0].getParameter_name();

	}*/

	public  String GetParameByName(String  name,int id,String dataset_name)throws Exception{
		JsonObject obj=ConfigTA.GetDatasetById(id);
		int size=obj.get_embedded().getDatasets().get(0).getParameter_values().size();
		List<Parameter_values> list_parames_value=GetDatasetsByName(dataset_name,id);
		for (Parameter_values p: list_parames_value) {
			if	(p.getParameter_name().equals(name)){

				System.out.println(p.getParameter_name());
				System.out.println(p.getParameter_value());

				return p.getParameter_value();
			}
		}


//////This method takes the first dataset related to test_case on SquashTM

/*		for (Parameter_values p: obj.get_embedded().getDatasets().get(0).getParameter_values()) {
			if	(p.getParameter_name().equals(name)){

				System.out.println(p.getParameter_name());
				System.out.println(p.getParameter_value());

				return p.getParameter_value();
			}
		}*/
		return null;
	}
	 public List<Parameter_values> GetDatasetsByName(String name_dataset, int test_case_id) throws Exception {
		 JsonObject obj = ConfigTA.GetDatasetById(test_case_id);

		 for (Datasets p : obj.get_embedded().getDatasets()) {
			 if (p.getName().equals(name_dataset)) {

				 System.out.println(p.getName());
				 System.out.println(p.toString());

				 return p.getParameter_values();
			 }
		 }
		 return null;
	 }
	 
//		@After
//	    public static void tearDown() throws Exception {
//	        driver.quit();
//	        String verificationErrorString = verificationErrors.toString();
//	        if (!"".equals(verificationErrorString)) {
//	            fail(verificationErrorString);
//	        }
//	    }
//
//	    private boolean isElementPresent(By by) {
//	        try {
//	            driver.findElement(by);
//	            return true;
//	        } catch (NoSuchElementException e) {
//	            return false;
//	        }
//	    }
//
//	   private boolean isAlertPresent() {
//	        try {
//	            driver.switchTo().alert();
//	            return true;
//	        } catch (NoAlertPresentException e) {
//	            return false;
//	        }
//	    }
//
//	  private String closeAlertAndGetItsText() {
//	        try {
//	            Alert alert = driver.switchTo().alert();
//	            String alertText = alert.getText();
//	            if (acceptNextAlert) {
//	                alert.accept();
//	            } else {
//	                alert.dismiss();
//	            }
//	            return alertText;
//	        } finally {
//	            acceptNextAlert = true;
//	        }
//	    }

}
