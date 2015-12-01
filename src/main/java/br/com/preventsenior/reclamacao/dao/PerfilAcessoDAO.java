package br.com.preventsenior.reclamacao.dao;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;

import br.com.preventsenior.reclamacao.model.PerfilAcesso;

@Named
public class PerfilAcessoDAO {

	@Inject
	private EntityManager em;
	
	public void adiciona(PerfilAcesso perfilAcesso) {
		em.persist(perfilAcesso);
	}
	
	public void remove(PerfilAcesso perfilAcesso) {
		em.persist(perfilAcesso);
	}
	
	public PerfilAcesso recarrega(PerfilAcesso perfilAcesso) {
		em.refresh(perfilAcesso);
		return perfilAcesso;
	}
	
	public PerfilAcesso busca(Integer id) {
		return em.find(PerfilAcesso.class, id);
	}
	
	@SuppressWarnings("unchecked")
	public List<PerfilAcesso> lista() {
		return em.createQuery("select p from PerfilAcesso p").getResultList();
	}
}
