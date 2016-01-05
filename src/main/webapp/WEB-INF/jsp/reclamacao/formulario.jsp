<%@page contentType="text/html; charset=ISO-8859-1" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE>
<html>
	<head>
	<title>:: Formulario de Reclamações</title>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	
	<!-- JS -->
	<script type="text/javascript" charset="utf-8" src="<c:url value='/resources/js/jquery-1.11.1.min.js'/> "></script>
	<script type="text/javascript" charset="utf-8" src="<c:url value='/resources/js/formulario/formulario.js'/>"></script>
	<script type="text/javascript" charset="utf-8" src="<c:url value='/resources/js/validaData.js'/>"></script>
	<script type="text/javascript" charset="utf-8" src="<c:url value='/resources/bootstrap/js/bootstrap.js'/>"></script>
	<script type="text/javascript" charset="utf-8" src="<c:url value='/resources/bootstrap/js/bootstrap.min.js'/>"></script>
	
	<!-- CSS -->
	<link rel="stylesheet" type="text/css" href="<c:url value='/resources/meuEstilo/css/estilo.css'/>"/>
	<link rel="stylesheet" type="text/css" href="<c:url value='/resources/bootstrap/css/bootstrap.css'/>" />
	<link rel="stylesheet" type="text/css" href="<c:url value='/resources/meuEstilo/css/desktop.css'/>" />
	
	</head>
	<body>
	<div class="desk-navigation">
		<div class="desk-system-logo desk-menu">
			<img id="desk-system-home" alt="Prevent Senior" src="<c:url value='/resources/meuEstilo/imgs/Home.png'/>">
		</div>
		<div class="desk-system-user-itens">
			<div id="desk-user-info" class="desk-system-user-info desk-menu">
				<div class="desk-user-name">
					<span>${usuarioLogado.usuario.loginUsuario}</span>
				</div>
			</div>
		</div>
	</div>
	<br/>
	<br><br/>
	<form id="form" method="post">
			<div class="page-right2">
				<div class="def-hea-text light-color2">
					<div id="" class="form-container">
						<div id="" class="form-column">
							<h1>Nova Reclamação</h1>
						</div>
						<div class="form-column">
							<div id="" class="form-field">
								<input type="button" class="btn-actionn" id="botaoModal" title="Visualizar Lista">					
							</div>
						</div>
					</div>
				</div>
				<section>
					<fieldset id="" class="light-color extreme-light-ack set-pre">
						<div id="" class="form-container">
							<div id="" class="form-column">
								<div id="" class="form-field">
									<label class="default obrigatorio">Tipo da Reclamação</label> 
									<select id="tipoReclamacao" class="default obrigatorio" name="reclamacao.tipoReclamacao.id">
										<option></option>
										<c:forEach items="${listaTipo}" var="tipo">
											<option value="${tipo.id}">${tipo.tipoDescricao}</option>
										</c:forEach>
									</select>
								</div>
								<br/>
								<div id="" class="form-field">
									<label class="default obrigatorio">Unidade</label> 
									<select class="default obrigatorio" name="reclamacao.unidade.id">
										<option></option>
										<c:forEach items="${listaUnidade}" var="unidade">
											<option value="${unidade.id}">${unidade.unidadeDescricao}</option>
										</c:forEach>
									</select>
								</div>
							</div>
							<div id="" class="form-column">
								<div id="" class="form-field">
									<label class="default obrigatorio">Setor</label> 
									<select id="modulo" class="default obrigatorio" name="reclamacao.setore.id">
										<option></option>
										<c:forEach items="${listaSetor}" var="setor">
											<option value="${setor.id}">${setor.setorDescricao}</option>
										</c:forEach>
									</select>
								</div>
								<br/>
								<div id="" class="form-field">
									<label class="default obrigatorio">Data da Reclamação</label> 
									<input id="data" class="default obrigatorio data" maxlength="10" OnKeyPress="formatar(this, '##/##/####')" type="text" name="reclamacao.data">
								</div>
							</div>
						</div>
						<br/>
						<div id="" class="form-container">
							<div id="" class="form-column">
								<div id="" class="form-field">
									<label class="default obrigatorio">Descrição</label>
									<textarea name="reclamacao.descricao" cols="43" rows="100" 
										maxlength="950" class="default obrigatorio uppercase" id="observacao"></textarea>
								</div>
							</div>
						</div>
						<div id="" class="form-container">
							<div id="" class="form-column">
								<div id="" class="form-field">
									<button type="button" class="btn-action olive search" id="testeVerde">Adicionar</button>
								</div>
							</div>
						</div>
					</fieldset>
				</section>
			</div>
		</form>
	<form id="form-logar" method="get">
		<div class="modal hide" id="myModal">
			<div class="modal-header">
				<a class="close" data-dismiss="modal">×</a>
				<h3>:: Login ::</h3>
			</div>
			<div class="modal-body">
				<div id="" class="form-container">
					<div id="" class="form-column">
						<div id="" class="form-field">
							<label class="default obrigatorio">Usuario:</label> 
							<input class="default obrigatorio" name="usuario.nome" type="text" placeholder="Digite seu Usuario"><br />
						</div>
						<div id="" class="form-field">
							<label class="default obrigatorio">Senha:</label> 
							<input class="default obrigatorio" name="usuario.senha" type="password" placeholder="Digite seu senha">
						</div>
						<br>
						<button id="logar" class="btn-action olive">Logar</button>
						<br />
					</div>
				</div>
			</div>
		</div>
	</form>
</body>
	
</html>