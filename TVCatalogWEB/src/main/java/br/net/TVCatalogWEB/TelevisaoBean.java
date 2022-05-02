package br.net.TVCatalogWEB;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.model.FilterMeta;

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
	private List<Televisao> listaFiltro = new ArrayList<Televisao>();			// Lista de retorno filtrada
	
	// Lista de filtros do PrimeFaces
	private List<FilterMeta> filtrarPor;
	
	// Objeto selecionado no PrimeFaces
	private Televisao selecionado;
	
	// Inicializador para tabela do PrimeFaces
	@PostConstruct
	public void init() {
		// busca os elementos no banco de dados
		this.listar();
		
		// inicia o filtro da tabela
		this.filtrarPor = new ArrayList<>();
	}
	
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
	public List<Televisao> getListaFiltro() {
		return this.listaFiltro;
	}
	public void setListaFiltro(List<Televisao> listaFiltro) {
		this.listaFiltro = listaFiltro;
	}
	public List<FilterMeta> getFiltrarPor() {
		return this.filtrarPor;
	}
	public void setFiltrarPor(List<FilterMeta> filtrarPor) {
		this.filtrarPor = filtrarPor;
	}
	public Televisao getSelecionado() {
		return this.selecionado;
	}
	public void setSelecionado(Televisao selecionado) {
		this.selecionado = selecionado;
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
