<%@page contentType="text/html; charset=ISO-8859-1" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>:: Formulario de Login ::</title>

<!-- JS -->
<script type="text/javascript" charset="utf-8" src="<c:url value='/resources/js/jquery-1.11.1.min.js'/> "></script>
<script type="text/javascript" charset="utf-8" src="<c:url value='/resources/bootstrap/js/bootstrap.js'/>"></script>
<script type="text/javascript" charset="utf-8" src="<c:url value='/resources/bootstrap/js/bootstrap.min.js'/>"></script>
<script type="text/javascript" charset="utf-8" src="<c:url value='/resources/js/formulario/formularioLogin.js'/>"></script>


<!-- CSS -->
<link rel="stylesheet" type="text/css" href="<c:url value='/resources/meuEstilo/css/estilo.css'/>"/>
<link rel="stylesheet" type="text/css" href="<c:url value='/resources/bootstrap/css/bootstrap.css'/>" />

</head>
<body>

	<form id="form-logar" method="post">
		<div class="page-right">
			<div class="def-hea-text light-color2">
				<div id="" class="form-container">
					<div id="" class="form-column">
						<h1>Formulario de Login</h1>
					</div>
				</div>
			</div>
			<section>
				<fieldset id="" class="light-color extreme-light-ack set-pre">
					<div id="" class="form-container">
						<div id="" class="form-column">
							<div id="" class="form-field">
								<label class="default obrigatorio">Usuario:</label> 
								<input class="default obrigatorio" name="usuarioDto.loginUsuario" type="text" placeholder="Digite seu Usuario"><br />
							</div>
							<div id="" class="form-field">
								<label class="default obrigatorio">Senha:</label> 
								<input class="default obrigatorio" name="usuarioDto.senha" type="password" placeholder="Digite sua Senha"><br />
							</div>
							<div id="" class="form-field">
								<br>
								<input id="logar" type="button" class="btn-action olive" value="Logar">
								<br/>
							</div>
						</div>
					</div>
				</fieldset>
			</section>
			<section>
				<div id="" class="form-container">
					<fieldset id="" class="light-color extreme-light-ack set-pre">
						<label class="default">${mensagem}</label>
					</fieldset>
				</div>
			</section>
		</div>
	</form>
</body>
</html>