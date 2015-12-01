package br.com.preventsenior.reclamacao.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@NamedQuery(name="Reclamacao.findAll", query="SELECT r FROM Reclamacao r")
public class Reclamacao {
	
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="DATA")
	@Temporal(TemporalType.DATE)
	private Date data;

	@Lob
	@Column(name="DESCRICAO")
	private String descricao;

	@ManyToOne
	@JoinColumn(name="ID_SETOR")
	private Setor setor;

	@ManyToOne
	@JoinColumn(name="ID_TIPO_RECLAMACAO")
	private TipoReclamacao tipoReclamacao;

	@ManyToOne
	@JoinColumn(name="ID_UNIDADE")
	private Unidade unidade;
	
	@Column(name="IC_ATIVO")
	private boolean ativo;

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public Reclamacao() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getData() {
		return this.data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Setor getSetore() {
		return this.setor;
	}

	public void setSetore(Setor setor) {
		this.setor = setor;
	}

	public TipoReclamacao getTipoReclamacao() {
		return this.tipoReclamacao;
	}

	public void setTipoReclamacao(TipoReclamacao tipoReclamacao) {
		this.tipoReclamacao = tipoReclamacao;
	}

	public Unidade getUnidade() {
		return this.unidade;
	}

	public void setUnidade(Unidade unidade) {
		this.unidade = unidade;
	}

}