#Auto generated Octane revision tag
@16093
@TID16093REV0.5.0
Feature: Como um usuário, devo possuir acesso para realizar alteração de um cadastro já existente e cadastrar um novo usuário, para o Protal do Candidato e para o Portal do Prestador. O acesso deverá ser validado posteriormente no Portal do Prestador e do Candidato.

Background: 
    Given que acesso o sistema SISO
    And preencho o login e senha
    And o sistema apresenta a mensagem de boas vindas
    When optar por selecionar o menu "Gestão Prestadores Odontológicos" e "Cadastro Prestador"

	Scenario: Alterar o cadastro de um usuário
		When Informar um "login" já existente
        And realizar a alteração do "Dado" desejado
		Then o sistema apresenta a mensagem "Usuário Alterado"

	Scenario Outline: Criar um novo usuário 
		When Informar um "login" ainda não cadastrado
        And clicar fora do campo
        And escolher o "Tipo de usuário"
        And preencher os dados de inclusão 
        And clicar no botão "Incluir"
		And o sistema apresenta a mensagem "Operação realizada com sucesso"
        Then o login é criado para o Portal Desejado

	Examples:
		| Tipo de usuário |
		| Candidato a Credenciamento| 
		| Prestador Equipe Odonto |
        | Prestador Serviço Odonto|
        
        
        
        
