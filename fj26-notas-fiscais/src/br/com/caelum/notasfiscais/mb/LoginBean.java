package br.com.caelum.notasfiscais.mb;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.caelum.notasfiscais.dao.UsuarioDao;
import br.com.caelum.notasfiscais.modelo.Usuario;

@ManagedBean
@SessionScoped
public class LoginBean {
	
	private Usuario usuario = new Usuario();
	private UsuarioDao dao = new UsuarioDao();
	
	public String efetuaLogin(){
//		boolean loginValido = dao.existe(usuario);
//		System.out.println("O Login era valido ?"+loginValido);
//		if(loginValido){
//			System.out.println("login valido true, dentro do if");
//			return "teste";
//		}else{
//			this.usuario = new Usuario();
//			return "produto";
//		}
		return "produto";
	}
	
	public String deuRuim(){
		System.out.println("Deu ruim");
		return "produto";
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public UsuarioDao getDao() {
		return dao;
	}

	public void setDao(UsuarioDao dao) {
		this.dao = dao;
	}

}
