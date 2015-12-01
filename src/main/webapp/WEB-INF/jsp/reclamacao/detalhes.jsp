<%@page contentType="text/html; charset=ISO-8859-1" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>:: Detalhes</title>

<!-- Import CSS -->
<link rel="stylesheet" type="text/css" href="<c:url value='/resources/meuEstilo/css/estilo.css'/>" />

</head>
<body>
	<div class="page-right">
		<div class="def-hea-text light-color2">
			<h3>Reclamação: ${reclamacao.id}</h3>
		</div>
		<section>
			<fieldset id="" class="light-color extreme-light-ack set-pre">
				<div class="form-column">
					<div id="" class="form-field">
						<div>
							<br><label class="default">Descrição ::</label><br>
							<br><label class="default uppercase">${reclamacao.descricao}</label>
						</div>
					</div>
				</div>
			</fieldset>
		</section>
	</div>
</body>
</html>