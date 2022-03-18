package br.com.fiap.loja.situacao;

public class PedidoFacade {
//facade serve para chamar todas as funcionalidades internas
	public static void criarPedido() {
		System.out.println("Consultar sistema do Serasa");
		System.out.println("Chamada para API de estoque");
		System.out.println("Validar logistica");
		System.out.println("Gravar os dados no CRM");		
	}
}
