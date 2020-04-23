package chainofresponsibility;

import strategy.Orcamento;

public class DescontoPorMaisDeQuinhetosReais implements Desconto {

	private Desconto proximo;

	public double desconto(Orcamento orcamento) {
		if(orcamento.getValor() > 500) {
			return orcamento.getValor() * 0.07;
		}
		else {
			return proximo.desconto(orcamento);
		}
	}

	@Override
	public void setProximo(Desconto proximo) {
		this.proximo = proximo;
	}
}
