@history11
Feature: Validação de idade do usuario

  Background: 
    Given esteja na tela tela Swagger
    And MapfreCap API "https://hmlsite.mapfrecap.com.br/WebMapfreCap/WebAPI/swagger/ui/index"
    When validar que estou na pagina MapfreCap API

  Scenario Outline: validar idade "<status>"
    And clicar em pessoa
    And clicar em pessoa/validarIdade
    And inserir dados com a data "<data>" e "<cpf>"
    And clicar em Try it out
    Then "<result>" para quem nasceu em "<datav>"

    Examples: 
      | status                      | cpf         | data                     | result                                                                 | datav |
      | Data menor                  |             | 2003-10-29T18:40:11.619Z | A venda de Títulos de Capitalização é proibida para menores de 16 anos |  2003 |
      #| Data maior                  |             | 2001-10-29T18:40:11.619Z | Titular / Subscritor maior que 16 anos.                                |  2001 |
      #| CPF maior                   | 46125050009 |                          | A venda de Títulos de Capitalização é proibida para menores de 16 anos |  2003 |
      #| CPF menor                   | 16755397075 |                          | Titular / Subscritor maior que 16 anos.                                |  2001 |
      #| CPF maior com data de menor | 46125050009 | 2003-10-29T18:40:11.619Z | A venda de Títulos de Capitalização é proibida para menores de 16 anos |  2003 |
      #| CPF menor com data de maior | 16755397075 | 2001-10-29T18:40:11.619Z | Titular / Subscritor maior que 16 anos.                                |  2001 |
