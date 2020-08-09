package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class PassagensAereasSteps {

	@Dado("^que o ticket[ especial]* é (A.\\d{3})$")
	public void queOTicketÉAF345(String ticket) {
		System.out.println(">>>> Ticket: " + ticket);
	}

	@Dado("^que o valor da passagem é R\\$ (\\d+),(\\d{2})$")
	public void queOValorDaPassagemÉR$(int real, int cent) {
		
	}
	@Dado("^que o nome do passageiro é \"(.{5,20})\"$")
	public void queONomeDoPassageiroÉ(String string) {

//		throw new io.cucumber.java.PendingException();
	}
	@Dado("^que o telefone do passageiro é 9(\\d{3})-(\\d{4})$")
	public void queOTelefoneDoPassageiroÉ(Integer tele, Integer fone) {

//		throw new io.cucumber.java.PendingException();
	}
	@Quando("criar os steps")
	public void criarOsSteps() {

//	    throw new io.cucumber.java.PendingException();
	}
	@Então("o teste vai funcionar")
	public void oTesteVaiFuncionar() {

//		throw new io.cucumber.java.PendingException();
	}

}
