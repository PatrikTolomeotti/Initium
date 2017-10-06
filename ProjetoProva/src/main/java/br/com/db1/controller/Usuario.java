package br.com.db1.controller;

public class Usuario {

	private String email;
	private String senha;
	private Boolean tipoUsuario;
	
	public void validarTipoUsuario() {
	}
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Boolean getTipoUsuario() {
		return tipoUsuario;
	}
	public void setTipoUsuario(Boolean tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
}
