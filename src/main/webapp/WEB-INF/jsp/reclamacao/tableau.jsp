<%@page contentType="text/html; charset=ISO-8859-1" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>:: Tableau ::</title>

<!-- Import JS-->
<script type="text/javascript" charset="utf-8" src="<c:url value='/resources/js/jquery-1.11.1.min.js'/> "></script>
<script type='text/javascript' src='http://tableau.preventsenior.com.br/javascripts/api/viz_v1.js'></script>

<!-- Import CSS -->
<link rel="stylesheet" type="text/css" href="<c:url value='/resources/meuEstilo/css/estilo.css'/>" />
<link rel="stylesheet" type="text/css" href="<c:url value='/resources/meuEstilo/css/desktop.css'/>" />

</head>
<body>
	<div class="desk-navigation">
		<div class="desk-system-logo desk-menu">
			<img id="desk-system-home" src="<c:url value='/resources/meuEstilo/imgs/Home.png'/>">
		</div>
		<div class="desk-system-user-itens">
			<div id="desk-user-info" class="desk-system-user-info desk-menu">
				<div class="desk-user-name">
					<span>Eduardo Theodoro</span>
				</div>
			</div>
		</div>
	</div>
	<br/>
	<div class="page-right2">
		<section>
			<fieldset id="" class="light-color extreme-light-ack set-pre">
				<div class="form-column">
					<div id="" class="form-field">
						<div class="tableauPlaceholder" style="width: 100%; height: 90%; position: relative; overflow: hidden; display: block;">
							<object class='tableauViz' width='100%' height='100%' style='display:none;'>
								<param name='host_url' value='http://tableau.preventsenior.com.br/views/FastTrack/TempoMdiodeAtendimento?:embed=y&:display_count=no&:showShareOptions=true'/> 
							</object>
						</div>
					</div>
				</div>
			</fieldset>
		</section>
	</div>
</body>
</html>