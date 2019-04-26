package com.hbt.semillero.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;

/**
 * Objeto de transferencia que mapea los atributos de la entidad Cliente
 * @author SantiagoPC
 *
 */

public class ClienteDTO implements Serializable {
	
	/**
	 * Serial
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Identificador unico del cliente
	 */
	private Long idCliente;
	/**
	 * Nombre del cliente
	 */
	private String nombre;

	/**
	 * Método que obtiene el valor de la propiedad Nombre
	 * 
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * Método que asigna el valor de la propiedad nombre
	 * 
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
