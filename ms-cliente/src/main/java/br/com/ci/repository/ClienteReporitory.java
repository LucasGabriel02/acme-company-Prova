/**
 * 
 */
package br.com.ci.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ci.model.Cliente;

/**
 * @author lucas
 *
 */
@Repository
public interface ClienteReporitory extends JpaRepository<Cliente, Long> {

}
