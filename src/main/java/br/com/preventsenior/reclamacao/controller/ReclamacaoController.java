package br.com.preventsenior.reclamacao.controller;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.view.Results;
import br.com.preventsenior.reclamacao.dao.ReclamacaoDAO;
import br.com.preventsenior.reclamacao.dao.SetorDAO;
import br.com.preventsenior.reclamacao.dao.TipoReclamacaoDAO;
import br.com.preventsenior.reclamacao.dao.UnidadeDAO;
import br.com.preventsenior.reclamacao.exception.DAOException;
import br.com.preventsenior.reclamacao.model.Reclamacao;
import br.com.preventsenior.reclamacao.vo.ReclamacaoDTO;

@Controller
public class ReclamacaoController {

	@Inject
	private Result result;
	@Inject
	private ReclamacaoDAO dao;
	@Inject
	private SetorDAO setorDao;
	@Inject
	private TipoReclamacaoDAO tipoDao;
	@Inject
	private UnidadeDAO unidadeDao;
	
	@Get("/formulario")
	public void formulario() {
		result.include("listaSetor", setorDao.lista());
		result.include("listaTipo", tipoDao.lista());
		result.include("listaUnidade", unidadeDao.lista());
	}
	
	@Get("/erro")
	public void erro() {
		
	}

	@Get("/inicio")
	public void inicio() {
		
	}
	
	@Get("/tableau")
	public void tableau(){
		
	}
	
	@Get("/listaTest")
	public void listaTest() {
		result.include("reclamacaoList", dao.lista());
	}
	
	@Get("/listaTeste")
	public void listaTeste() {
		result.include("reclamacaoList", dao.lista());
	}
	
	@Post("/reclamacoes")
	public void listaJson() {
		List<ReclamacaoDTO> reclamacoes = dao.lista();
		result.use(Results.json()).from(reclamacoes).serialize();
	}
		
	@Post("/adiciona")
	@Transactional public void adiciona(Reclamacao reclamacao) throws DAOException {
		try {
			dao.adiciona(reclamacao);
			result.redirectTo(this).formulario();
			result.include("mensagem", "Reclamação numero " + reclamacao.getId() + " foi adicionada com sucesso!");
		} catch (DAOException cause) {
			throw new DAOException("Erro ao Salvar", cause);
		}
	}
		
	@Get("/detalhes/{id}")
	public void detalhes(Integer id) {
		Reclamacao reclamacao = dao.busca(id);
		result.include("reclamacao", reclamacao);
	}
	
	@Post("/remove")
	@Transactional public void remove(Integer id) {
		Reclamacao reclamacao = dao.busca(id);
		dao.remove(reclamacao);
		result.nothing();
	}
	
}
