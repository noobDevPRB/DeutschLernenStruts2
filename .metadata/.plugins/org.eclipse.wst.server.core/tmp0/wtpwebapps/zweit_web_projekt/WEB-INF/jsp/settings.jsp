<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<html>
<head>
	<meta charset="UTF-8">
	<title>Welcome</title>
</head>
<body>
	<%@ include file="sideBarAndNavbar.jsp" %>	
	
	<div>
		<form action="atualizarUsuario" method="POST">
			
			<br />Email :
			<s:property value="usuarioForm.email" />
			<input type="text" placeholder="Email" name="usuarioForm.email">
			<br />Nome :
			<s:property value="usuarioForm.firstName" />
			<input type="text" placeholder="Nome" name="usuarioForm.firstName">
			<br />Sobrenome :
			<s:property value="usuarioForm.lastName" />
			<input type="text" placeholder="Sobrenome" name="usuarioForm.lastName">	
		
			<br /> <input type="submit" value="atualizar perfil">
		</form>
		
	</div>
	
	<footer>
		<%@ include file="footer.jsp" %>
	</footer>		
		
</body>
</html>