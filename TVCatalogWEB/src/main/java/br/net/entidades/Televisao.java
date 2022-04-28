package br.net.entidades;

// Importações
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// Objeto para associação com banco de dados.
// Entity: permite a transformação do objeto em uma tabela do banco de dados.
// Para a entidade funcionar, ela precisa implementar "Serializable".
@Entity
public class Televisao implements Serializable {
	// Definindo SerialVersion padrão
	private static final long serialVersionUID = 1L;

	// Definindo atributos da entidade
	
	// Id: identifica esse atributo como a chave primária da entidade
	// GeneratedValue: usa o gerador automático de chaves primárias do...
	// ...banco de dados.
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String modelo;
	private String tipo;	// Tipo (LCD, LED, Plasma)
	private String marca;
	private int polegadas;
	private float preco;
	
	// Definindo construtor vazio
	public Televisao() {}
	
	// Definindo getters e setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public int getPolegadas() {
		return polegadas;
	}
	public void setPolegadas(int polegadas) {
		this.polegadas = polegadas;
	}
	
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	// Definindo hashCode para a chave primária da entidade
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Televisao other = (Televisao) obj;
		if (id != other.id)
			return false;
		return true;
	}
}
