package controller.action;

import org.apache.struts2.dispatcher.SessionMap;

import controller.form.UsuarioForm;
import model.BEAN.UsuarioBean;

public class UsuarioAction extends PrincipalAction {

	public String signUp() {

		usuarioBusiness.cadastrarUsuario(usuarioForm.getLogin(), usuarioForm.getEmail(), usuarioForm.getPassword());
		return SUCCESS;
	}
// apenas para testes
	public String verificarSessao() {
		
		System.out.println(session);
		return SUCCESS;
	}
//
	public String encerrarSessao() {
		
		System.out.println(session);
		session.invalidate();
		System.out.println(session);
		return SUCCESS;
	}

	public String consultarPerfil() {

		UsuarioBean usuarioBean = new UsuarioBean();

		usuarioBean = usuarioBusiness.buscarUsuarioPorLogin(usuarioForm.getLogin());

		if (usuarioBean != null) {
			usuarioForm.setLogin(usuarioBean.getLogin());
			usuarioForm.setEmail(usuarioBean.getEmail());
			usuarioForm.setFirstName(usuarioBean.getFirstName());
			usuarioForm.setLastName(usuarioBean.getLastName());

			return SUCCESS;
		} else {
			return FAILURE;
		}
	}

	public String encerrarConta() {

		usuarioBusiness.excluirUsuario(usuarioForm.getLogin());

		return SUCCESS;
	}

	public String atualizarUsuarioPage() {
		return SUCCESS;
	}

	public String atualizarUsuario() {

		UsuarioBean usuarioBean;

		usuarioBean = usuarioBusiness.buscarUsuarioPorLogin(session.get("usuario").toString());

		usuarioBean.setEmail(usuarioForm.getEmail());
		usuarioBean.setFirstName(usuarioForm.getFirstName());
		usuarioBean.setLastName(usuarioForm.getLastName());
		usuarioBusiness.atualizarUsuario(usuarioBean);

		return SUCCESS;
	}

	// getters and setters//

	public SessionMap<String, Object> getSession() {
		return session;
	}

	public void setSession(SessionMap<String, Object> session) {
		this.session = session;
	}

	public UsuarioForm getUsuarioForm() {
		return usuarioForm;
	}

	public void setUsuarioForm(UsuarioForm loginForm) {
		this.usuarioForm = loginForm;
	}
	
}



