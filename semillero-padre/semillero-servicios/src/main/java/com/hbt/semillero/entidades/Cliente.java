package com.hbt.semillero.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

/**
 * Clase que asocia los datos de un cliente
 * 
 *
 */

@Entity
@Table(name = "CLIENTE")
public class Cliente {
	
	
	@GeneratedValue(generator = "SEQ")
	@Column(name = "CLIENTE_ID")
	private Long idCliente;
	
	
	@Column(name = "CLIENTE_NOMBRE")
	private String nombre;


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	

}
