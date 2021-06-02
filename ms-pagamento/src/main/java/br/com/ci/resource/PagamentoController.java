/**
 * 
 */
package br.com.ci.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ci.model.Pagamento;
import br.com.ci.service.PagamentoService;

/**
 * @author lucas
 *
 */
@RestController
@RequestMapping("/v1/api/pagamento")
public class PagamentoController {

	@Autowired
	private PagamentoService service;
	
	
	@GetMapping
	public ResponseEntity<List<Pagamento>> lista(){
		return ResponseEntity.ok(this.service.lista());
	}
	
}
