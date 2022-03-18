package br.com.fiap.loja.imposto;

import java.math.BigDecimal;

import br.com.fiap.loja.situacao.Pedido;

//A interface te permite criar varios objetos do tipo "imposto",seguindo sempre um contrato ou modelo imposto
public abstract class Imposto {

	protected Imposto outroImposto;
	
	public Imposto(Imposto outroImposto) {
		super();
		this.outroImposto = outroImposto;
	}

	public abstract BigDecimal calcular(Pedido pedido);
	
	public BigDecimal impostoAplicado(Pedido pedido) {
		BigDecimal valorDoOutroImposto = BigDecimal.ZERO;
		 
		 if(outroImposto != null) {
			 valorDoOutroImposto = outroImposto.calcular(pedido);
		 }
		 
		 return valorDoImposto.add(valorDoOutroImposto);
	}
}
