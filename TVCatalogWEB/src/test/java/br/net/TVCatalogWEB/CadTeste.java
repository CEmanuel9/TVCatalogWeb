package br.net.TVCatalogWEB;

import javax.persistence.Persistence;

// Aplicação de teste simples para averiguar construção da tabela.
// IMPORTANTE: Esse não é um teste unitário. Em uma situação ideal, esse...
// ...deveria ser um teste unitário em JUnit. Se for possível, esse...
// ...teste deve ser substituído por um teste unitário.

public class CadTeste {
	public static void main(String[] args) {
		Persistence.createEntityManagerFactory("TVCatalogWEB");
	}
}
