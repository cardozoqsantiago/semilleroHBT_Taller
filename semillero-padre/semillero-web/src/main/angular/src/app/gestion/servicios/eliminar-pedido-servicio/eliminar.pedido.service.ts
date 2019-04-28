import { Injectable, Injector } from '@angular/core';
import { Observable } from 'rxjs';
import 'rxjs/add/operator/toPromise';
import { AbstractService } from '../template.service';
import { PedidoServicioDTO } from '../../capa/principal/gestion-pedido/modelo/pedidoServicioDTO';
import { PlatoServicioDTO } from '../../capa/principal/gestion-pedido/modelo/platoServicioDTO';

@Injectable({
    providedIn: 'root'
  })

  export class EliminarPedidoService extends AbstractService {
	
  public pedido: PedidoServicioDTO;
  /**
   * Constructor
   */
  constructor(injector: Injector) {
    super(injector);
  }

  public eliminarPedido(pedido: PedidoServicioDTO):  Observable<PedidoServicioDTO[]> {
    return this.delete<PedidoServicioDTO[]>("/semillero-servicios", "/ServiciosRest/consultarPedido",
   {
         
     });
}

  
}