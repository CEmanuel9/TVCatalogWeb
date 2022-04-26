package television.controller;

import java.util.ArrayList;

import television.dao.ProdutoDao;
import television.model.Produto;

public class Teste {
	public static void main(String[] args) {
		ArrayList<Produto> produtos = new ProdutoDao().BuscarProdutosPorDescricao("a");
		System.out.println("-----> " + produtos.size());
	}
}
