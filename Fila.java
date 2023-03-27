package ExerciciosGen;

import java.util.Iterator;
import java.util.Stack;

public class Fila {

	public static void main(String[] args) {
		
        Stack<String> pilha = new Stack<String>();
		
		pilha.push("Copo verde");
		pilha.push("Prato vermelho");
		pilha.push("Colher preto");
		pilha.push("Garfo preto");
		pilha.push("Faca preto");
		
		System.out.println("\nElementos da pilha: "+pilha);
		System.out.println("\nRetirar um elemento da pilha: "+pilha.pop());
		System.out.println("\nElementos da pilha: "+pilha);
		System.out.println("\nElemento no topo da pilha: "+pilha.peek());
		System.out.println("\nAdicionar um elemento na pilha chamado Prato roxo: "+pilha.push("Prato roxo"));
		System.out.println("\nElementos da pilha: "+pilha);
		System.out.println("\nTamanho da pilha: "+pilha.size());
		System.out.println("\nVerificar um elemento na pilha: "+pilha.contains("Prato vermelho"));
		System.out.println("\nExibir todos os elementos da minha pilha...");
		
		Iterator<String> iterator = pilha.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		

	}

}
