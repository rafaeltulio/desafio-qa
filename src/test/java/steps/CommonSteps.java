package steps;

import cucumber.api.java.pt.Dado;
import util.TestRule;

public class CommonSteps {

    @Dado("^que o usuário acesse a url do sistema$")
    public void acessarUrlSite (){
    String urlSite = "https://demoqa.com/login";
        TestRule.abrirNavegador(urlSite);
    }
}