package br.com.preventsenior.reclamacao.dao;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;

import br.com.preventsenior.reclamacao.model.Unidade;

@Named
public class UnidadeDAO {

	@Inject
	private EntityManager em;
	
	public void adiciona(Unidade unidade) {
		em.persist(unidade);
	}
	
	public void remove(Unidade unidade) {
		em.persist(unidade);
	}
	
	public Unidade recarrega(Unidade unidade) {
		em.refresh(unidade);
		return unidade;
	}
	
	public Unidade busca(Integer id) {
		return em.find(Unidade.class, id);
	}
	
	@SuppressWarnings("unchecked")
	public List<Unidade> lista() {
		return em.createQuery("select u from Unidade u").getResultList();
	}
}
