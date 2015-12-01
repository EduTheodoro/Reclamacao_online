/******* METODO ADICIONA NOVO USUARIO *******/
$(document).ready(function() {
	$('#novoUsuario').click(function(){
		$("#form").attr("action", '/reclamacao/login/adiciona').submit();
	});
});