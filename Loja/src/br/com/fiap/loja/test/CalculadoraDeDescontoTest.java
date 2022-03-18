package br.com.fiap.loja.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

import br.com.fiap.loja.desconto.CalculadoraDeDesconto;
import br.com.fiap.loja.situacao.Pedido;

class CalculadoraDeDescontoTest {

	@Test
	void deveRetornarZeroCasoNenhumDescontoSejaAplicado() {
		Pedido pedido = new Pedido(new BigDecimal(100), 2);
		CalculadoraDeDesconto calculadoraDeDesconto = new CalculadoraDeDesconto();
		BigDecimal desconto = calculadoraDeDesconto.calcular(pedido);
		
		assertEquals(new BigDecimal("0.00"), desconto);
	}
	
	@Test
	void deveRetornarDescontoParaPedidosCaros() {
		Pedido pedido = new Pedido(new BigDecimal(1000), 2);
		CalculadoraDeDesconto calculadoraDeDesconto = new CalculadoraDeDesconto();
		BigDecimal desconto = calculadoraDeDesconto.calcular(pedido);
		
		assertEquals(new BigDecimal("100.00"), desconto);
	}
	
	@Test
	void deveRetornarDescontoParaPedidosGrandes() {
		Pedido pedido = new Pedido(new BigDecimal(100), 50);
		CalculadoraDeDesconto calculadoraDeDesconto = new CalculadoraDeDesconto();
		BigDecimal desconto = calculadoraDeDesconto.calcular(pedido);
		
		assertEquals(new BigDecimal("5.00"), desconto);
	}

}
