public class Teste{
	public static void main(String [] args){
		Conjunto dezPrimeirosNaturais = new Conjunto(100);//1
		Conjunto cincoPrimeirosPares = new Conjunto(5);//2
		Conjunto cincoPrimeirosImpares = new Conjunto(5);//3
		Conjunto dezPrimeirosPrimos = new Conjunto(10);//4

		for(int i = 0;i < 10;i++){
			dezPrimeirosNaturais.inserirElemento(i);
		}
		
		for(int i = 0;i < 10;i=i+2){
			cincoPrimeirosPares.inserirElemento(i);
		}

		for(int i = 1;i < 10;i=i+2){
			cincoPrimeirosImpares.inserirElemento(i);
		}

		dezPrimeirosPrimos.inserirElemento(1);
		dezPrimeirosPrimos.inserirElemento(2);
		dezPrimeirosPrimos.inserirElemento(3);
		dezPrimeirosPrimos.inserirElemento(5);
		dezPrimeirosPrimos.inserirElemento(7);
		dezPrimeirosPrimos.inserirElemento(11);
		dezPrimeirosPrimos.inserirElemento(13);
		dezPrimeirosPrimos.inserirElemento(17);
		dezPrimeirosPrimos.inserirElemento(19);
<<<<<<< HEAD
		dezPrimeirosPrimos.inserirElemento("UM");
		

		/*//Se o conjunto 4 é subconjunto de si mesmo;
=======
		dezPrimeirosPrimos.inserirElemento("23");
		

		//Se o conjunto 4 é subconjunto de si mesmo;
>>>>>>> 97f20014e52e6909ea0718f7b904980881d98221
		System.out.printf("Se o conjunto 4 é subconjunto de si mesmo? %b\n",dezPrimeirosPrimos.subconjunto(dezPrimeirosPrimos));	
		
		//A pertinência dos conjuntos 2, 3 e 4 no conjunto 1;	
  		System.out.printf("Conjunto 2 está contido no Conjunto 1 %b\n",dezPrimeirosNaturais.subconjunto(cincoPrimeirosPares));	
  		System.out.printf("Conjunto 3 está contido no Conjunto 1 %b\n",dezPrimeirosNaturais.subconjunto(cincoPrimeirosImpares));	
  		System.out.printf("Conjunto 4 está contido no Conjunto 1 %b\n",dezPrimeirosNaturais.subconjunto(dezPrimeirosPrimos));

  		//Se a união de 2 e 3 é igual ao conjunto 1;
  		Conjunto uniao = cincoPrimeirosImpares.conjuntoUniao(cincoPrimeirosPares);
  		boolean igualdade = (uniao.subconjunto(dezPrimeirosNaturais) && dezPrimeirosNaturais.subconjunto(uniao))? true : false;
  		System.out.printf("A união de 2 e 3 é igual a 1? %b\n",igualdade);

  		//Se a intersecção dos conjuntos 1 e 2 é vazia;	
  		Conjunto interseccao = dezPrimeirosNaturais.conjuntoIntersecao(cincoPrimeirosPares);
  		System.out.printf("A intersecção de 1 e 2 é vazia? %b\n",interseccao.conjuntoVazio());

  		//Qual diferença entre os conjuntos 1 e 2;	
  		Conjunto diferenca = dezPrimeirosNaturais.conjuntoDiferenca(cincoPrimeirosPares);
<<<<<<< HEAD
  		diferenca.showElementos();*/
  
=======
  		diferenca.showElementos();

  		//Criei uma classe que recebe qualquer tipo.
  		Conjunto conjuntoMisto = new Conjunto(10);
  		//Adicionei os tipos.
  		conjuntoMisto.inserirElemento(1.25);
  		conjuntoMisto.inserirElemento("UKJ");
  		conjuntoMisto.inserirElemento(1);
  		conjuntoMisto.inserirElemento("Por ");
  		conjuntoMisto.inserirElemento("favor ");
  		conjuntoMisto.inserirElemento("me dá ");
  		conjuntoMisto.inserirElemento("uma nota boa");
  		conjuntoMisto.inserirElemento(dezPrimeirosNaturais);
  	

  		conjuntoMisto.showElementos();//Esse método vai printar só os elementos inteiros de conjuntoMisto
  		conjuntoMisto.showElementosObject();//Esse métod irá printar todos os elementos não inteiros de conjunto misto.
  		

>>>>>>> 97f20014e52e6909ea0718f7b904980881d98221
  	
	}
}