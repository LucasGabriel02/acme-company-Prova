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

import br.com.ci.model.Cliente;
import br.com.ci.service.ClienteService;

/**
 * @author lucas
 *
 */
@RestController
@RequestMapping("/v1/api/cliente")
public class ClienteController {

	@Autowired
	private ClienteService service;
	
	
	@GetMapping
	public ResponseEntity<List<Cliente>> lista(){
		return ResponseEntity.ok(this.service.lista());
	}
	
}
