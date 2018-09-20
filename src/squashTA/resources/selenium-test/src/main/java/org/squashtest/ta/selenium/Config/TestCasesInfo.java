package org.squashtest.ta.selenium.Config;

import com.google.gson.Gson;
import org.squashtest.ta.selenium.ConfigTA;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

public class TestCasesInfo {
    private boolean acceptNextAlert = true;
    static  private StringBuffer verificationErrors = new StringBuffer();
    static String  username="admin";
    static	String password="admin";
    static String usernameAndPassword = username + ":" + password;
    static String authorizationHeaderValue = "Basic " + java.util.Base64.getEncoder().encodeToString( usernameAndPassword.getBytes() );

    static Client client = ClientBuilder.newClient();

    public List<TestCaseTM> testCaseTMS;

    public static TestCaseTM  GetTestCase(int id){

        TestCaseTM testCaseTM=null;
        WebTarget target= client.target("http://127.0.0.1:7900/squash/api/rest/latest/test-cases/"+id);

        Invocation.Builder invocationBuilder = target.request(MediaType.APPLICATION_JSON)
                .header("Authorization", authorizationHeaderValue)
                ;
        Response response=invocationBuilder.get();
        String value = response.readEntity(String.class);
        Gson gson = new Gson();
        testCaseTM=gson.fromJson(value,TestCaseTM.class);
        System.out.println(testCaseTM.toString());

        return testCaseTM;

    }
/*    public static TestCasesInfo GetTestCase(int id) throws Exception{
        List<Datasets> datasets= ConfigTA.GetDatasetById(id).get_embedded().getDatasets();

    }*/
    /*public static List<TestCaseTM> GetAllTestCases(){
        TestCaseTM testCaseTM=null;
        WebTarget target= client.target("http://127.0.0.1:7900/squash/api/rest/latest/test-cases/");

        Invocation.Builder invocationBuilder = target.request(MediaType.APPLICATION_JSON)
                .header("Authorization", authorizationHeaderValue)
                ;
        Response response=invocationBuilder.get();
        String value = response.readEntity(String.class);
        Gson gson = new Gson();
        testCaseTM=gson.fromJson(value,TestCaseTM.class);
        System.out.println(testCaseTM.toString());

       // return testCaseTM;
    }*/
}
