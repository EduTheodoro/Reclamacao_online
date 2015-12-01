$(document).ready(function() {
	$('#logar').click(function() {
		$("#form-logar").attr("action", '/reclamacao/login/autentica').submit();
	});
});