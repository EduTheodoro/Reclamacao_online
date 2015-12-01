package br.com.preventsenior.reclamacao.dao;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;

import br.com.preventsenior.reclamacao.model.Setor;

@Named
public class SetorDAO {

	@Inject
	private EntityManager em;
	
	public void adiciona(Setor setor) {
		em.persist(setor);
	}
	
	public void remove(Setor setor) {
		em.persist(setor);
	}
	
	public Setor recarrega(Setor setor) {
		em.refresh(setor);
		return setor;
	}
	
	public Setor busca(Integer id) {
		return em.find(Setor.class, id);
	}
	
	@SuppressWarnings("unchecked")
	public List<Setor> lista() {
		return em.createQuery("select s from Setor s").getResultList();
	}
}
