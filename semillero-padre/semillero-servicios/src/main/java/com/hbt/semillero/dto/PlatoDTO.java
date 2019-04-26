package com.hbt.semillero.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;

/**
 * Objeto de transferencia que mapea los atributos de la entidad Plato
 * @author SantiagoPC
 *
 */

public class PlatoDTO implements Serializable {
	
	/**
	 * Serial
	 */
	private static final long serialVersionUID = 1L;
	
    /**
     * identificador unico de plato
     */
	private Long idPlato;
	
	/**
	 * nombre del plato
	 */
	private String nombre;
	
    /**
     * precio del plato
     */
	private double precio;
	
	/**
	 * descripcion del plato
	 */
	private String descripcion;

	/**
	 * Método que obtiene el valor de la propiedad Nombre
	 * 
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public void setPrecio(int precio) {
		this.precio = precio;
	}

	/**
	 * Método que obtiene el valor de la propiedad Descripcion
	 * 
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * Método que obtiene el valor de la propiedad Precio
	 * 
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}

	/**
	 * Método que obtiene el valor de la propiedad IdPlato
	 * 
	 * @return the idPlato
	 */
	public Long getIdPlato() {
		return idPlato;
	}

	/**
	 * Método que asigna el valor de la propiedad idPlato
	 * 
	 * @param idPlato the idPlato to set
	 */
	public void setIdPlato(Long idPlato) {
		this.idPlato = idPlato;
	}
	
	
	
	

}
