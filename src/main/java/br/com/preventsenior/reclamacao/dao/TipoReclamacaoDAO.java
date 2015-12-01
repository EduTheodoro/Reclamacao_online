package br.com.preventsenior.reclamacao.dao;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;

import br.com.preventsenior.reclamacao.model.TipoReclamacao;

@Named
public class TipoReclamacaoDAO {

	@Inject
	private EntityManager em;
	
	public void adiciona(TipoReclamacao tipoReclamacao) {
		em.persist(tipoReclamacao);
	}
	
	public void remove(TipoReclamacao tipoReclamacao) {
		em.persist(tipoReclamacao);
	}
	
	public TipoReclamacao recarrega(TipoReclamacao tipoReclamacao) {
		em.refresh(tipoReclamacao);
		return tipoReclamacao;
	}
	
	public TipoReclamacao busca(Integer id) {
		return em.find(TipoReclamacao.class, id);
	}
	
	@SuppressWarnings("unchecked")
	public List<TipoReclamacao> lista() {
		return em.createQuery("select t from TipoReclamacao t").getResultList();
	}
}
