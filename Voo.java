package br.edu.faec.aviacao;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/**
 *
 * @author 55419
 */
public class Voo {
    public static void main(String[] args) {
        List<Passageiro> lista = new ArrayList<>();
        Documento doc = new Documento();
        int [] idades = {15,30,55,68,72};
        
        for(int i=0;i<5;i++){
            Passageiro p = new Passageiro();
            p.nome="Joao"+i;                   
            p.numAssento=i;
            doc.tipo = TipoDocumento.Rg;
            p.idade = idades[i];
            doc.Num="001"+i+i*2;
            lista.add(p);
        }
        
        for(Passageiro i: lista)
            System.out.println(i.nome);
        
        LinkedList<Passageiro> diMenor = new LinkedList();
        LinkedList<Passageiro> veio = new LinkedList();
        LinkedList<Passageiro> adult = new LinkedList();

        lista.forEach((i) -> {
            if(i.idade<18){
                diMenor.add(i);
            }else{
                if(i.idade>=65){
                    veio.add(i);
                }else{
                    if(i.idade>=18||i.idade<65){
                        adult.add(i);
                    }
                }
            }
        })
