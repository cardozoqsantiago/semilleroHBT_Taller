import { Component, OnInit } from '@angular/core';
import {PedidoServicioDTO} from './modelo/pedidoServicioDTO';

@Component({
  selector: 'app-gestion-pedido',
  templateUrl: './gestion-pedido.component.html',
  
})
export class GestionPedidoComponent implements OnInit {

  public pedido:PedidoServicioDTO;

  constructor() { }

  ngOnInit() {
    this.pedido = {
     
	    // Fecha del pedido
        fechaPedido: null,
      //Plato del pedido     
        plato: "pasta",     
      //bebida del pedido
        bebida: "coca",   
      //Cliente que hace corresponde al pedido
        cliente: "Santiago",       
      //Tipo de pedido que hace el cliente: para llevar, para consumir
        tipoPedido: "Consumir",
    }
  }

}
