package br.com.preventsenior.reclamacao.dao;

import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.preventsenior.reclamacao.model.Usuario;
import br.com.preventsenior.reclamacao.vo.UsuarioDTO;

@Named
public class UsuarioDAO {

	@Inject
	private EntityManager em;
	
	public boolean existe(Usuario usuario) {
		return !em.createQuery("select u from Usuario u where u.loginUsuario = :loginUsuario and u.senha = :senha", Usuario.class)
			.setParameter("loginUsuario", usuario.getLoginUsuario())
			.setParameter("senha", usuario.getSenha())
			.getResultList().isEmpty();
	}
	
	
	public UsuarioDTO busca(UsuarioDTO usuario) {
		TypedQuery<UsuarioDTO> query = em.createQuery("select new br.com.preventsenior.reclamacao.vo.UsuarioDTO(u.id, u.email, u.loginUsuario, "
				+ "u.nomeUsuario, u.ramal, u.senha) from Usuario u where u.loginUsuario = :nome and u.senha = :senha", UsuarioDTO.class)
				.setParameter("nome", usuario.getLoginUsuario()).setParameter("senha", usuario.getSenha());
		UsuarioDTO resultado = query.getSingleResult();
		return resultado;
	}
	
	public void salva(Usuario usuario) {
		em.persist(usuario);
	}
}
