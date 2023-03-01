package steps;

import cucumber.api.java.pt.Quando;
import pages.HomePage;
import pages.LoginPage;
import pages.RegistroPage;

public class LoginSteps {
    LoginPage loginPage = new LoginPage();
    RegistroPage registroPage = new RegistroPage();
    HomePage homePage = new HomePage();

    @Quando("^realizo login com sucesso \"([^\"]*)\"$")
    public void realizoLoginComSucesso(String usuario) throws InterruptedException {
        loginPage.preencherLoginSenha(usuario);
        registroPage.validarUserLogado(usuario);
    }

}

