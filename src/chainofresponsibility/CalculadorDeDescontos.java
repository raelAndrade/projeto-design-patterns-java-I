package chainofresponsibility;

import strategy.Orcamento;

public class CalculadorDeDescontos {

	public double calcula(Orcamento orcamento) {

		Desconto d1 = new DescontoPorMaisDeCincoItens();
		Desconto d2 = new DescontoPorMaisDeQuinhetosReais();
		Desconto d3 = new SemDesconto();
		
		d1.setProximo(d2);
		d2.setProximo(d3);
		
		return d1.desconto(orcamento);
				
		/*double desconto = new DescontoPorCincoItens().desconto(orcamento);
		if(desconto == 0) desconto = new DescontoPorMaisDeQuinhetosReais().desconto(orcamento);
		
		return 0;*/
		
		// mais de 5 itens, desconto!
		/*if(orcamento.getItens().size() > 5) {
			return orcamento.getValor() * 0.1;
		}*/
		// em caso contrario ...
		/*else if(orcamento.getValor() > 500.0) {
			return orcamento.getValor() * 0.07;
		}*/
	}
}
