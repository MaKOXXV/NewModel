#Auto generated Octane revision tag
@1036
@TID1036REV0.27.0
Feature:Manutenção Alteração
Como um usuário, Devo possuir acesso para realizar inclusão, consulta,  alteração e exclusão de Alteração. 

Background: 
    Given que acesso o sistema SISO
    And preencho o login e senha
    And o sistema apresenta a mensagem de boas vindas
    When optar por selecionar o menu "Gestão Prestadores Odontológicos","Cadastro Prestador","Alteração"
  
	Scenario: Validar consulta
		When Informar um(a) "Prestador" existente
        And clicar fora do campo
		Then o sistema apresenta o resultado da busca

 @siso @gestaoprestador @cadastroprestador @alteracao @alteracaoprestador
	Scenario: Validar Alteração 
		When Informar um(a) "Prestador" existente
        And alterar os dados do menu "Endereço Atendimento"
        And alterar os dados do menu "Proc.Inclusos x Rede x Endereço"
        And alterar os dados do menu "Proc.Exclusos x Rede x Endereço"
        And alterar os dados do menu "Define negociação de Prestador"
        And alterar os dados do menu "Dados para pagamento"
        And alterar os dados do menu "Documentação"
        And alterar os dados do menu "Entrega / Forma cálculo (geral)"
        And alterar os dados do menu "Isenções de Raio-x"
        And alterar os dados do menu "Isenção de Glosas"
        And alterar os dados do menu "Impostos"
        And clicar no botão "Alterar"
		Then o sistema apresenta a mensagem "Operação Realizada com Sucesso"       
  
	Scenario: Validar exclusão 
		When Informar um(a) "Prestador" existente
        And clicar no botão "Excluir"
		And o sitema apresenta a mensagem "O prestador será excluído fisicamente do Banco de Dados, isto é, todas as suas informações serão deletadas. Confirma a exclusão"
        And clicar no botão "Sim"
        Then O sistema apresenta a mensagem "Operação realizada com sucesso"
             


        
        


