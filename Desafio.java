package Testes;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/**
 *
 * @author Felipe
 */
public class Desafio {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        Map <String,Float> tab = new HashMap <>();
        tab.put("A", 15.400f);
        tab.put("C", 7.400f);
        tab.put("G", 11.500f);
        tab.put("T", 8.700f);
        tab.put("AA", 27.400f);
        tab.put("CC", 14.600f);
        tab.put("GG", 21.600f);
        tab.put("TT", 16.800f);
        tab.put("AC", 21.200f);
        tab.put("AG", 25.000f);
        tab.put("AT", 22.800f);
        tab.put("TA", 23.400f);
        tab.put("TG", 19.000f);
        tab.put("TC", 18.000f);
        tab.put("GC", 17.600f);
        tab.put("GA", 25.000f);
        tab.put("GT", 20.000f);
        tab.put("CA", 21.200f);
        tab.put("CG", 18.000f);
        tab.put("CT", 15.200f);
        
        System.out.println("Digite a sequência: ");        
        String seq =tec.nextLine();
        seq = seq.toUpperCase();
        String [] elementos = seq.split("");
        
        float iso =0;
        float pares=0;
        for (String elemento : elementos) {
            if(tab.containsKey(elemento)){
                iso=iso+tab.get(elemento);
            }
        }
        for(int i=0;i<elementos.length-1;i++){            
            if(tab.containsKey(elementos[i]+""+elementos[i+1])){
                pares=pares+tab.get(elementos[i]+""+elementos[i+1]);
            }
        }
        System.out.println("Sequencia: "+seq);
        System.out.println(String.format("Pares:     %.3f",pares));
        System.out.println(String.format("Isolados:  %.3f", iso)); 
    }
}
