#Auto generated Octane revision tag
@1263 @GestaoPrestador
@TID1263REV0.5.0
Feature:Manutenção Ocorrências
Como um usuário, Devo possuir acesso para realizar inclusão, consulta,  alteração e exclusão de Ocorrências. 

Background: 
    Given que acesso o sistema SISO
    And preencho o login e senha
    And o sistema apresenta a mensagem de boas vindas
    When optar por selecionar o menu "Gestão Prestadores Odontológicos","Consulta Prestador","Ocorrências"

	
	Scenario: Validar consulta de Ocorrências 
		When selecionar um(a) Prestrador existente
        And  And clicar fora do campo
		Then o sistema apresenta o resultado da busca

	