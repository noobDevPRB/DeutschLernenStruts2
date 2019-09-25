package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import controller.connection.ConnectionFactory;
import model.BEAN.UsuarioBean;


public class UsuarioDAO {
	
	private String sql;
	private Connection con;
	private boolean status=false;

	PreparedStatement stmt = null;
	ResultSet rs = null;

	public UsuarioDAO() {
	}

	public boolean cadastroDAO( UsuarioBean usuariobean) {
		con = ConnectionFactory.getConnection();
		
		sql = "INSERT INTO usuario (login, email, password) VALUES (?,?,?)";

		try {
			
			stmt = con.prepareStatement(sql);
			stmt.setString(1, usuariobean.getLogin());
			stmt.setString(2, usuariobean.getEmail());
			stmt.setString(3, usuariobean.getPassword());
			stmt.executeUpdate();

			return true;

		} catch (SQLException e) {
			System.err.println("Error during Register "+ e );
			return false;	
		} finally {
			ConnectionFactory.closeConnection(con, stmt);
		}
	}

	public boolean validarUsuarioPorLoginSenha(String login, String senha) {		

		con = ConnectionFactory.getConnection();
		
		sql = "select * from usuario where login=? and password=?";			

		try {
			stmt = con.prepareStatement(sql);
			stmt.setString(1, login);
			stmt.setString(2, senha);
			rs = stmt.executeQuery();
			status=rs.next();

		} catch (SQLException e) {
			System.err.println("ERROR" + e);

		} finally {
			ConnectionFactory.closeConnection(con, stmt, rs);
		}

		return status;	

	}

	public UsuarioBean buscarUsuarioPorLogin(String loginForm) {
		con = ConnectionFactory.getConnection();
		UsuarioBean usuarioBean = null;
		
		sql = "SELECT login, email, first_name, last_name FROM usuario WHERE login = ?";

		try {

			stmt = con.prepareStatement(sql);
			stmt.setString(1,loginForm);
			rs = stmt.executeQuery();
			
			if(rs.next()) {
				usuarioBean = new UsuarioBean();
				usuarioBean.setLogin(rs.getString("login"));
				usuarioBean.setEmail(rs.getString("email"));
				usuarioBean.setFirstName(rs.getString("first_name"));
				usuarioBean.setLastName(rs.getString("last_name"));
			}
			
			return usuarioBean;
		}catch (SQLException e) {
			System.out.println(e);
			
		} finally {
			ConnectionFactory.closeConnection(con, stmt, rs);		
		
		} return usuarioBean;
	}
	
	
	public void excluirUsuario(String login) {
		con = ConnectionFactory.getConnection();
		sql ="DELETE FROM usuario WHERE login = ?";
		try {
			stmt = con.prepareStatement(sql);
			stmt.setString(1,login);
			stmt.executeUpdate();
		}catch(SQLException e) {
			System.out.println(e);
		}finally {
			ConnectionFactory.closeConnection(con, stmt, rs);
		}
		return;
	}
	
	public String atualizarUsuario(UsuarioBean usuarioBean) {

		con = ConnectionFactory.getConnection();
		
		String sql = "UPDATE usuario SET email = ? , first_name = ?, last_name = ? WHERE login = ?";


		try {
			
			stmt = con.prepareStatement(sql);
			stmt.setString(1, usuarioBean.getEmail());
			stmt.setString(2, usuarioBean.getFirstName());
			stmt.setString(3, usuarioBean.getLastName());
			stmt.setString(4, usuarioBean.getLogin());
			stmt.executeUpdate();
			
			
		} catch (SQLException ex) {
			System.err.println("ERROR" + ex);
		} finally {
			ConnectionFactory.closeConnection(con, stmt);
		}
		return "success";
	}
}
