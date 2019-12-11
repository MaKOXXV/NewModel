#Auto generated Octane revision tag
@1037
@TID1037REV0.17.0
Feature:Manutenção Ocorrências
Como um usuário, Devo possuir acesso para realizar inclusão, consulta,  alteração e exclusão de Ocorrências. 

Background: 
    Given que acesso o sistema SISO
    And preencho o login e senha
    And o sistema apresenta a mensagem de boas vindas
    When optar por selecionar o menu "Gestão Prestadores Odontológicos","Cadastro Prestador","Ocorrências"


	Scenario: Validar consulta  
		When Informar um(a) Prestador existente
        And clicar fora do campo
		Then o sistema apresenta o resultado da busca

	Scenario: Validar Alteração 
		When Informar um(a) Prestador existente
        And clicar fora do campo
        And realizar uma alteração nos dados
        And clicar no botão "Alterar"
		Then o sistema apresenta a mensagem "Operação realizada com sucesso"        
        
        
    Scenario: Validar obrigatoriedade de preenchimento de campos 
		Given Dado que esteja logado no sistema Odonto na aba Cadastro Prestador e Ocorrências
        When Informar um(a) Prestador existente
        And clicar fora do campo
		And preencher somente os campos obrigatórios
        And clicar no botão "Alterar"
		Then O sistema apresenta a mensagem "Operação realizada com sucesso"
        
   Scenario: Validar obrigatoriedade de não preenchimento de campos 
		Given que esteja logado no sistema Odonto na aba Cadastro Prestador e Ocorrências
        When Informar um(a) Prestador existente
        And clicar fora do campo
		And não preencher os campos obrigatórios
        And clicar no botão "Alterar"
		Then o sistema informa a obrigatoriedade do preenchimento de campos
        
   Scenario: Validar  sequência de seleção de campos (tecla TAB)
		Given que esteja logado no sistema Odonto na aba Cadastro Prestador e Ocorrências
        When Informar um(a) Prestador existente
        And clicar fora do campo
		When apertar a tecla Tab do teclado
		Then o sistema permite passar por todos os campos até chegar o último
        
           