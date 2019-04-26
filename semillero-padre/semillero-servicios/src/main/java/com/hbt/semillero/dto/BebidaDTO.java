package com.hbt.semillero.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Objeto de transferencia que mapea los atributos de la entidad Bebida
 * @author SantiagoPC
 *
 */

public class BebidaDTO implements Serializable {
	
	/**
	 * Serial
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * identidicador unico de la bebida
	 */
	private Long idBebida;

	/**
	 * Nombre de la bebida
	 */
	private String nombreBebida;
	
	/**
	 * Precio de la bebida
	 */
	private double precio;

	/**
	 * Método que obtiene el valor de la propiedad NombreBebida
	 * 
	 * @return the nombreBebida
	 */
	public String getNombreBebida() {
		return nombreBebida;
	}

	/**
	 * Método que asigna el valor de la propiedad nombreBebida
	 * 
	 * @param nombreBebida the nombreBebida to set
	 */
	public void setNombreBebida(String nombreBebida) {
		this.nombreBebida = nombreBebida;
	}
	/**
	 * Método que asigna el valor de la propiedad precio
	 * 
	 * @param precio the precio to set
	 */
	public void setPrecio(int precio) {
		this.precio = precio;
	}

	/**
	 * Método que obtiene el valor de la propiedad PRecio
	 * 
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * Método que asigna el valor de la propiedad precio
	 * 
	 * @param precio the precio to set
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	
	

}
