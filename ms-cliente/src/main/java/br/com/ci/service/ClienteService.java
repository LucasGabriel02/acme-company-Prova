/**
 * 
 */
package br.com.ci.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ci.model.Cliente;
import br.com.ci.repository.ClienteReporitory;

/**
 * @author lucas
 *
 */
@Service
public class ClienteService {

	@Autowired
	private ClienteReporitory reporitory;
	
	public List<Cliente> lista(){
		return this.reporitory.findAll();
	}
	
}
