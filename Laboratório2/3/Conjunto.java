<<<<<<< HEAD
import java.lang.*;

public class Conjunto{
	int tamanho;
	Object[] elementos;
	int index = 0;

	public Conjunto(int tamanho){
		this.tamanho = tamanho;
		elementos = new Object[this.tamanho];
	}

	boolean inserirElemento(int elemento){
=======
//Essa classe herda de ConjuntoUniverso que é uma classe que pode receber qualquer objeto. 
public class Conjunto extends ConjuntoUniverso{
	int tamanho;
	int[] elementos;
	int index = 0;

	public Conjunto(int tamanho){
		super(tamanho);
		this.tamanho = tamanho;
		elementos = new int[this.tamanho];
	}

	boolean inserirElemento(int elemento){
		//Quando um int é adicionado ele vai para o vetor elementos, já os objetos vão para o vetor qualquerTipo na classe ConjuntoUniverso. 
>>>>>>> 97f20014e52e6909ea0718f7b904980881d98221
		if(verificarPertinencia(elemento) == false){
			this.elementos[this.index] = elemento;
			this.index++;
			return true;
		}
		return false;	
	}

<<<<<<< HEAD
	boolean inserirElemento(Object elemento){
		this.elementos[this.index] = elemento;
		this.index++;
		return true;	
	}


	boolean verificarPertinencia(Object elemento){
		boolean isInteger = elemento.isInstance(Integer);
		if(!isInteger){
			return false;
		}
=======
	boolean verificarPertinencia(int elemento){
>>>>>>> 97f20014e52e6909ea0718f7b904980881d98221
		for(int i = 0;i<this.index;i++){
			if(elemento == elementos[i]){
				return true;
			}
		}
		return false;
	}

<<<<<<< HEAD
	/*boolean subconjunto(Conjunto A){
=======
	boolean subconjunto(Conjunto A){
>>>>>>> 97f20014e52e6909ea0718f7b904980881d98221
		//O método faz a seguinte pergunta: O conjunto A está contido neste conjunto?
		boolean pertence;
		for(int i = 0;i<A.getIndex();i++){
			pertence = false;
			for(int j = 0;j<this.index; j++){
				if(A.getElemento(i) == this.elementos[j]){
					pertence = true;
				}
			}
			if(pertence == false){
				return false;
			}
		}
		return true;
	}

	Conjunto conjuntoUniao(Conjunto A){
		//Retorna o conjunto União desse conjunto com A
		Conjunto uniao;
		int tamanho = A.getIndex() + this.index + 1;
		uniao = new Conjunto(tamanho);
		int index = 0;
		for(int i = 0;i<A.getIndex();i++){
			uniao.inserirElemento(A.getElemento(i));

		}
		for(int j = 0;j<this.index;j++){
			uniao.inserirElemento(this.elementos[j]);
		}
		return uniao;

	}

	Conjunto conjuntoIntersecao(Conjunto A){
		//Retorna o conjunto intersecção desse conjunto com A
		Conjunto intersecao;
		int tamanho = A.getIndex() + this.index + 1;
		intersecao = new Conjunto(tamanho);
		for(int i = 0;i<A.getIndex();i++){
			for(int j = 0;j<this.index;j++){
				if(A.getElemento(i) == this.elementos[j]){
					intersecao.inserirElemento(this.elementos[j]);
				}
			}
		}
		return intersecao;
	}

	Conjunto conjuntoDiferenca(Conjunto A){
		//O método retorna os elementos deste conjunto sem os elementos de A
		Conjunto intersecao = conjuntoIntersecao(A);
		Conjunto diferenca = new Conjunto(this.index - intersecao.getIndex() + 1);
		boolean pertence;

		
		for(int i = 0;i<this.index;i++){
			boolean contido = false;
			int j = 0;
			while(j<intersecao.getIndex() && !contido){
				if(intersecao.getElemento(j) == this.elementos[i]){
					contido = true;
				}
				j++;
			}
			if(!contido){
				diferenca.inserirElemento(this.elementos[i]);
			}
		}
		return diferenca;
	}
<<<<<<< HEAD

=======
	//Funções auxiliares
>>>>>>> 97f20014e52e6909ea0718f7b904980881d98221
	int getTamanho(){
		return this.tamanho;
	}

	int getIndex(){
		return this.index;
	}

	int getElemento(int index){
		return this.elementos[index];
	}

	void showElementos(){
<<<<<<< HEAD
		//O método criada apenas para printar os elementos do conjunto na tela
=======
		//O método criada apenas para printar os elementos inteiros deste conjunto na tela.
>>>>>>> 97f20014e52e6909ea0718f7b904980881d98221
		for(int i = 0;i < this.index;i++){
			System.out.printf(this.elementos[i]+" ");
		}
		System.out.printf("\n");
	}

<<<<<<< HEAD
=======
	public String toString(){
		String str = "{";
		for(int i = 0;i < this.index;i++){
			str += (i==this.index-1)?this.elementos[i]:this.elementos[i]+",";
		}
		str += "}";
		return str;
	}

>>>>>>> 97f20014e52e6909ea0718f7b904980881d98221
	boolean conjuntoVazio(){
		//Essa o método retorna true se o conjunto estiver vazio e false caso contrário
		boolean vazio = (this.index == 0) ? true : false;
		return vazio;
<<<<<<< HEAD
	}*/
=======
	}
>>>>>>> 97f20014e52e6909ea0718f7b904980881d98221
}