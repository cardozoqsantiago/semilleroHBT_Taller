import { Injectable, Injector } from '@angular/core';
import { Observable } from 'rxjs';
import 'rxjs/add/operator/toPromise';
import { AbstractService } from '../template.service';
import { PedidoServicioDTO } from '../../capa/principal/gestion-pedido/modelo/pedidoServicioDTO';
import { PlatoServicioDTO } from '../../capa/principal/gestion-pedido/modelo/platoServicioDTO';

@Injectable({
    providedIn: 'root'
  })

  export class ConsultaPedidoService extends AbstractService {
	
  public pedido: PedidoServicioDTO;
  public listaPedidoDTO: PedidoServicioDTO[];
  
  /**
   * Constructor
   */
  constructor(injector: Injector) {
    super(injector);
  }

  public consultarPedidos(idPlato: number, idBebida:number , idCliente:number):  Observable<PedidoServicioDTO[]> {
    return this.get<PedidoServicioDTO[]>("/semillero-servicios", "/ServiciosRest/consultarPedido",
   {
         idPedido : idPlato as unknown as string
     });
}

  
}