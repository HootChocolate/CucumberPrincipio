# language: pt
Funcionalidade: Prazo de entregas
	Como um usuário com uma entrega pendente
	Eu quero verificar o prazo de entrega da minha mercadoria
	Para eu saber o tempo que ainda falta para a mercadoria chegar

Cenário: Validar prazo de entrega
	Dado que o usuário esteja logado
	Dado que a data de entrega seja dia 01/01/2000
	Quando a entrega atrasar 2 dia
	Então a data da entrega deve ser dia 03/01/2000
	
Cenário: Atraso na entrega de uma sprint
	Dado que o usuário esteja logado
	Dado que a data de entrega seja dia 11/05/2015
	Quando a entrega atrasar 2 dias
	Então a data da entrega deve ser dia 13/05/2015