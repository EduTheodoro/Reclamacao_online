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
@Table(name="unidades")
@NamedQuery(name="Unidade.findAll", query="SELECT u FROM Unidade u")
public class Unidade {

	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="UNIDADE_DESCRICAO")
	private String unidadeDescricao;

	@Column(name="UNIDADE_NOME")
	private String unidadeNome;

	//bi-directional many-to-one association to Reclamacao
	@OneToMany(mappedBy="unidade")
	private List<Reclamacao> reclamacaos;

	//bi-directional many-to-one association to Usuario
	@OneToMany(mappedBy="unidade")
	private List<Usuario> usuarios;

	@Column(name="IC_ATIVO")
	private boolean ativo;
	
	public Unidade() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUnidadeDescricao() {
		return this.unidadeDescricao;
	}

	public void setUnidadeDescricao(String unidadeDescricao) {
		this.unidadeDescricao = unidadeDescricao;
	}

	public String getUnidadeNome() {
		return this.unidadeNome;
	}

	public void setUnidadeNome(String unidadeNome) {
		this.unidadeNome = unidadeNome;
	}

	public List<Reclamacao> getReclamacaos() {
		return this.reclamacaos;
	}

	public void setReclamacaos(List<Reclamacao> reclamacaos) {
		this.reclamacaos = reclamacaos;
	}

	public List<Usuario> getUsuarios() {
		return this.usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
}