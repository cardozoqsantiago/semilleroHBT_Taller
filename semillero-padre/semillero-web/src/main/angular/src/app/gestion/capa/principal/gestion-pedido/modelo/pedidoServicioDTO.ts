export interface PedidoServicioDTO{
   
	/**
	 * Fecha del pedido
	 */

     fechaPedido: Date

	/**
	 * Plato del pedido
	 */
	
	plato: string;
	
	/**
	 * bebida del pedido
	 */
	bebida: string;
	
	/**
	 * Cliente que hace corresponde al pedido
	 */
    cliente: string;
    
    /**
	 * Tipo de pedido que hace el cliente: para llevar, para consumir
	 */
	tipoPedido: string;

}