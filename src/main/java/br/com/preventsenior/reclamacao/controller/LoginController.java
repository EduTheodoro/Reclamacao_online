package br.com.preventsenior.reclamacao.controller;

import javax.inject.Inject;
import javax.transaction.Transactional;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.validator.I18nMessage;
import br.com.caelum.vraptor.validator.Validator;
import br.com.preventsenior.reclamacao.annotation.Public;
import br.com.preventsenior.reclamacao.dao.SetorDAO;
import br.com.preventsenior.reclamacao.dao.UsuarioDAO;
import br.com.preventsenior.reclamacao.model.Usuario;

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
	@Inject
	private Validator validator;
	
	@Get("/login/formulario") @Public
	public void formulario() {
	}
	
	@Post("/login/autentica") @Public
	public void autentica(Usuario usuario) {
		if (!dao.existe(usuario)) {
			validator.add(new I18nMessage("login", "login.invalido"));
			validator.onErrorRedirectTo(this).formulario();
		}
		usuarioLogado.setUsuario(usuario);
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
