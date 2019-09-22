import java.util.Random;
import java.util.Scanner;


public class PartidasAleatorias {

    int alterarNumero(int x){
        int xS = x%10;
        int n = x+xS;
        return n;
    }
	
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();
        PartidasAleatorias part = new PartidasAleatorias(); 
        
        System.out.println("----------------------");
        System.out.println("Numero de partidas:   ");
        int p = teclado.nextInt();
        System.out.println("----------------------");
        int maiorPartSemAlt = 0;
        int totG=0;
        int soma =0;
		int mSAlt=0;
		int somaM = 0;
        for(int i =1;i<p+1;i++){
            
            System.out.println("----------------------");
            System.out.println("|Partida "+(i)+"   |");
            System.out.println("----------------------");
            
            int n = -1;
            while(n%11!=0){
                n = aleatorio.nextInt(100)+1;
                System.out.println("Numero gerado: "+n+"   ");
				soma +=n;
                if(n%11!=0){
                    totG += 1; 
                }
                else{
                    n = part.alterarNumero(n);
					soma +=n;
                    break;
                }
				
            }
            System.out.println("Numero gerado: "+n);
            System.out.println("Numeros gerados sem alteracao: "+totG);
            System.out.println("----------------------");
            
            if(totG>mSAlt){
				mSAlt = totG;
                maiorPartSemAlt = i;
				somaM = soma;
            }
            totG = 0;
			soma = 0;
        }
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println(String.format("A partida %d gerou a maior quantidade de algarismos sem repeticao (%d) com soma %d",maiorPartSemAlt,mSAlt,somaM));
        System.out.println("----------------------------------------------------------------------------------------------------");
        
    }     
}
   

  