package com.hbt.semillero.entidades;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Clase que asocia los datos de una bebida
 * 
 *
 */

@Entity
@Table(name="BEBIDA")
public class Bebida {
	
	@Id
	@GeneratedValue(generator = "SEQ")
	@Column(name = "BEBIDA_ID")
	private Long idBebida;

	@Column(name = "BEBIDA_NOMBRE")
	private String nombreBebida;
	
	@Column(name = "PRECIO")
	private double precio;

	public String getNombreBebida() {
		return nombreBebida;
	}

	public void setNombreBebida(String nombreBebida) {
		this.nombreBebida = nombreBebida;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	
	
	
	

}
