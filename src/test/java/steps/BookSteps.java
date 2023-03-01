package steps;

import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.BookPage;

public class BookSteps {

    BookPage bookPage = new BookPage();

    @Quando("^valido o código ISBN \"([^\"]*)\" e o nome do autor \"([^\"]*)\"$")
    public void validarInformacoesDoLivro(String codigoIbsn, String nomeAutor) throws InterruptedException {
        Thread.sleep(10);
        bookPage.validarCodigoIbsn(codigoIbsn);
        bookPage.validarNomeAutor(nomeAutor);
    }

    @Quando("^adiciono o livro a coleção$")
    public void adicionoOLivroAColeção() {
        bookPage.addLivroColecao();
    }

    @Quando("^retorne ao menu profile$")
    public void retorneAoMenuProfile() {
        bookPage.selecionarMenuProfile();
    }

    @Então("^o livro \"([^\"]*)\" deve estar adicionado com sucesso$")
    public void validarLivroAdicionadoSucesso(String book) {
        bookPage.verificarLivro(book);
    }

}
