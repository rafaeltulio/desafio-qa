package steps;

import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import net.datafaker.Faker;
import pages.HomePage;
import pages.LoginPage;
import pages.RegistroPage;

public class RegistroSteps {
    RegistroPage registroPage = new RegistroPage();
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    Faker faker = new Faker();

    //String userName = faker.name().username();
    String userName = "leonila.barton";

    @Quando("^informo os dados do campo nome \"([^\"]*)\"$")
    public void informarNome(String nome) throws Throwable {
        registroPage.preencherNome(nome);
    }

    @Quando("^informo os dados do campo sobrenome \"([^\"]*)\"$")
    public void informarSobreNome(String sobrenome) throws Throwable {
        registroPage.preencherSobreNome(sobrenome);
    }

    @Quando("^preencho os dados de nome de usuário$")
    public void informarUsuario() throws Throwable {
        registroPage.preencherUsuario(userName);
        System.out.println("Usuário criado " +userName);
    }

    @Quando("^preencho os dados do campo senha \"([^\"]*)\"$")
    public void informarSenha(String senha) throws Throwable {
        registroPage.preencherSenha(senha);
    }

    @Quando("^seleciono o captcha$")
    public void seleciocarCaptcha() throws Throwable {
        registroPage.clicarCaptcha();
    }
    @Quando("^seleciono o botão Registro$")
    public void selecionarBotaoRegistro() throws InterruptedException {
        registroPage.clickRegistroButton();
    }

    @Então("^recebo a mensagem de erro \"([^\"]*)\"$")
    public void receboAMensagemDeErro(String mensagemErro) {

        registroPage.validarMensagemErro(mensagemErro);
    }
    @Então("^devo validar o login criado com sucesso$")
    public void validarLoginSucesso() throws Throwable {
        String usuarioCriado = userName;
        registroPage.acessarLogin();
        registroPage.preencherLoginSenha(usuarioCriado);
        registroPage.validarUserLogado(usuarioCriado);
    }


}

