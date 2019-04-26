package com.hbt.semillero.dto;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;

import com.hbt.semillero.entidades.Bebida;
import com.hbt.semillero.entidades.Cliente;
import com.hbt.semillero.entidades.Plato;

/**
 * Objeto de transferencia que mapea los atributos de la entidad Pedido
 * @author SantiagoPC
 *
 */

public class PedidoDTO implements Serializable {
	
	/**
	 * Serial
	 */
	private static final long serialVersionUID = 1L;
	
    /**
     * identidicador unico de pedido
     */
	
	private Long idPedido;
	/**
	 * fecha del pedido
	 */
	
	private Calendar fechaPedido;
	/**
	 * Plato del pedido
	 */
	
	private PlatoDTO plato;
	
	/**
	 * bebida del pedido
	 */
	private BebidaDTO bebida;
	
	/**
	 * Cliente que hace corresponde al pedido
	 */
	private ClienteDTO cliente;
	/**
	 * Valor del pedido
	 */
	private double valorPedido;

	/**
	 * Método que obtiene el valor de la propiedad FechaPedido
	 * 
	 * @return the fechaPedido
	 */
	public Calendar getFechaPedido() {
		return fechaPedido;
	}

	/**
	 * Método que asigna el valor de la propiedad fechaPedido
	 * 
	 * @param fechaPedido the fechaPedido to set
	 */
	public void setFechaPedido(Calendar fechaPedido) {
		this.fechaPedido = fechaPedido;
	}

	/**
	 * Método que obtiene el valor de la propiedad Plato
	 * 
	 * @return the plato
	 */
	public PlatoDTO getPlato() {
		return plato;
	}
	
	/**
	 * Método que asigna el valor de la propiedad plato
	 * 
	 * @param plato the plato to set
	 */

	public void setPlato(PlatoDTO plato) {
		this.plato = plato;
	}

	/**
	 * Método que obtiene el valor de la propiedad Bebida
	 * 
	 * @return the bebida
	 */
	public BebidaDTO getBebida() {
		return bebida;
	}

	/**
	 * Método que asigna el valor de la propiedad bebida
	 * 
	 * @param bebida the bebida to set
	 */
	public void setBebida(BebidaDTO bebida) {
		this.bebida = bebida;
	}

	/**
	 * Método que obtiene el valor de la propiedad CLiente
	 * 
	 * @return the cliente
	 */
	public ClienteDTO getCliente() {
		return cliente;
	}


	public void setCliente(ClienteDTO cliente) {
		this.cliente = cliente;
	}
	/**
	 * Método que asigna el valor de la propiedad valorPedido
	 * 
	 * @param valorPedido the valorPedido to set
	 */
	public void setValorPedido(int valorPedido) {
		this.valorPedido = valorPedido;
	}

	/**
	 * Método que obtiene el valor de la propiedad ValorPedido
	 * 
	 * @return the valorPedido
	 */
	public double getValorPedido() {
		return valorPedido;
	}

	/**
	 * Método que asigna el valor de la propiedad valorPedido
	 * 
	 * @param valorPedido the valorPedido to set
	 */
	public void setValorPedido(double valorPedido) {
		this.valorPedido = valorPedido;
	}

	/**
	 * Método que obtiene el valor de la propiedad IdPedido
	 * 
	 * @return the idPedido
	 */
	public Long getIdPedido() {
		return idPedido;
	}

	/**
	 * Método que asigna el valor de la propiedad idPedido
	 * 
	 * @param idPedido the idPedido to set
	 */
	public void setIdPedido(Long idPedido) {
		this.idPedido = idPedido;
	}
	
	
	
	
	
	


	
	
	

}
