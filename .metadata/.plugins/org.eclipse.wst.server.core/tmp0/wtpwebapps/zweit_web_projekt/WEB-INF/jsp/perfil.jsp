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
	


<br />Login :
	<s:property value="usuarioForm.login" />
		
	<br />Email :
	<s:property value="usuarioForm.email" />
		
	<br />Nome :
	<s:property value="usuarioForm.firstName" />
		
	<br />Sobrenome :
	<s:property value="usuarioForm.lastName" />
		
	<br />
		
	<form action="encerrandoConta" method="POST">
		
		<input type="submit" value="Deletar minha Conta">
	</form>
	
	<br />
	
	<form action="atualizarPerfilPage" method="POST">
		
		<input class="btn-sm btn-success" type="submit" value="atualizar">
	</form>

<footer>
	<%@ include file="footer.jsp" %>
</footer>		

</body>
</html>