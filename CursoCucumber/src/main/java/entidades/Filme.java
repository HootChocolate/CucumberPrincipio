package entidades;

import java.util.Date;

public class Filme {

	private double preco;
	private Date dataEntrega;
	private int estoque;
	private boolean alugado;
	

	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public Date getDataEntrega() {
		return dataEntrega;
	}
	
	public void setDataEntrega(Date dataEntrega) {
		this.dataEntrega = dataEntrega;
	}
	
	public int getEstoque() {
		return estoque;
	}
	
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	public boolean getAlugado() {
		return this.alugado;
	}
	
	public void setAlugado(boolean alugado) {
		this.alugado = alugado;
	}
	
	@Override
	public String toString() {
		return "====== Dados do filme ======"
				+ "\nPreco: " + preco
				+ "\nData de Entrega: " + dataEntrega
				+ "\nEstoque: " + estoque
				+ "\nAlugado: " + alugado
				+ "\n==================";
	}
}






