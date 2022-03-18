package br.com.fiap.loja.situacao;

public abstract class Situacao {

	public abstract void abrirChamado();
	
	public void pagar(Pedido pedido) {
		throw new RuntimeException("N�o pode transitar para PAGO");

	}
	
	public void entregar(Pedido pedido) {
		throw new RuntimeException("N�o pode transitar para ENTREGUE");
	}
	
	public void cancelar(Pedido pedido) {
		throw new RuntimeException("N�o pode transitar para CANCELADO");

	}
	
	public void reabrir(Pedido pedido) {
		throw new RuntimeException("N�o pode transitar para REABRIR");

	}
}
