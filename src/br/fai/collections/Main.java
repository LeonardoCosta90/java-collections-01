package br.fai.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main app = new Main();

		app.start();

	}

	private final String valorInvalido = "VALOR_INVALIDO";

	private Scanner scanner = new Scanner(System.in);

	private void start() {
		List<String> lista = new ArrayList<String>();

		while (lista.size() < 5) {
			String valorRecebido = obterDados();
			if(valorRecebido.isEmpty() || valorRecebido.equals("VALOR_INVALIDO")) {
				System.out.println("Este valor foi descartado");
			}else {
				lista.add(valorRecebido);
			}
			
		}
		
		for (String item : lista) {
			System.out.println("O item da lista eh: " + item);

		}
		
		lista.add("item adicionado automaticamente 01");
		lista.add("item adicionado automaticamente 02");

		lista.remove(1);
		
		lista.remove(1);
		
		for (String item : lista) {
			System.out.println("Novos valores: " + item);
		}

	}

	private String obterDados() {
		try {
			System.out.println("Digite o valor: ");

			int valor = scanner.nextInt();

			return String.valueOf(valor);
		} catch (Exception e) {
			scanner.next();
			System.out.println("Um valor invalido foi digitado");
			return valorInvalido;
		}
		
		

	}

}
