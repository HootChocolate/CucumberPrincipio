# language: pt
Funcionalidade: Cadastrar de usuário
	Como um usuário ainda não cadastrado
	Eu quero me cadastrar no aplicativo
	Para que eu tenho um cadastro de usuário no sistema

Cenário: Cadastrar usuário
	Dado um usuário ainda não cadastrado
	Quando o usuário iniciar o processo de cadastramento
	Então o processo de cadastro do usuário é realizado com sucesso
	
Cenário: Cadastrar mercadoria
	Dado que o usuario está logado
	Dado que a mercadoria não está cadastrada
	Quando o usuário cadastrar uma mercadoria
	Então a mercadoria deve estar disponível
	Então o estoque deve estar atualizado