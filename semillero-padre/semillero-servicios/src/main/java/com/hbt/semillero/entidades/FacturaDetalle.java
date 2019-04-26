package com.hbt.semillero.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Clase que asocia los datos de todas las clases con la factura
 * 
 *
 */

@Entity
@Table(name = "FACTURA_DETALLE")
public class FacturaDetalle {
	
	
	@GeneratedValue(generator = "SEQ")
	@Column(name = "DETALLE_ID")
	private long idDetalle;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FACTURA_ID")
	private Factura factura;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PLATO_ID")
	private Plato plato;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "BEDIDA_ID")
	private Bebida bebida;
	
	@Column(name = "PRECIO_UNITARIO")
	private int precio;

	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	public Plato getPlato() {
		return plato;
	}

	public void setPlato(Plato plato) {
		this.plato = plato;
	}

	public Bebida getBebida() {
		return bebida;
	}

	public void setBebida(Bebida bebida) {
		this.bebida = bebida;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	
	
	

}
