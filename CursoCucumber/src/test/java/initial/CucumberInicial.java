package initial;

import static org.junit.Assert.*;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class CucumberInicial {
	
	private int contador = 0 ;
	
	@Dado("que o usuário esta logado")
	public void queOUsuárioEstaLogado() {
		System.out.println("O USUARIO ESTÁ LOGADO");
		
//	    throw new io.cucumber.java.PendingException();
	}

	@Dado("que a conta ainda não existe")
	public void queAContaAindaNãoExiste() {
		System.out.println("A CONTA AINDA NAO EXISTE");
		
//	    throw new io.cucumber.java.PendingException();
	}
	@Quando("for adicionado a conta no servidor")
	public void forAdicionadoAContaNoServidor() {
		System.out.println("A CONTA FOI ADICIONADA NO SERVIDOR");

//	    throw new io.cucumber.java.PendingException();
	}
	@Então("deve ser validado a mensagem de feedback")
	public void deveSerValidadoAMensagemDeFeedback() {
		System.out.println("VALIDADO A MENSAGEM");

//	    throw new io.cucumber.java.PendingException();
	}
	@Então("deve validar que a conta existe")
	public void deveValidarQueAContaExiste() {
		System.out.println("A CONTA AINDA NAO EXISTE");

//	    throw new io.cucumber.java.PendingException();
	}
	
	@Então("um novo passo")
	public void umNovoPasso() {
		System.out.println("NOVO PASSO");
		
//	    throw new io.cucumber.java.PendingException();
	}
	
	@Dado("que o valor do meu contador é {int}")
	public void queOValorDoMeuContadorÉ(Integer valor) {
	    contador = valor;
	}

	@Quando("eu adicionar ao contador mais {int}")
	public void euAdicionarAoContadorMais(Integer valor) {
	    contador += valor;
	}
	
	@Então("o valor do contador deve ser {int}")
	public void oValorDoContadorDeveSer(Integer valor) {
	    assertTrue("Houve erro no validador do contador", valor == contador);
	}
}
