//Nome: Franklyn Seabra Rogério Bezerra, Matricula: 397847
//Nome: Matheus Sousa Correia Matricula: 400501
class Operando implements Expression{
	double valor;

	Operando(double valor){
		this.valor = valor;
	}

	@Override
	public double calcular(){
		return this.valor;
	}
}
