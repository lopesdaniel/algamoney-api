package br.com.algamoney.api.repository.lancamento;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import br.com.algamoney.api.dto.LancamentoEstatisticaCategoria;
import br.com.algamoney.api.dto.LancamentoEstatisticaDia;
import br.com.algamoney.api.model.Lancamento;
import br.com.algamoney.api.repository.filter.LancamentoFilter;
import br.com.algamoney.api.repository.projection.ResumoLancamento;

public interface LancamentoRepositoryQuery {
	

	public List<LancamentoEstatisticaDia> porDia(LocalDate mesReferencia);

	public List<LancamentoEstatisticaCategoria> porCategoria(LocalDate mesReferencia);
	
	public Page<Lancamento> filtrar(LancamentoFilter lancamentoFilter, Pageable pageable);

	public Page<ResumoLancamento> resumir(LancamentoFilter lancamentoFilter, Pageable pageable);
	
}
