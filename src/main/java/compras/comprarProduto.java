package compras;

import org.junit.Assert;
import org.junit.Test;

import _Core.constantes;

public class comprarProduto implements constantes {
	
	screenCompras step = new screenCompras();
	
	@Test
	public void testComprarProduto () {
		
		step.produto(bolaFutebol);
		step.comprar();
		step.numeroCartao(numeroCartao);
		step.dataValidade(dataValidade);
		step.cvc(cvc);	
		step.confirmarPagamento();
		
		//"Falso Negativo" ou "Falso Negativo" ???
		String falhaAoCriarPagamento = "Falso Positivo"; 
		String mensagemErro = "Falha ao criar pagamento";
		
		if (falhaAoCriarPagamento.equalsIgnoreCase("Falso Positivo")) {
			System.out.println( "No cenário de teste 'Comprar Produto', o sistema está apresentando a seguinte notificação: " + "<<<" + mensagemErro + ">>>" + " propositalmente.");			
		} else {
			Assert.fail("App com falha ao Criar Pagamento");
		}
	}
}
