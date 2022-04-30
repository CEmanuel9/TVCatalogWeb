package br.net.jpautil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	// Instância única do gerenciador de entidades
	private static EntityManagerFactory factory = null;
	
	// Toda vez que essa classe for invocada, se não existir uma...
	// ...fábrica de gerenciadores de entidade, ele deve ser criado.
	static {
		if (factory == null) {
			factory = Persistence.createEntityManagerFactory("TVCatalogWEB");
		}
	}
	
	// Retorno do gerenciador de entidade.
	// Este é um getter que cria e retorna um gerenciador de entidade a partir...
	// ...da fábrica de gerenciadores de entidade recém-implementada.
	public static EntityManager getEntityManager() {
		return factory.createEntityManager();
	}
}
