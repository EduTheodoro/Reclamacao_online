package br.com.preventsenior.reclamacao.util;

import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


public class EntityManagerProducer {
	@PersistenceContext(unitName = "reclamacaopu")
	 private EntityManager em;
	 
	 @Produces
	 public EntityManager produceEntityManager() {
	  return this.em;
	 }
}