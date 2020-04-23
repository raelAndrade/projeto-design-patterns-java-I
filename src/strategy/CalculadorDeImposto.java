package strategy;

public class CalculadorDeImposto {

	public void realizaCalculo(Orcamento orcamento, Imposto impostoQualquer) {
		double valor = impostoQualquer.calcula(orcamento);
		System.out.println(valor);
		
		/* Remover os ifs */
		//if(imposto.equals("ICMS")) {
			//double icms = new ICMS().calculaICMS(orcamento);
		//}
		//else if(imposto.equals("ISS")) {
			//double iss = new ISS().calculaISS(orcamento);
			//System.out.println(iss);
		//}
	}
	/* Evitar criar vários métodos */
	//public void realizaCalculoISS(Orcamento orcamento) {
		//if(imposto.equals("ICMS")) {
			//double icms = new ICMS().calculaICMS(orcamento);
			//System.out.println(icms);			
		//}
	//}
}
