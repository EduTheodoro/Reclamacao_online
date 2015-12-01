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
@Table(name="setores")
@NamedQuery(name="Setore.findAll", query="SELECT s FROM Setor s")
public class Setor {

	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="SETOR_DESCRICAO")
	private String setorDescricao;

	@Column(name="SETOR_NOME")
	private String setorNome;

	//bi-directional many-to-one association to Reclamacao
	@OneToMany(mappedBy="setor")
	private List<Reclamacao> reclamacaos;

	//bi-directional many-to-one association to Usuario
	@OneToMany(mappedBy="setore")
	private List<Usuario> usuarios;

	@Column(name="IC_ATIVO")
	private boolean ativo;
	
	public Setor() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSetorDescricao() {
		return this.setorDescricao;
	}

	public void setSetorDescricao(String setorDescricao) {
		this.setorDescricao = setorDescricao;
	}

	public String getSetorNome() {
		return this.setorNome;
	}

	public void setSetorNome(String setorNome) {
		this.setorNome = setorNome;
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