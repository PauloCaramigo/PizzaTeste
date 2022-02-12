package br.com.commerce;

public class Pizzaria {
	public static void main(String[] args) {
		String nome = "Pizzaria do Shiro";
		String endereco = "Rua Pindamonhangaba, 777";
		
		Caixa caixa = new Caixa();
		Pizza pizza = new Pizza();
		
		System.out.println(nome);
		System.out.println("Endereço: " + endereco);
		caixa.adicionarSaldo(80);
		caixa.debitarSaldo(10);
		System.out.println("O saldo no caixa é: " + caixa.consultarSaldo() + "\n");		
		
		pizza.nome = "Queijo";
		pizza.ingredientes.add("Queijo");
		pizza.ingredientes.add("Oregano");
		pizza.ingredientes.add("Farinha");
		pizza.ingredientes.add("Azeitona");
		pizza.definirPreco(25.00);
		
		System.out.println("Pizza de " + pizza.nome);
		System.out.println("Ingredientes: " + pizza.ingredientes);
		System.out.println("Preço: " + pizza.consultarPreco());
		
	}
}
