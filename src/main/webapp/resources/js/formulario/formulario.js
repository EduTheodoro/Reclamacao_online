/*
*=======================================================
* Validação do Formulario
*=======================================================
*/
	
$(document).ready(function() {
	$.paramsPage ={
			contexto : "/reclamacao"
	};
	
/******** METODO MODAL *******/
	$('#botaoModal').on("click", function() {
		$("#myModal").modal({
			keyboard : false
		});
	});
/******** VALIDA DATA NO FORMATO DD/MM/AAAA *******/
	function validaData(data) {
	    var regExpCaracter = /[^\d]/;     //Expressão regular para procurar caracter não-numérico.
	    var regExpEspaco = /^\s+|\s+$/g;  //Expressão regular para retirar espaços em branco.
	    if(data.length != 10) {
	        alert('Data fora do padrão DD/MM/AAAA');
	        return false;
	    }
	    splitData = data.split('/');
	    if(splitData.length != 3) {
	        alert('Data fora do padrão DD/MM/AAAA');
	        return false;
	    }
	    /* Retira os espaços em branco do início e fim de cada string. */
	    splitData[0] = splitData[0].replace(regExpEspaco, '');
	    splitData[1] = splitData[1].replace(regExpEspaco, '');
	    splitData[2] = splitData[2].replace(regExpEspaco, '');
	    if ((splitData[0].length != 2) || (splitData[1].length != 2) || (splitData[2].length != 4)) {
	        alert('Data fora do padrão DD/MM/AAAA');
	        return false;
	    }
	    /* Procura por caracter não-numérico. EX.: o "x" em "28/09/2x11" */
	    if (regExpCaracter.test(splitData[0]) || regExpCaracter.test(splitData[1]) || regExpCaracter.test(splitData[2])) {
	        alert('Caracter inválido encontrado!');
	        return false;
	    }
	    dia = parseInt(splitData[0],10);
	    mes = parseInt(splitData[1],10)-1; //O JavaScript representa o mês de 0 a 11 (0->janeiro, 1->fevereiro... 11->dezembro)
	    ano = parseInt(splitData[2],10);
	    
	    var novaData = new Date(ano, mes, dia);
	    if ((novaData.getDate() != dia) || (novaData.getMonth() != mes) || (novaData.getFullYear() != ano)) {
	        alert('Data Inválida!');
	        return false;
	    } else {
	        return true;
	    }
	}

	$('#testeVerde').on("click", function(){
		var isValid = validaData($("#data").val());
		if (isValid) {
			$.post($.paramsPage.contexto + '/adiciona', $("#form").serialize()).done(function(){
				alert("Reclamacao tipo: [" + $('#tipoReclamacao').find(':selected').text().toUpperCase()
						+ "] do setor: [" + $('#modulo').find(':selected').text().toUpperCase() + "] foi adicionada com Sucesso!");
				$('.default').val("");
			}).fail(function(){
				alert("Deu Erro...");
			});
		} else {
			$('#data').val("");
			$('#data').focus();
		}
	});
	/******** VISUALIZA LISTA *******/
	$('#logar').click(function(){
		$("#form-logar").attr("action", 'http://tableau.preventsenior.com.br/views/FastTrack/TempoMdiodeAtendimento?:display_count=no&:original_view=yes&:showShareOptions=true').submit();
	});
});