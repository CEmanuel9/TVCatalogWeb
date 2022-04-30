package br.net.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.net.jpautil.JPAUtil;

// <C>: Essa classe deve receber qualquer tipo de classe.
// Pode-se escolher qualquer letra (C de classe).
public class DaoGenerico<C> {
	// Método para salvar informações
	public void salvar (C entidade) {
		// Estabelecendo o gerenciador de entidade para prover a persistência.
		EntityManager entityManager = JPAUtil.getEntityManager();
		
		// Criando e iniciando transação no banco de dados.
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		
		// Salve a entidade recebida.
		entityManager.persist(entidade);
		entityTransaction.commit();
		
		// Encerre o gerenciador de entidade.
		entityManager.close();
	}
	
	// Método para carregar lista de dados
	public List<C> getListEntity(Class<C> entidade) {
		// Estabelecendo o gerenciador de entidade para prover a persistência.
		EntityManager entityManager = JPAUtil.getEntityManager();
		
		// Criando e iniciando transação no banco de dados.
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		
		// Cria a lista de dados e carrega com as informações do banco de dados.
		List<C> lista = entityManager.createQuery("from " + entidade.getName()).getResultList();
		
		// Execute as instruções.
		entityTransaction.commit();
		
		// Encerre o gerenciador de entidade.
		entityManager.close();
		
		// Retorna a lista de dados.
		return lista;
	}
}
