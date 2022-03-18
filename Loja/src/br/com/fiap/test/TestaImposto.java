package br.com.fiap.test;

import java.math.BigDecimal;

import br.com.fiap.imposto.CalculadoraDeImposto;
import br.com.fiap.loja.imposto.Icms;
import br.com.fiap.loja.imposto.Iss;
import br.com.fiap.loja.situacao.Pedido;

public class TestaImposto {
	public static void main(String[] args) {
		Pedido pedido = new Pedido(new BigDecimal(100));
		CalculadoraDeImposto calculadoraDeImposto = new CalculadoraDeImposto();
		
		calculadoraDeImposto.setImposto(new Iss(null));
		BigDecimal imposto = calculadoraDeImposto.calcular(pedido);
		System.out.println(imposto);
		
		calculadoraDeImposto.setImposto(new Icms(new Iss(null)));
		imposto = calculadoraDeImposto.calcular(pedido);
		System.out.println(imposto);
		
	}
}
