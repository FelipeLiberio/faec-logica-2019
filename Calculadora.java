/**
	Classe que simula cálculos aritiméticos entre dois numeros inteiros.
	
	@autor FelipeLiberio
	@since 09-09-19	
*/
public class Calculadora{
	int n1, n2;
	int obterResto (int x, int y){
		//int restDiv = x%y;
		int q = x/y;
		int restDiv = x-q*y;
		return restDiv;
	}
	void imprimirRestos (int [] vetX, int[] vetY, int tam){
		for (int i=0; i<tam; i++){
			int resto = calc.obterResto(vetX[i],vet[i]);
			System.out.println(resto);
		}
		
	}
	
	public static void main (String [] args){
		Calculadora calc = new Calculadora();
		calc.n1 = 10;
		calc.n2 = 3;
		int resto = calc.obterResto(calc.n1,calc.n2);
		System.out.println(String.format("O resto da divisao de %d e por %d e %d",calc.n1,calc.n2,resto));
		for(int i=0; i<5; i++){
			int vetX[i] = 
		}	
	}
}