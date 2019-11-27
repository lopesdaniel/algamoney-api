package br.com.algamoney.api.repository.lancamento;

import java.util.List;

import br.com.algamoney.api.model.Lancamento;
import br.com.algamoney.api.repository.filter.LancamentoFilter;

public interface LancamentoRepositoryQuery {

	public List<Lancamento> filtrar(LancamentoFilter lancamentoFilter);
	
}
