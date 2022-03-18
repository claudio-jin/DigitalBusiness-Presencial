package br.com.fiap.loja.situacao;

import java.math.BigDecimal;

//POJO
public class Pedido {

	private BigDecimal valor;
	private int totalDeItens;
	private Situacao situacao;
	private EventManager manager;
	
	public Pedido(BigDecimal valor) {
		super();
		this.valor = valor;
		this.manager = new EventManager();
		this.setSituacao(new Aberto());
		
		PedidoFacade.criarPedido();
	}
	
	public Pedido(BigDecimal valor, int totalDeItens) {
		super();
		this.valor = valor;
		this.totalDeItens = totalDeItens;
		this.manager = new EventManager();
		this.setSituacao(new Aberto());
		
		PedidoFacade.criarPedido();

	}

	public void abrirChamado() {
		situacao.abrirChamado();
	}
	
	public void pagar() {
		situacao.pagar(this);
	}

	public void entregar() {
		situacao.entregar(this);
	}

	public void cancelar() {
		situacao.cancelar(this);
	}

	public void reabrir() {
		situacao.reabrir(this);
	}

	//Get e set (modificadores de acessos)
	public BigDecimal getValor() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return valor;
	}

	public int getTotalDeItens() {
		return totalDeItens;
	}

	public void setTotalDeItens(int totalDeItens) {
		this.totalDeItens = totalDeItens;
	}

	protected void setSituacao(Situacao situacao) {
		manager.notificar(this);
		this.situacao = situacao;
	}

	public Situacao getSituacao() {
		return this.situacao;
	}

	public EventManager getManager() {
		return manager;
	}
	
}
