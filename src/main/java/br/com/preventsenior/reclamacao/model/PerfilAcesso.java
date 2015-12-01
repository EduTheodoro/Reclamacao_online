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
@Table(name="perfil_acesso")
@NamedQuery(name="PerfilAcesso.findAll", query="SELECT p FROM PerfilAcesso p")
public class PerfilAcesso {
	
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="PERFIL_DESCRICAO")
	private String perfilDescricao;

	@Column(name="PERFIL_NOME")
	private String perfilNome;

	//bi-directional many-to-one association to Usuario
	@OneToMany(mappedBy="perfilAcesso")
	private List<Usuario> usuarios;

	public PerfilAcesso() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPerfilDescricao() {
		return this.perfilDescricao;
	}

	public void setPerfilDescricao(String perfilDescricao) {
		this.perfilDescricao = perfilDescricao;
	}

	public String getPerfilNome() {
		return this.perfilNome;
	}

	public void setPerfilNome(String perfilNome) {
		this.perfilNome = perfilNome;
	}

	public List<Usuario> getUsuarios() {
		return this.usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
}