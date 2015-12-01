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
<script type="text/javascript" charset="utf-8" src="<c:url value='/resources/js/reclamacao/lista.js'/> "></script>
<script type="text/javascript" charset="utf-8" src="<c:url value='/resources/js/jquery.dataTables.min.js'/> "></script>

<!-- Import CSS -->
<link rel="stylesheet" type="text/css" href="<c:url value='/resources/meuEstilo/css/jquery.dataTables.css'/>" />
<link rel="stylesheet" type="text/css" href="<c:url value='/resources/bootstrap/css/bootstrap.css'/>" />
<link rel="stylesheet" type="text/css" href="<c:url value='/resources/meuEstilo/css/estilo.css'/>" />
</head>
<body>
	<div class="page-right">
		<div class="def-hea-text light-color very-light-back">
			<h1>Lista de Reclamações</h1>
		</div>
		<section>
			<fieldset id="" class="light-color extreme-light-ack set-pre">
				<div class="form-column">
					<div id="" class="form-field">
						<table id="tabelaReclamacao" class="table table-hover table-condensed table-bordered table-striped display">
							<thead class="thead">
								<!-- class="thead"  -->
								<tr>
									<th>ID</th>
									<th>DATA</th>
									<th>UNIDADE</th>
									<th>SETOR</th>
									<th>TIPO DA RECLAMÇÃO</th>
									<th width="40%">DESCRICAO</th>
								</tr>
							</thead>
							<tfoot class="thead">
								<tr>
									<th>ID</th>
									<th>DATA</th>
									<th>UNIDADE</th>
									<th>SETOR</th>
									<th>TIPO DA RECLAMÇÃO</th>
									<th>DESCRICAO</th>
								</tr>
							</tfoot>
							<tbody>
								<c:forEach items="${reclamacaoList}" var="reclamacao">
									<tr class="info">
										<!-- class="info" -->
										<td>${reclamacao.id}</td>
										<td><fmt:formatDate value="${reclamacao.data}" pattern="dd/MM/yyyy" /></td>
										<td>${reclamacao.unidade.descricao}</td>
										<td>${reclamacao.setor.descricao}</td>
										<td>${reclamacao.tipoReclamacao.nome}</td>
										<td class="uppercase">${reclamacao.descricao}</td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
				</div>
			</fieldset>
		</section>
	</div>
</body>
</html>