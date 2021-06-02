/**
 * 
 */
package br.com.ci.model;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


/**
 * @author lucas
 *
 */

@Data
@Entity
@Table(name = "tb_Pagamento")
public class Pagamento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Long id;
	
	private String nome;
	
	private String data;
	
	private String valor;
	
	
}
