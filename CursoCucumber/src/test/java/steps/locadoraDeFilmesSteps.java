package steps;

import static org.junit.Assert.*;

import java.util.Calendar;

import entidades.Filme;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class locadoraDeFilmesSteps {

/* = = = = = = = = Deve alugar um filme com sucesso = = = = = = = = = = = = = = = =*/
	private Filme filme;
	
	@Dado("^um filme com estoque de (\\d+) unidades$")
	public void umFilmeComEstoqueDeUnidades(Integer int1) {
		filme = new Filme();
		filme.setEstoque(int1);
	}
	
	@Dado("que o preço de aluguel seja R$ {double}")
	public void queOPreçoDeAluguelSejaR$(Double valor) {
		filme.setPreco(valor);
	}
	@Quando("alugar")
	public void alugar() {
		filme.setAlugado(true);
	}
	@Então("o preço do aluguel será R$ {double}")
	public void oPreçoDoAluguelSeráR$(double double1) {
		assertTrue("Preço esperado do filme diferente do que está sendo salvo", 
				filme.getPreco() == double1);
	}
	@Então("a data de entrega será no dia seguinte")
	public void aDataDeEntregaSeráNoDiaSeguinte() {
	    
		Calendar hj = Calendar.getInstance();
		
		hj.add(Calendar.DAY_OF_MONTH, 1);

		filme.setDataEntrega(hj.getTime());
	}
	@Então("o estoque do filme será {int} unidade")
	public void oEstoqueDoFilmeSeráUnidade(Integer int1) {
		filme.setEstoque(int1);
	}

/* = = = = = = = = - = = = = = = = = = = = = = = = =*/
}
