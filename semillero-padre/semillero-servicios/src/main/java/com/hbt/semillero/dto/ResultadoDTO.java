package com.hbt.semillero.dto;

import java.io.Serializable;

/**
 * Indica el resultado de ejecución.
 * 
 * @author Santiago Cardozo Q
 *
 */
public class ResultadoDTO implements Serializable {

	/**
	 * Serial
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Indicador de resultado.
	 */
	private boolean exitoso;
	/**
	 * Mensaje de ejecución.
	 */
	private String mensajeEjecucion;

	/**
	 * Método que obtiene el valor de la propiedad exitoso
	 * 
	 * @return the exitoso
	 */
	public boolean isExitoso() {
		return exitoso;
	}

	/**
	 * Método que asigna el valor de la propiedad exitoso
	 * 
	 * @param exitoso the exitoso to set
	 */
	public void setExitoso(boolean exitoso) {
		this.exitoso = exitoso;
	}

	/**
	 * Método que obtiene el valor de la propiedad mensajeEjecucion
	 * 
	 * @return the mensajeEjecucion
	 */
	public String getMensajeEjecucion() {
		return mensajeEjecucion;
	}

	/**
	 * Método que asigna el valor de la propiedad mensajeEjecucion
	 * 
	 * @param mensajeEjecucion the mensajeEjecucion to set
	 */
	public void setMensajeEjecucion(String mensajeEjecucion) {
		this.mensajeEjecucion = mensajeEjecucion;
	}

}