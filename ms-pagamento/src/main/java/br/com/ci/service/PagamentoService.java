/**
 * 
 */
package br.com.ci.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ci.model.Pagamento;
import br.com.ci.repository.PagamentoReporitory;

/**
 * @author lucas
 *
 */
@Service
public class PagamentoService {

	@Autowired
	private PagamentoReporitory reporitory;
	
	public List<Pagamento> lista(){
		return this.reporitory.findAll();
	}
	
}
