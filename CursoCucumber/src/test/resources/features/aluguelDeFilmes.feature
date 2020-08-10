# language: pt
Funcionalidade: Locadora
	Como um usuario
	Eu quero cadastrar aluguéis de filmes
	Para controlar preços e datas de entrega

Cenário: Deve alugar um filme com sucesso
	Dado um filme com estoque de 2 unidades
	E que o preço de aluguel seja R$ 3,00
	Quando alugar
	Então o preço do aluguel será R$ 3,00
	E a data de entrega será no dia seguinte
	E o estoque do filme será 1 unidade

#Cenário: Não deve alugar filme sem estoque
#	Dado um filme com estoque de 0 unidades
#	Quando alugar
#	Então não será possível por falta de estoque
#	E o estoque do filme serś 0 unidades
#
#Cenário: Deve dar condições especiais para categoria extendida
#	Dado um filme com estoque de 2 unidades
#	E que o preço de aluguel sejá R$ 4,00
#	E que o tipo do aluguel seja extendido
#	Quando alugar
#	Então o preço do aluguel será R$ 8,00
#	E a data de entrega será em 3 dias
#	E a pontuação recebida será de 2 pontos
	
	