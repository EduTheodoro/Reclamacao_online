<%@page contentType="text/html; charset=ISO-8859-1" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>.:: Cadastro de Usuários ::.</title>
	<!-- JS -->
	<script type="text/javascript" charset="utf-8" src="<c:url value='/resources/js/jquery-1.11.1.min.js'/> "></script>
	<script type="text/javascript" charset="utf-8" src="<c:url value='/resources/bootstrap/js/bootstrap.js'/>"></script>
	<script type="text/javascript" charset="utf-8" src="<c:url value='/resources/bootstrap/js/bootstrap.min.js'/>"></script>
	<script type="text/javascript" charset="utf-8" src="<c:url value='/resources/js/formulario/cadastroUsuario.js'/>"></script>
	
	<!-- CSS -->
	<link rel="stylesheet" type="text/css" href="<c:url value='/resources/meuEstilo/css/estilo.css'/>"/>
	<link rel="stylesheet" type="text/css" href="<c:url value='/resources/bootstrap/css/bootstrap.css'/>" />
	<link rel="stylesheet" type="text/css" href="<c:url value='/resources/meuEstilo/css/desktop.css'/>" />

</head>
<body>
	<form id="form" method="post">
		<div class="page-right2">
			<div class="def-hea-text light-color2">
				<div id="" class="form-container">
					<div id="" class="form-column">
						<h1>Novo Usuário</h1>
					</div>
				</div>
			</div>
			<section>
				<div class="form-container">
					<div class="form-column">
						<div class="form-field">
							<label class="default obrigatorio">Nome:</label> 
							<input type="text" class="default obrigatorio" name="usuario.nomeUsuario">
						</div>
					</div>
					<br/>
					<div class="form-column">
						<div class="form-field">
							<label class="default obrigatorio">Login:</label> 
							<input type="text" class="default obrigatorio" name="usuario.loginUsuario">
						</div>
					</div>
				</div>
				<br/>
				<div class="form-container">
					<div class="form-column">
						<div class="form-field">
							<label class="default obrigatorio">Senha:</label> 
							<input type="password" class="default obrigatorio" name="usuario.senha">
						</div>
					</div>
					<br/>
					<div class="form-column">
						<div class="form-field">
							<label class="default obrigatorio">E-mail:</label> 
							<input type="text" class="default obrigatorio" name="usuario.email">
						</div>
					</div>
				</div>
				<br/>
				<div class="form-container">
					<div class="form-column">
						<div class="form-field">
							<label class="default obrigatorio">Ramal:</label> 
							<input type="text" class="default obrigatorio" name="usuario.ramal">
						</div>
					</div>
					<br/>
					<div class="form-column">
						<div class="form-field">
							<label class="default obrigatorio">Departamento:</label> 
							<select id="modulo" class="default obrigatorio" name="usuario.setore">
								<option></option>
								<c:forEach items="${listaSetor}" var="departamento">
									<option value="${departamento.id}">${departamento.setorDescricao}</option>
								</c:forEach>
							</select>
						</div>
					</div>
				</div>
				<br/>
				<div class="form-container">
					<div class="form-column">
						<div class="form-field">
							<button id="novoUsuario" type="button" class="btn-action olive">Adicionar</button>
						</div>
					</div>
				</div>
			</section>
			<div id="" class="form-container">
				<fieldset id="" class="light-color extreme-light-ack set-pre">
					<label class="default">${mensagem}</label>
				</fieldset>
			</div>
		</div>
	</form>
</body>
</html>