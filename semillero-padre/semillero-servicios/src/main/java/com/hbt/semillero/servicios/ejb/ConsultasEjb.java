package com.hbt.semillero.servicios.ejb;


import java.util.Calendar;
import java.util.List;

import javax.ejb.FinderException;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import com.hbt.semillero.dto.BebidaDTO;
import com.hbt.semillero.dto.PedidoDTO;
import com.hbt.semillero.dto.PlatoDTO;
import com.hbt.semillero.entidades.Bebida;
import com.hbt.semillero.entidades.Cliente;
import com.hbt.semillero.entidades.Pedido;
import com.hbt.semillero.entidades.Plato;
import com.hbt.semillero.servicios.interfaces.IConsultasBean;

/**
 * 
 * @author SantiagoPC
 *
 */

@Stateless
public class ConsultasEjb implements IConsultasBean  {
	
	@PersistenceContext
	private EntityManager entitymanager;
	
	/**
	 * {@link com.hbt.semillero.servicios.interfaces.IConsultasBean#crearPlato()}
	 */
	@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
	public void crearPlato(PlatoDTO platoDTO) {
		//se crea un nuevo plato
		Plato plato = new Plato();
		//se le asignan los valores mapeados a la entidad
		plato.setNombre(platoDTO.getNombre());
		plato.setPrecio(platoDTO.getPrecio());
		plato.setDescripcion(platoDTO.getDescripcion());
		
		//Persisten los datos
		entitymanager.persist(plato);
	}
	
	/**
	 * {@link com.hbt.semillero.servicios.interfaces.IConsultasBean#consultarPlato()}
	 */
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public List<Plato> consultarPlato(){
		//se retorna la consulta con todos los platos existentes
		return entitymanager.createQuery("Select pla FROM Plato pla").getResultList();	
	}

	/**
	 * {@link com.hbt.semillero.servicios.interfaces.IConsultasBean#eliminarPlato()}
	 */
	public void eliminarPlato(PlatoDTO platoDTO) {
		// se asigna el plato a elminar, buscandolo por el id
		Plato plato = entitymanager.find(Plato.class, platoDTO.getIdPlato());
		//se eimina el plato encontrado 
		entitymanager.remove(plato);
		
	}
	

	/**
	 * {@link com.hbt.semillero.servicios.interfaces.IConsultasBean#hacerPedido()}
	 */
	@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
	public double hacerPedido(PedidoDTO pedidoDTO, long idPlato, long idBebida, long idCliente) {
		
		double total;
		double iva;
		/**
		 * se buscan los platos,bebidas y clientes segun los ids que se ingresen
		 */
		Plato plato = entitymanager.find(Plato.class, idPlato);
		Bebida bebida = entitymanager.find(Bebida.class, idBebida);
		Cliente cliente = entitymanager.find(Cliente.class, idCliente);
		
		//se le asignan los valores encontrados al pedido
		Pedido pedido = new Pedido();
		pedido.setPlato(plato);
		pedido.setBebida(bebida);
		pedido.setCliente(cliente);
		pedido.setFechaPedido(pedidoDTO.getFechaPedido());
		//se persisten los datos del pedido 
		entitymanager.persist(pedido);
		
		/**
		 * se calcula el iva y el total del plato
		 */
		iva = (plato.getPrecio() + bebida.getPrecio()) * 0.05;
		total = (plato.getPrecio() + bebida.getPrecio()) + iva;
		
		//una vez todo este correcto, se retorna el valor todal del pedido
		return total;
		
	}

	/**
	 * {@link com.hbt.semillero.servicios.interfaces.IConsultasBean#consultarPedido()}
	 */
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public List<Plato> consultarPedido(long idPlato, long idBebida, long idCliente){
		//se consultan los datos del pedido junto con su marca...faltaron bebida y cliente
		return entitymanager.createQuery("Select pe FROM Pedido pe JOIN FETCH pe.plato where pe.plato.idPlato =:idPlato").getResultList();
	}
	

	/**
	 * {@link com.hbt.semillero.servicios.interfaces.IConsultasBean#eliminarPedido()}
	 */
	public void eliminarPedido(PedidoDTO pedidoDTO) {
		//Se encuentra el pedido segun su id
		
		Pedido pedido = entitymanager.find(Pedido.class, pedidoDTO.getIdPedido());
		// se elimina el pedido 
		entitymanager.remove(pedido);
		
	} 
	
	
}
