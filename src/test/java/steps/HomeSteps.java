package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Quando;
import pages.HomePage;

public class HomeSteps {

    HomePage homePage =new HomePage();

    @Dado("^acesso a tela de cadastro$")
    public void acessarTelaNovoUsuario() {

        homePage.selecionarBotaoNovoUsuario();
    }

    @Quando("^acesso o menu livraria Book Store$")
    public void acessarLivrariaBook(){
        homePage.selecionarMenuLivraria();
    }

    @Quando("^realizo a pesquisa pelo livro \"([^\"]*)\"$")
    public void pesquisarNomeLivro(String livro){
        homePage.preencherCampoLivro(livro);
    }

    @Quando("^seleciono o livro retornado$")
    public void selecionoLivroRetornado() throws Throwable {
        homePage.selecionarLivroRetornado();
    }
}
