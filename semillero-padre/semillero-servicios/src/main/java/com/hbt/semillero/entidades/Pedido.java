package com.hbt.semillero.entidades;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
/**
 * Clase que gestiona un pedido
 * 
 *
 */

@Entity
@Table(name="BEBIDA")
public class Pedido {
	
	@GeneratedValue(generator = "SEQ")
	@Column(name = "PEDIDO_ID")
	private Long idPedido;
	
	@Column(name = "FECHA_PEDIDO")
	private Calendar fechaPedido;
	
	@Column(name = "PLATO")
	private Plato plato;
	
	@Column(name = "BEBIDA")
	private Bebida bebida;
	
	@Column(name = "CLIENTE")
	private Cliente cliente;
	
	private double valorPedido;

	public Calendar getFechaPedido() {
		return fechaPedido;
	}

	public void setFechaPedido(Calendar fechaPedido) {
		this.fechaPedido = fechaPedido;
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

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public void setValorPedido(int valorPedido) {
		this.valorPedido = valorPedido;
	}

	public double getValorPedido() {
		return valorPedido;
	}

	public void setValorPedido(double valorPedido) {
		this.valorPedido = valorPedido;
	}
	
	
	
	
	
	
	

}
