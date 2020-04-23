package chainofresponsibility;

import strategy.Orcamento;

public class SemDesconto implements Desconto{

	@Override
	public double desconto(Orcamento orcamento) {
		return 0;
	}

	@Override
	public void setProximo(Desconto proximo) {
		// Não faz nada porque ele não tem próximo! 
	}
	
	

}
