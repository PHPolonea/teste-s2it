package com.testes2it;

public class BinaryTree {
	Node raiz;
	
	public void add(int valor) {
		raiz = addRecursive(raiz, valor);
	}
	
	public int sumValues() {
		if (raiz == null) {
			return 0;
		}
		
		return sumValueRecursive(raiz, 0);
	}

	private int sumValueRecursive(Node no, int value) {
		value += no.valor;
		
		if (no.left != null) {
			value = sumValueRecursive(no.left, value);
		}
		
		if (no.right != null) {
			value = sumValueRecursive(no.right, value);
		}
		
		
		return value;
	}

	private Node addRecursive(Node no, int valor) {
		if (no == null) {
			return new Node(valor);
		}
		
		if (valor < no.valor) {
			no.left = addRecursive(no.left, valor);
		} else if (valor > no.valor) {
			no.right = addRecursive(no.right, valor);
		}
		
		return no;
	}
}

class Node {
	int valor;
	Node left;
	Node right;
	
	Node(int valor){
		this.valor = valor;
	}
}