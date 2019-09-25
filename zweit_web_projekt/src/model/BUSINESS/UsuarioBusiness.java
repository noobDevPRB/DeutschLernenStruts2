package model.BUSINESS;

import model.BEAN.UsuarioBean;
import model.DAO.UsuarioDAO;

public class UsuarioBusiness {
	
	public void cadastrarUsuario(String login, String email, String senha) {

		UsuarioDAO usuarioDao = new UsuarioDAO();
		UsuarioBean usuarioBean = new UsuarioBean();
		
		usuarioBean.setLogin(login);
		usuarioBean.setEmail(email);
		usuarioBean.setPassword(senha);

		usuarioDao.cadastroDAO(usuarioBean);
	}

	public boolean validarUsuario(String login, String senha) {

		UsuarioDAO usuarioDao = new UsuarioDAO();
		
		
		return usuarioDao.validarUsuarioPorLoginSenha(login, senha);
	}

	public UsuarioBean buscarUsuarioPorLogin(String login) {

		UsuarioDAO usuarioDao = new UsuarioDAO();
		
		return usuarioDao.buscarUsuarioPorLogin(login);

	}

	public String excluirUsuario(String login) {
		
		UsuarioDAO usuarioDao = new UsuarioDAO();
		
		usuarioDao.excluirUsuario(login);

		return "success";
	}
	

	public String atualizarUsuario(UsuarioBean usuarioBean) {

		UsuarioDAO usuarioDao = new UsuarioDAO();
		
				
		usuarioDao.atualizarUsuario(usuarioBean);
		
		return "success"; 
	}
}

