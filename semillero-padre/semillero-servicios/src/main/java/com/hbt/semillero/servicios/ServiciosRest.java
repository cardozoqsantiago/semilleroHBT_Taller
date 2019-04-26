package com.hbt.semillero.servicios;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remove;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import com.hbt.semillero.dto.PedidoDTO;
import com.hbt.semillero.dto.PlatoDTO;
import com.hbt.semillero.dto.ResultadoDTO;
import com.hbt.semillero.entidades.Plato;
import com.hbt.semillero.servicios.interfaces.IConsultasBean;

/**
 * Componente que expone servicios rest.
 * 
 * @author SantiagoPC
 *
 */
@Path("/ServiciosRest")
public class ServiciosRest {
	
	@EJB
	private IConsultasBean consultasBean;
	/**
	 * Crea los platos con sus respectivos atributos en el sistema.
	 * 
	 * @param platoDTO
	 * @return retorno
	 */
	@POST
	@Path("/crearPlato")
	public ResultadoDTO crearPlato(PlatoDTO platoDTO) {
		 ResultadoDTO retorno = new ResultadoDTO();
		 retorno.setExitoso(true);
		 
		 try {
			 consultasBean.crearPlato(platoDTO);
			
		} catch (Exception e) {
			retorno.setMensajeEjecucion("No se pudo crear el plato");
		}
		 return retorno;
		
	}
	
	/**
	 * Consulta los platos existentes en el sistema
	 * 
	 * @return
	 */
	@GET
	@Path("/consultarPlatos")
	public List<PlatoDTO> consultarPlato(){
		List <Plato> plato = consultasBean.consultarPlato();
		List <PlatoDTO> retorno = new ArrayList<>();
		for (Plato platos : plato) {
			PlatoDTO platoDTO = new PlatoDTO();
			platoDTO.setNombre(platos.getNombre());
			platoDTO.setPrecio(platos.getPrecio());
			platoDTO.setDescripcion(platos.getDescripcion());
			retorno.add(platoDTO);
			
		}
		return retorno;	
	}
	/**
	 * Elimina los platos en el sistema.
	 * 
	 * @param platoDTO
	 * @return retorno
	 */
	@POST
	@Path("/eliminarPlato")
	public ResultadoDTO eliminarPlato(PlatoDTO platoDTO) {
		 ResultadoDTO retorno = new ResultadoDTO();
		 retorno.setExitoso(true);
		 
		 try {
			 consultasBean.eliminarPlato(platoDTO);
			
		} catch (Exception e) {
			retorno.setMensajeEjecucion("No se pudo eliminar el plato");
		}
		 return retorno;
		
	}
	/**
	 * Hace el pedido con sus respectivos componentes
	 * 
	 * @param pedidoDTO, idPlato, idBebida, idCliente
	 * @return retorno
	 */
	@POST
	@Path("/hacerPedido")
	public ResultadoDTO hacerPedido(PedidoDTO pedidoDTO, long idPlato, long idBebida, long idCliente) {
		PedidoDTO pedidoDTO2 = new PedidoDTO(); 
		ResultadoDTO retorno = new ResultadoDTO();
		 retorno.setExitoso(true);
		 try {
			 pedidoDTO2.setFechaPedido(Calendar.getInstance());
			 consultasBean.hacerPedido(pedidoDTO, idPlato, idBebida, idCliente);
			
		} catch (Exception e) {
			retorno.setMensajeEjecucion("No se pudo hacer el pedido");
		}
		 return retorno;
	}
	
	/**
	 * Elimina el pedido segun ud id seleccionado
	 * 
	 * @param pedidoDTO
	 * @return retorno
	 */
	@POST
	@Path("/eliminarPedido")
	public ResultadoDTO eliminarPedido(PedidoDTO pedidoDTO) {
		 ResultadoDTO retorno = new ResultadoDTO();
		 retorno.setExitoso(true);
		 
		 try {
			 consultasBean.eliminarPedido(pedidoDTO);
			
		} catch (Exception e) {
			retorno.setMensajeEjecucion("No se pudo eliminar el pedido");
		}
		 return retorno;
		
	}
	
	
	
	
	
	
	
}
