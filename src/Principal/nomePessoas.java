package Principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import entites.Pessoa;

public class nomePessoas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pessoa pessoa1 = new Pessoa("Veronica");
		Pessoa pessoa2 = new Pessoa("Zoe");
		Pessoa pessoa3 = new Pessoa("Marte");
		Pessoa pessoa4 = new Pessoa("Beatrice");
		Pessoa pessoa5 = new Pessoa("Lua");
		
		ArrayList<Pessoa> pessoas = new ArrayList<>();

		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);
		pessoas.add(pessoa4);
		pessoas.add(pessoa5);
		
		System.out.println(pessoas);
		
			
		System.out.println("\nIprimindo ordenadamente:  " + "\n");
		Collections.sort(pessoas);
		
		pessoas.forEach(nome -> System.out.println(nome));
		
		
		
		
	}

}
