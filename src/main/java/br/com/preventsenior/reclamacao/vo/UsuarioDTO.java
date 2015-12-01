package br.com.preventsenior.reclamacao.vo;

import java.io.Serializable;

public class UsuarioDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String email;
	private String loginUsuario;
	private String nomeUsuario;
	private int ramal;
	private String senha;
	private int perfilAcesso;
	private int setore;
	private int unidade;

	public UsuarioDTO(int id, String email, String loginUsuario, String nomeUsuario, int ramal, String senha) {
		this.id = id;
		this.email = email;
		this.loginUsuario = loginUsuario;
		this.nomeUsuario = nomeUsuario;
		this.ramal = ramal;
		this.senha = senha;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLoginUsuario() {
		return loginUsuario;
	}

	public void setLoginUsuario(String loginUsuario) {
		this.loginUsuario = loginUsuario;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public int getRamal() {
		return ramal;
	}

	public void setRamal(int ramal) {
		this.ramal = ramal;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int getPerfilAcesso() {
		return perfilAcesso;
	}

	public void setPerfilAcesso(int perfilAcesso) {
		this.perfilAcesso = perfilAcesso;
	}

	public int getSetore() {
		return setore;
	}

	public void setSetore(int setore) {
		this.setore = setore;
	}

	public int getUnidade() {
		return unidade;
	}

	public void setUnidade(int unidade) {
		this.unidade = unidade;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
}
