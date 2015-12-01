package br.com.preventsenior.reclamacao.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tipo_reclamacao")
@NamedQuery(name="TipoReclamacao.findAll", query="SELECT t FROM TipoReclamacao t")
public class TipoReclamacao {
	
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="TIPO_DESCRICAO")
	private String tipoDescricao;

	@Column(name="TIPO_NOME")
	private String tipoNome;

	//bi-directional many-to-one association to Reclamacao
	@OneToMany(mappedBy="tipoReclamacao")
	private List<Reclamacao> reclamacaos;
	
	@Column(name="IC_ATIVO")
	private boolean ativo;

	public TipoReclamacao() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTipoDescricao() {
		return this.tipoDescricao;
	}

	public void setTipoDescricao(String tipoDescricao) {
		this.tipoDescricao = tipoDescricao;
	}

	public String getTipoNome() {
		return this.tipoNome;
	}

	public void setTipoNome(String tipoNome) {
		this.tipoNome = tipoNome;
	}

	public List<Reclamacao> getReclamacaos() {
		return this.reclamacaos;
	}

	public void setReclamacaos(List<Reclamacao> reclamacaos) {
		this.reclamacaos = reclamacaos;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
}