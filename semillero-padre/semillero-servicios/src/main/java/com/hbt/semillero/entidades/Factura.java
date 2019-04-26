package com.hbt.semillero.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Clase que asocia los datos de una factura
 * 
 *
 */

@Entity
@Table(name = "FACTURA")
public class Factura {
	
	@GeneratedValue(generator = "SEQ")
	@Column(name = "FACTURA_ID")
	private Long idFactura;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Cliente cliente;
	
	@Column(name = "IVA")
	private double iva;
	
	@Column(name = "TOTAL")
	private double total;

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public double getIva() {
		return iva;
	}

	public void setIva(double iva) {
		this.iva = iva;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	
	

}
