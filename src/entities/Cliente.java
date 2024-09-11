//definição do pacote
package entities;

import java.util.UUID;

//declaração da classe
public class Cliente {

	// declaração dos atributos
	private UUID id;
	private String nome;
	private String email;
	private String cpf;

	// método para retornar o valor do id do cliente
	public UUID getId() {
		return id;
	}

	// método para preencher/modificar o id do cliente
	public void setId(UUID id) {
		this.id = id;
	}

	// método para retornar o valor do nome do cliente
	public String getNome() {
		return nome;
	}

	// método para preencher/modificar o nome do cliente
	public void setNome(String nome) {
		this.nome = nome;
	}

	// método para retornar o valor do email do cliente
	public String getEmail() {
		return email;
	}

	// método para preencher/modificar o email do cliente
	public void setEmail(String email) {
		this.email = email;
	}

	// método para retornar o valor do cpf do cliente
	public String getCpf() {
		return cpf;
	}

	// método para preencher/modificar o cpf do cliente
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
