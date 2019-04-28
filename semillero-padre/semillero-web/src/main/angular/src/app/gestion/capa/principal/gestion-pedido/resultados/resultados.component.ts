import { Component, Input, OnInit } from '@angular/core';
import { PedidoServicioDTO } from '../modelo/pedidoServicioDTO';
import { PlatoServicioDTO} from '../modelo/platoServicioDTO';
import { BebidaServicioDTO} from '../modelo/bebidaServicioDTO'
import { ClienteServicioDTO} from '../modelo/clienteServicioDTO'
import { ConsultaPedidoService } from 'src/app/gestion/servicios/consulta-pedido-servicio/consulta.pedido.service';
import { ConsultaPlatoService } from 'src/app/gestion/servicios/consulta-plato-servicio/consulta.plato.service';
import { CrearPedidoService } from 'src/app/gestion/servicios/crear-pedido-servicio/crear.pedido.service';


@Component({
  selector: 'app-resultados',
  templateUrl: './resultados.component.html',
  
})
export class ResultadosComponent implements OnInit {


  public pedido: PedidoServicioDTO;
  public platoSeleccionado : PlatoServicioDTO;
  public bebidaSeleccionada : BebidaServicioDTO;
  public clienteSeleccionado : ClienteServicioDTO;
  public listaPedidoDTO: PedidoServicioDTO[];

  public plato : PlatoServicioDTO;
  public listaPlatoDTO : PlatoServicioDTO[];

  constructor(private consultaPedidoService: ConsultaPedidoService , private consultaPlatoServices : ConsultaPlatoService
    ,private crearPedidoService : CrearPedidoService) {


    this.consultaPedidoService.consultarPedidos(this.platoSeleccionado.idPlato , this.bebidaSeleccionada.idBebida ,this.clienteSeleccionado.idCliente).subscribe(
      pedidos => {
          this.listaPedidoDTO = pedidos;
        },
        error => {
          console.log(error);
        } 
    );

    this.consultaPlatoServices.consultarPlatos(this.platoSeleccionado.nombre).subscribe(
      platos => {
        this.listaPlatoDTO = platos;
      },
      error => {
        console.log(error);
      } 
    );

    this.crearPedidoService.crearPedido(this.pedido , this.platoSeleccionado.idPlato, this.bebidaSeleccionada.idBebida, this.clienteSeleccionado.idCliente).subscribe(
     
      exitoso => {
          console.log(exitoso);
      },
    );
  
}

  ngOnInit() {

    
  }

}
