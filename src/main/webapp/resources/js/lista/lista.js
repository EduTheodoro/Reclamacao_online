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
					alert("Problemas ao Remover Item.");
				});
			}
		});
		var populaTabela = $(function() {
			$.post('/reclamacao/reclamacoes')
			.done(function(dados) {
				$('table tbody').append(dados).trigger('footable_redraw');
			}).fail(function(){
				alert("Não populou a tabela")
			});
		});
	});	
})(jQuery);
