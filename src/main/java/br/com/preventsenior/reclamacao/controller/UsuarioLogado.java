package br.com.preventsenior.reclamacao.controller;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import br.com.preventsenior.reclamacao.vo.UsuarioDTO;

@SessionScoped
@Named
public class UsuarioLogado implements Serializable{

	private static final long serialVersionUID = 1L;

	private UsuarioDTO usuario;

	public UsuarioDTO getUsuarioDTO() {
		return usuario;
	}

	public void setUsuarioDTO(UsuarioDTO usuario) {
		this.usuario = usuario;
	}


	
}
