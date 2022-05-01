package br.net.TVCatalogWEB;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.net.dao.DaoGenerico;
import br.net.entidades.Televisao;

// Determina essa classe como um ManagedBean de nome televisaoBean
@ViewScoped
@ManagedBean(name="televisaoBean")
public class TelevisaoBean {
	// Atributos
	private Televisao televisao = new Televisao();								// Entidade
	private DaoGenerico<Televisao> daoGenerico = new DaoGenerico<Televisao>();	// DAO
	private List<Televisao> lista = new ArrayList<Televisao>();					// Lista de retorno
	
	// Getters e setters
	public Televisao getTelevisao() {
		return televisao;
	}
	public void setTelevisao(Televisao televisao) {
		this.televisao = televisao;
	}
	public DaoGenerico<Televisao> getDaoGenerico() {
		return daoGenerico;
	}
	public void setDaoGenerico(DaoGenerico<Televisao> daoGenerico) {
		this.daoGenerico = daoGenerico;
	}
	public List<Televisao> getLista() {
		return lista;
	}
	public void setLista(List<Televisao> lista) {
		this.lista = lista;
	}
	
	// Método de carregamento pelo banco de dados.
	public void listar() {
		this.lista = this.daoGenerico.getListEntity(Televisao.class);
	}
	
	// Método de salvamento no banco de dados.
	public String salvar() {
		this.daoGenerico.salvar(this.televisao);
		this.listar();
		return "";
	}
	
	// AVISO: OBSOLETO. Os atributos e métodos foram repassados a uma classe...
	// ...externa para permitir gerenciamento por DAO.
	/*
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
	*/
}
