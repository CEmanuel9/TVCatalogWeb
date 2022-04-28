package br.net.TVCatalogWEB;

import javax.faces.bean.ManagedBean;

// Determina essa classe como um ManagedBean de nome televisaoBean
@ManagedBean(name="televisaoBean")
public class TelevisaoBean {
	
	// Atributos da classe televisão
	private String modelo;
	private String tipo;	// Tipo (LCD, LED, Plasma)
	private String marca;
	private int polegadas;
	private float preco;
	
	// Getters e setters
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getModelo() {
		return this.modelo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getTipo() {
		return this.tipo;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getMarca() {
		return this.marca;
	}
	
	public void setPolegadas(int polegadas) {
		this.polegadas = polegadas;
	}
	public int getPolegadas() {
		return this.polegadas;
	}
	
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public float getPreco() {
		return this.preco;
	}
}
