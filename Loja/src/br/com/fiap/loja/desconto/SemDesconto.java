package br.com.fiap.loja.desconto;

import java.math.BigDecimal;

import br.com.fiap.loja.situacao.Pedido;

public class SemDesconto extends Desconto{

	public SemDesconto() {
		super(null);

	}

	@Override
	protected boolean deveAplicar(Pedido pedido) {
		return true;
	}

	@Override
	protected BigDecimal aplicarDesconto(Pedido pedido) {
		return BigDecimal.ZERO;
	}

}
