package br.com.preventsenior.reclamacao.dao;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.preventsenior.reclamacao.exception.DAOException;
import br.com.preventsenior.reclamacao.model.Reclamacao;
import br.com.preventsenior.reclamacao.vo.ReclamacaoDTO;

@Named
public class ReclamacaoDAO {


	@Inject 
	private EntityManager em;

	
	public Reclamacao adiciona(Reclamacao reclamacao) throws DAOException {
		em.persist(reclamacao);
		return reclamacao;
	}
	
	public void remove(Reclamacao reclamacao) {
		reclamacao.setAtivo(false);
		em.merge(reclamacao);
	}
	
	public Reclamacao recarregar(Reclamacao reclamacao) {
		em.refresh(reclamacao);
		return reclamacao;
	}

	public Reclamacao busca(Integer id) {
		return em.find(Reclamacao.class, id);
	}
	
	public List<ReclamacaoDTO> lista() {
		TypedQuery<ReclamacaoDTO> typedQuery = em.createQuery("select new br.com.preventsenior.reclamacao.vo.ReclamacaoDTO("
		+ " r.id, r.data, r.descricao, s.setorDescricao, t.tipoDescricao, u.unidadeDescricao) "
		+ " from Reclamacao r "
		+ " join r.setor s " 
		+ " join r.tipoReclamacao t "
		+ " join r.unidade u "
		+ " where r.ativo = 1 "
		+ " order by r.id", ReclamacaoDTO.class);
		List<ReclamacaoDTO> list = typedQuery.getResultList();
		return list;
	}
	
}
