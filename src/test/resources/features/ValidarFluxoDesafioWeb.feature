#language: pt
#encoding: utf-8
Funcionalidade: Validar cadastro de usuário

  Contexto:
    Dado que o usuário acesse a url do sistema

  @teste-desafio
  Cenario: Realizar cadastro com password numérico
    Quando acesso a tela de cadastro
    E informo os dados do campo nome "Rafael"
    E informo os dados do campo sobrenome "Tulio"
    E preencho os dados de nome de usuário
    E preencho os dados do campo senha "12345"
    E seleciono o captcha
    E seleciono o botão Registro
    Então recebo a mensagem de erro "As senhas devem ter pelo menos um caractere não alfanumérico, um dígito ('0'-'9'), uma letra maiúscula ('A'-'Z'), uma minúscula ('a'-'z'), um caractere especial e A senha deve ter oito caracteres ou mais."

  @teste-desafio
  Cenario: Realizar cadastro com sucesso
    Quando acesso a tela de cadastro
    E informo os dados do campo nome "Rafael"
    E informo os dados do campo sobrenome "Tulio"
    E preencho os dados de nome de usuário
    E preencho os dados do campo senha "Qa292808@"
    E seleciono o captcha
    E seleciono o botão Registro
    Então devo validar o login criado com sucesso

  @teste-desafio
  Cenario: Acessar Ebook da livraria
    Quando realizo login com sucesso "tulio.rafael"
    E acesso o menu livraria Book Store
    E realizo a pesquisa pelo livro "Git Pocket Guide"
    E seleciono o livro retornado
    E valido o código ISBN "9781449325862" e o nome do autor "Richard E. Silverman"
    E adiciono o livro a coleção
    E retorne ao menu profile
    Então o livro "Git Pocket Guide" deve estar adicionado com sucesso

