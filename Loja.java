/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.faec.CarrinhoDeCompras;
/**
 *
 * @author Felipe
 */
public class Loja {
    public static void main(String[] args) {
        Carrinho c = new Carrinho();
        Produto produtos[] = new Produto[5];

        for(int i=0;i<5;i++){
            produtos[i]=new Produto();
            produtos[i].id=i+1;
            produtos[i].nome="Pinga"+1;
            produtos[i].preco=i*2+1;
            c.cliente="Cliente"+1;
            c.id=i+1;
            c.compras.add(produtos[i]);
        }
        c.compras.stream().forEach((i) -> {
            System.out.println(String.format("Produto %d: %s %.2f",i.id,i.nome,i.preco));
        });
    }
}
