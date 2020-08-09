package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class CadastrarUsuarioSteps {
/* ======================= Cadastrar usuário ================================== */

	@Dado("um usuário ainda não cadastrado")
	public void umUsuárioAindaNãoCadastrado() {
		System.out.println(">>>> Iniciado cadastro de usuário");
		
//	    throw new io.cucumber.java.PendingException();
	}

	@Quando("o usuário iniciar o processo de cadastramento")
	public void oUsuárioIniciarOProcessoDeCadastramento() {
		
//	    throw new io.cucumber.java.PendingException();
	}
	@Então("o processo de cadastro do usuário é realizado com sucesso")
	public void oProcessoDeCadastroDoUsuárioÉRealizadoComSucesso() {
		
//	    throw new io.cucumber.java.PendingException();
	}
	
/* ======================= Cadastrar mercadoria ================================== */
	
	@Dado("que o usuario está logado")
	public void queOUsuarioEstáLogado() {
		System.out.println(">>>> niciado cadastro de mercadoria");
		
//	    throw new io.cucumber.java.PendingException();
	}

	@Dado("que a mercadoria não está cadastrada")
	public void queAMercadoriaNãoEstáCadastrada() {

//	    throw new io.cucumber.java.PendingException();
	}
	@Quando("o usuário cadastrar uma mercadoria")
	public void oUsuárioCadastrarUmaMercadoria() {

//	    throw new io.cucumber.java.PendingException();
	}
	@Então("a mercadoria deve estar disponível")
	public void aMercadoriaDeveEstarDisponível() {

//		throw new io.cucumber.java.PendingException();
	}
	@Então("o estoque deve estar atualizado")
	public void oEstoqueDeveEstarAtualizado() {

//		throw new io.cucumber.java.PendingException();
	}
}
