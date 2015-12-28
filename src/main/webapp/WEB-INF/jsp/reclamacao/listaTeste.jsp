<%@page contentType="text/html; charset=ISO-8859-1" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>:: Lista de Reclamações</title>

<!-- Import JS-->
<script type="text/javascript" charset="utf-8" src="<c:url value='/resources/js/jquery-1.11.1.min.js'/> "></script>
<script type="text/javascript" charset="utf-8" src="<c:url value='/resources/footable/js/footable.js'/> "></script>
<script type="text/javascript" charset="utf-8" src="<c:url value='/resources/footable/js/footable.paginate.js'/> "></script>
<script type="text/javascript" charset="utf-8" src="<c:url value='/resources/footable/js/footable.filter.js'/> "></script>
<script type="text/javascript" charset="utf-8" src="<c:url value='/resources/footable/js/footable.sort.js'/> "></script>
<script type="text/javascript" charset="utf-8" src="<c:url value='/resources/js/lista/lista.js'/> "></script>


<!-- Import CSS -->
<link rel="stylesheet" type="text/css" href="<c:url value='/resources/footable/css/footable.metro.css'/>" />
<link rel="stylesheet" type="text/css" href="<c:url value='/resources/footable/css/footable.core.css'/>" />
<link rel="stylesheet" type="text/css" href="<c:url value='/resources/meuEstilo/css/estilo.css'/>" />
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
	<div class="page-right2">
		<div class="def-hea-text light-color2">
			<h1>Lista de Reclamações</h1>
		</div>
		<section>
			<fieldset id="" class="light-color extreme-light-ack set-pre">
				<div class="form-column">
					<div id="" class="form-field">
						<div>
							<input id="atualizar" type="button" class="btn-action olive search" value="Atualizar">
						</div>
						<div>
							<br><input id="filter" type="text" class="default" placeholder="Pesquisar..."><br><br>
						</div>
						<table class="footable toggle-arrow-tiny metro-new" data-filter="#filter">
							<thead>
								<tr>
									<th>ID</th>
									<th>DATA</th>
									<th>UNIDADE</th>
									<th>SETOR</th>
									<th data-hide="phone">TIPO DA RECLAMAÇÃO</th>
									<th data-hide="all">RECLAMAÇÃO</th>
									<th>REMOVER</th>
								</tr>
							</thead>
							<tfoot class="hide-if-no-paging">
								<tr>
									<td colspan="10">
										<div class="pagination pagination-centered"></div>
									</td>
								</tr>
							</tfoot>
							<tbody id="tabelaReclamacao">
								<c:forEach items="${reclamacaoList}" var="reclamacao">
									<tr class="item-table-action" id="${reclamacao.id}">
										<td>${reclamacao.id}</td>
										<td>${reclamacao.dataFormatada}</td>
										<td>${reclamacao.unidade}</td>
										<td>${reclamacao.setor}</td>
										<td>${reclamacao.tipoReclamacao}</td>
										<td width="30%">
											<a id="link" href="#" onclick="window.open('http://localhost:8080/reclamacao/detalhes/${reclamacao.id}', 'Pagina', 'TOOLBAR=NO, DIRECTORIES=NO, RESISABLE=NO, SCROLLBARS=YES, TOP=10, LEFT=10, WIDTH=770, HEIGHT=400');">${reclamacao.descricao}</a>
										</td>
										<td class="remove">
											<span>Remover</span>
										</td>
									</tr>
								</c:forEach>
							</tbody>
						</table><br>
					</div>
				</div>
			</fieldset>
		</section>
	</div>
</body>
</html>