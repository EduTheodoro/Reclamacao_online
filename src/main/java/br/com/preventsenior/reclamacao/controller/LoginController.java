package br.com.preventsenior.reclamacao.controller;

import javax.inject.Inject;
import javax.transaction.Transactional;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.preventsenior.reclamacao.dao.SetorDAO;
import br.com.preventsenior.reclamacao.dao.UsuarioDAO;
import br.com.preventsenior.reclamacao.model.Usuario;
import br.com.preventsenior.reclamacao.vo.UsuarioDTO;

@Controller
public class LoginController {

	@Inject
	private UsuarioDAO dao;
	@Inject
	private Result result;
	@Inject
	private UsuarioLogado usuarioLogado;
	@Inject
	private SetorDAO setorDao;
	
	@Get("/login/formulario")
	public void formulario() {
	}
	
	@Post("/login/autentica")
	public void autentica(UsuarioDTO usuario) {
		if (dao.busca(usuario) != null) {
			result.include("mensagem", "Usuario ou senha invalida");
			result.redirectTo(this).formulario();
		}
		usuarioLogado.setUsuarioDTO(usuario);
		result.redirectTo(ReclamacaoController.class).listaTeste();
	}
	
	@Post("/login/adiciona")
	@Transactional public void adiciona(Usuario usuario) {
		dao.salva(usuario);
		result.include("mensagem", "Usuario numero: " + usuario.getId() + " Adicionado com sucesso!");
		result.redirectTo(this).cadastroUsuario();
	}
	
	@Get("/login/cadastroUsuario")
	public void cadastroUsuario() {
		result.include("listaSetor", setorDao.lista());
	}
}
