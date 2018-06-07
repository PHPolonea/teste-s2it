package com.testes2it;

public class ValorC {
	
	private char[] aArray;
	private char[] bArray;
	private int cont = 0;
	
	public int gerarValorC(Integer valorA, Integer valorB) {
		
		aArray = valorA.toString().toCharArray();
		bArray = valorB.toString().toCharArray();
		String valorC = "";

		
		valorC = concatenar("");
		int retorno = Integer.valueOf(valorC);
		
		return retorno > 1000000 ? -1 : retorno;		
	}
	
	private String concatenar(String valor) {
		
		if(!isDisponivelA() && !isDisponivelB()) {
			return valor;
		}
		
		if (isDisponivelA()) {
			valor += aArray[cont];
		}
		
		if (isDisponivelB()) {
			valor += bArray[cont]; 
		}
		
		cont++;
		return concatenar(valor);
	}
	
	private boolean isDisponivel(char[] array) {
		return array.length > cont;
	}
	
	private boolean isDisponivelA() {
		return isDisponivel(aArray);
	}
	
	private boolean isDisponivelB() {
		return isDisponivel(bArray);
	}
	
	
}
