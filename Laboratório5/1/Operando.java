//Nome: Franklyn Seabra Rogério Bezerra, Matricula: 397847
//Nome: Matheus Sousa Correia Matricula: 400501
class Operando extends Expression{
	double valor;

	Operando(double valor){
		this.valor = valor;
	}

	double calcular(){
		return this.valor;
	}
}
