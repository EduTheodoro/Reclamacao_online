package br.com.preventsenior.reclamacao.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="usuarios")
@NamedQuery(name="Usuario.findAll", query="SELECT u FROM Usuario u")
public class Usuario {

	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="EMAIL")
	private String email;

	@Column(name="LOGIN_USUARIO")
	private String loginUsuario;

	@Column(name="NOME_USUARIO")
	private String nomeUsuario;

	@Column(name="RAMAL")
	private int ramal;

	@Column(name="SENHA")
	private String senha;

	@ManyToOne
	@JoinColumn(name="ID_PERFIL_ACESSO")
	private PerfilAcesso perfilAcesso;

	@ManyToOne
	@JoinColumn(name="ID_SETOR")
	private Setor setore;

	@ManyToOne
	@JoinColumn(name="ID_UNIDADE")
	private Unidade unidade;
	
	@Column(name="IC_ATIVO")
	private boolean ativo;

	public Usuario(int id, String email, String loginUsuario,
			String nomeUsuario, int ramal, String senha,
			PerfilAcesso perfilAcesso, Setor setore, Unidade unidade) {
		this.id = id;
		this.email = email;
		this.loginUsuario = loginUsuario;
		this.nomeUsuario = nomeUsuario;
		this.ramal = ramal;
		this.senha = senha;
		this.perfilAcesso = perfilAcesso;
		this.setore = setore;
		this.unidade = unidade;
	}
	
	public Usuario() {
		
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLoginUsuario() {
		return this.loginUsuario;
	}

	public void setLoginUsuario(String loginUsuario) {
		this.loginUsuario = loginUsuario;
	}

	public String getNomeUsuario() {
		return this.nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public int getRamal() {
		return this.ramal;
	}

	public void setRamal(int ramal) {
		this.ramal = ramal;
	}

	public String getSenha() {
		return this.senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public PerfilAcesso getPerfilAcesso() {
		return this.perfilAcesso;
	}

	public void setPerfilAcesso(PerfilAcesso perfilAcesso) {
		this.perfilAcesso = perfilAcesso;
	}

	public Setor getSetore() {
		return this.setore;
	}

	public void setSetore(Setor setore) {
		this.setore = setore;
	}

	public Unidade getUnidade() {
		return this.unidade;
	}

	public void setUnidade(Unidade unidade) {
		this.unidade = unidade;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

}