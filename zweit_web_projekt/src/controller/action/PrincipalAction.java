package controller.action;

import org.apache.struts2.dispatcher.SessionMap;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.Preparable;

import controller.form.UsuarioForm;
import model.BUSINESS.UsuarioBusiness;

public class PrincipalAction implements Preparable {
	
	protected static final String SUCCESS = "success";
	protected static final String FAILURE = "failure";
	protected SessionMap<String, Object> session;
	protected UsuarioForm usuarioForm = new UsuarioForm();
	protected UsuarioBusiness usuarioBusiness = new UsuarioBusiness();

	public void prepare() {
			
		session = (SessionMap<String, Object>) ActionContext.getContext().getSession();
		
		//Esse if verifica se o usuario esta na sessao
		if(session.get("usuario") != null && session.get("senha") != null) {
			
			//Essa parte faz com que o usuario tenha que relogar no sistema caso ele altere o login e a senha
			usuarioForm.setLogin(session.get("usuario").toString());
			String usuario = session.get("usuario").toString();
			String senha = session.get("senha").toString();
			if (!usuarioBusiness.validarUsuario(usuario, senha)) {
				System.out.println("ERRO: Não validou usuario");
				session.invalidate();
			}
			
		//Se o usuario não estiver na sessao
		} else {
			//Encaminhar o usuario para a home
			
		}
	}
}
