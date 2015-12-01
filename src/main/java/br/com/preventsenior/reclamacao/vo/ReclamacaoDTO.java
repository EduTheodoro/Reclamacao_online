package br.com.preventsenior.reclamacao.vo;

import java.io.Serializable;
import java.util.Date;

public class ReclamacaoDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;
	private Date date;
	private String descricao;
	private String setor;
	private String tipoReclamacao;
	private String unidade;
	
	public ReclamacaoDTO(int id, Date date, String descricao, String setor,
			String tipoReclamacao, String unidade) {		
		this.id = id;
		this.date = date;
		this.descricao = descricao;
		this.setor = setor;
		this.tipoReclamacao = tipoReclamacao;
		this.unidade = unidade;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	public String getTipoReclamacao() {
		return tipoReclamacao;
	}
	public void setTipoReclamacao(String tipoReclamacao) {
		this.tipoReclamacao = tipoReclamacao;
	}
	public String getUnidade() {
		return unidade;
	}
	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}
	
	
}
