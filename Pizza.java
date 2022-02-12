package br.com.commerce;

import java.util.ArrayList;

public class Pizza {
	String nome;
	ArrayList<String> ingredientes = new ArrayList<>();
	private double preco;
	
	public void definirPreco(double preco) {
		this.preco = preco;
	}
	public double consultarPreco() {
		return preco;
	}
}
