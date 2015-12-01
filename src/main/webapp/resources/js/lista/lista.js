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
})(jQuery);
