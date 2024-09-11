//identificação do pacote
package main;

import java.util.Scanner;
import java.util.UUID;

import entities.Cliente;

//declaração da classe
public class Main {

	// método / função para executar a classe
	public static void main(String[] args) {

		// imprimindo mensagem no console da IDE
		System.out.println("\n*** CADASTRO DE CLIENTE ***\n");

		// criando um objeto para a classe cliente
		Cliente cliente = new Cliente();
		
		//criando um objeto para a classe Scanner
		Scanner scanner = new Scanner(System.in);

		// preenchendo os dados do cliente
		cliente.setId(UUID.randomUUID());
		
		System.out.println("\nINFORME O NOME DO CLIENTE:");
		cliente.setNome(scanner.nextLine());
		
		System.out.println("\nINFORME O CPF DO CLIENTE:");
		cliente.setCpf(scanner.nextLine());
		
		System.out.println("\nINFORME O EMAIL DO CLIENTE:");
		cliente.setEmail(scanner.nextLine());
		
		// imprimindo os dados do cliente
		System.out.println("\nDADOS DO CLIENTE:");
		System.out.println("ID.....: " + cliente.getId());
		System.out.println("NOME...: " + cliente.getNome());
		System.out.println("CPF....: " + cliente.getCpf());
		System.out.println("EMAIL..: " + cliente.getEmail());
		
		//fechando o scanner
		scanner.close();
	}
}