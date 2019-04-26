package com.hbt.semillero.servicios.interfaces;

import java.util.List;

import javax.ejb.Local;

import com.hbt.semillero.dto.PedidoDTO;
import com.hbt.semillero.dto.PlatoDTO;
import com.hbt.semillero.entidades.Plato;

@Local
public interface IConsultasBean {
	
	public void crearPlato(PlatoDTO platoDTO);
	/**
	 * Consulta una lista de todos los platos en el sistema
	 */
	public List<Plato> consultarPlato();
	/**
	 * Elimina el plato segun el id seleccionado
	 */
	public void eliminarPlato(PlatoDTO platoDTO);
	/**
	 * Se crea un pedido y se le asocian plato,bebida,cliente segun el id correspondiente a 
	 * cada tipo de plato, bebida y cliente
	 */
	public double hacerPedido(PedidoDTO pedidoDTO, long idPlato, long idBebida, long idCliente);
	/**
	 * Se elimina el pedido segun un id
	 */
	public void eliminarPedido(PedidoDTO pedidoDTO);
	/**
	 * Consulta una lista de todas los pedidos asociadas con un plato,bedida, y cliente registrados en el
	 * sistema.
	 */
	public List<Plato> consultarPedido(long idPlato, long idBebida, long idCliente);

}
