(function($){
	$().ready(function() {
		$.paramsPage ={
				contexto : "/reclamacao"
		};
		$('.footable').footable();
		$("#tabelaReclamacao .remove").on("click", function(event) {
			event.preventDefault();
			
			var idReclamacao = $(this).parent('tr').attr('id');
			var linha = $(this).closest(".item-table-action");
			var footable = $('table').data('footable');
			
			if (confirm("Deseja apagar a Reclamação: " + idReclamacao + " ?")) {
				$.post($.paramsPage.contexto +  '/remove', { id : idReclamacao }).done(function(data) {
					linha.hide("slow", function() {
						linha.remove();
						footable.removeRow(linha);
					});
				}).fail(function() {
					alert("Problemas ao Remover Item.");
				});
			}
		});
		
		$('#atualizar').click(function() {
			$.get($.paramsPage.contexto + '/reclamacoes').done(function(data) {
				$('table tbody').append(data).trigger('footable_redraw');
			});
		});
	});	
})(jQuery);
