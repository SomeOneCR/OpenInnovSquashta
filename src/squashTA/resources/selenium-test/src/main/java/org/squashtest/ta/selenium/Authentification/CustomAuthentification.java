package org.squashtest.ta.selenium.Authentification;

import org.junit.Test;
import org.squashtest.ta.selenium.CreateAccount.CreateAccountLinkdin;

public class CustomAuthentification {

    @Test
     public void testConstumAuthentification() throws Exception{
        LinkdinAuthentification inst= new LinkdinAuthentification(67, "data1000_recette");
        inst.testLinkdinAuthentification();
        CreateAccountLinkdin inst1= new CreateAccountLinkdin(77,"data1000_recette");
        inst1.testCreateAccountLinkdin();
    }

}
