package br.net.dao;

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
		
		// Salve a entidade recebida
		entityManager.persist(entidade);
		entityTransaction.commit();
		
		// Encerre o gerenciador de entidade
		entityManager.close();
	}
}
