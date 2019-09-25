package controller.action;

import org.apache.struts2.dispatcher.SessionMap;
import com.opensymphony.xwork2.ActionContext;
import controller.form.UsuarioForm;
import model.BUSINESS.UsuarioBusiness;

public class InicioAction {

	private static final String SUCCESS = "success";
	private static final String FAILURE = "failure";
	SessionMap<String, Object> session;
	public UsuarioForm usuarioForm = new UsuarioForm();
	private UsuarioBusiness usuarioBusiness = new UsuarioBusiness();

	public String logar() {
		if (usuarioBusiness.validarUsuario(usuarioForm.getLogin(), usuarioForm.getPassword())) {
			session = (SessionMap<String, Object>) ActionContext.getContext().getSession();
			session.put("usuario", usuarioForm.getLogin());
			session.put("senha", usuarioForm.getPassword());
			
			return SUCCESS;
		} else {
			return FAILURE;
		}
	}
    
	// getters and setters
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

