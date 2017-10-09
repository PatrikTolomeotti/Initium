package br.com.db1.controller;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

@ManagedBean
public class Usuario {

	private static final String USUARIO_CORRETO = "admin";
	private static final String SENHA_CORRETA = "admin";
	
	private String email;
	private String senha;
	private Boolean tipoUsuario;
	
	public void validarTipoUsuario() {
	}
	
	
	public String autentica() {
		FacesContext fc = FacesContext.getCurrentInstance();

		if (USUARIO_CORRETO.equals(this.email) && SENHA_CORRETA.equals(this.senha)) {

			ExternalContext ec = fc.getExternalContext();
			HttpSession session = (HttpSession) ec.getSession(false);
			session.setAttribute("usuario", this.email);

			return "/logado/home";
		} else {
			FacesMessage fm = new FacesMessage("usuário e/ou senha inválidos");
			fm.setSeverity(FacesMessage.SEVERITY_ERROR);
			fc.addMessage(null, fm);
			return "/login";
		}
	}

	public String registraSaida() {
		FacesContext fc = FacesContext.getCurrentInstance();
		ExternalContext ec = fc.getExternalContext();
		HttpSession session = (HttpSession) ec.getSession(false);
		session.removeAttribute("usuario");

		return "/login";
	}

	public String getUsuario() {
		return email;
	}

	public void setUsuario(String usuario) {
		this.email = usuario;
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
