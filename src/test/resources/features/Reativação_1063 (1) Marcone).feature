#Auto generated Octane revision tag
@1063
@TID1063REV0.15.0
Feature:Manutenção Reativação
Como um usuário, Devo possuir acesso para realizar inclusão, consulta,  alteração e exclusão de Reativação. 

Background: 
    Given que acesso o sistema SISO
    And preencho o login e senha
    And o sistema apresenta a mensagem de boas vindas
    When optar por selecionar o menu "Gestão Prestadores Odontológicos","Exclusão Operadora","Reativação"

@siso @gestaoprestador @exclusaooperadora @reativacao @consultarprestadorativo
	Scenario Outline: Validar consulta de Prestador Ativo 
		When Informar um "<Prestador>" existente e Ativo
        And clicar fora do campo
        Then o sitema apresenta a mensagem "Prestador não está excluído em nenhuma operadora."
Examples:
|Prestador     | 
|011215        |    


@siso @gestaoprestador @exclusaooperadora @reativacao @reativaropradoraespecifica
	Scenario Outline:Validar Reativação do Cancelamento uma opeeradora
		When Informar um "<Prestador>" existente e Cancelado 
        And Selecionar a fleg Reativar e informar "<dataReativação>"  
        And Clicar no Botão "Alterar"
		Then o sitema apresenta a mensagem "Operação realizada com sucesso"
 Examples:
|Prestador     | dataReativacao|
|011215        | 01/12/2019    |

@siso @gestaoprestador @exclusaooperadora @reativacao @reativartodasopradora
	Scenario Outline:Validar Reativação do Cancelamento todas operadoras
		When Informar um "<Prestador>" existente e Cancelado 
        And Selecionar a fleg Reativar e informar "<dataReativação>"  
        And Clicar no Botão "Alterar"
		Then o sitema apresenta a mensagem "Operação realizada com sucesso"
 Examples:
|Prestador     | dataReativacao|
|011215        | 01/12/2019    |

