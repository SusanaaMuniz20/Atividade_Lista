package Principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import entites.Produtos;

public class nomeProdutos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nome = "Leite";
		int quantidade = 12;
		double preço = 9.00;
		
		Produtos produto;
		Scanner sc = new Scanner (System.in);
		ArrayList<Produtos> produtos = new ArrayList<>();
		
		for(int i = 1; i <4; i ++) {
		   produto = new Produtos();
		
		System.out.println("Insira o nome do produto:  ");
		produto.setNome(sc.nextLine());
		
		System.out.println("Insira a quantidade do produto:  ");
		produto.setQuantidade(sc.nextInt());
		
		System.out.println("Insira o valor do produto:  ");
		produto.setPreço(sc.nextDouble());
		
		produtos.add(produto);
		
	}	
		
		Collections.sort(produtos);
		
		System.out.println("Imprimindo em ordem alfabetica:  ");
		System.out.println(produtos);
		
		System.out.println("Imprimindo por quantidade: ");
		produtos.sort(Comparator.comparing(Produtos::getQuantidade));
		System.out.println(produtos);
		
		

	}

}
