(function($){
	$().ready(function() {
		$('.footable').footable();
		$("#tabelaReclamacao .remove").on("click", function(event) {
			event.preventDefault();
			
			var idReclamacao = $(this).parent('tr').attr('id');
			var linha = $(this).closest(".item-table-action");
			var footable = $('table').data('footable');
			
			if (confirm("Deseja apagar a Reclamação: " + idReclamacao + " ?")) {
				$.post('/reclamacao/remove', { id : idReclamacao }).done(function(data) {
					linha.hide("slow", function() {
						linha.remove();
						footable.removeRow(linha);
					});
				}).fail(function() {
					alert("Não deu...");
				});
			}
		});
	});
//	var populaTabela = $(function() {
//		$.post('/reclamacao/reclamacoes')
//		.done(function(dados) {
//			$('#tabelaReclamacao').empty();
//			var linhas = [];
//			for(var i=0;dados.length>i;i++){
//				
//				var linhaData = [
//				                 '<tr><td>' + dados[i].id + 
//				                 '</td><td><fmt:formatDate value="' + dados[i].data + '" pattern="dd/MM/yyyy" />' + 
//				                 '</td><td>' + dados[i].unidade + 
//				                 '</td><td>' + dados[i].setor + 
//				                 '</td><td>' + dados[i].tipoReclamacao + 
//				                 '</td><td>' + dados[i].descricao + 
//				                 '</td><td><span>' + "Remover" + '</span></td></tr>'
//				                 ];
//				linhas.push(linhaData);
//			}
//			$('#tabelaReclamacao tbody').append(linhas).trigger('footable_redraw');;
//		}).fail(function(){
//			alert("Não populou a tabela")
//		});
//	});	
})(jQuery);
