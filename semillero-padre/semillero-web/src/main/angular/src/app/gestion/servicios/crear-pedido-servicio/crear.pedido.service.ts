import { Injectable, Injector } from '@angular/core';
import { Observable } from 'rxjs';
import 'rxjs/add/operator/toPromise';
import { AbstractService } from '../template.service';
import { PedidoServicioDTO } from '../../capa/principal/gestion-pedido/modelo/pedidoServicioDTO';
import { PlatoServicioDTO } from '../../capa/principal/gestion-pedido/modelo/platoServicioDTO';

@Injectable({
    providedIn: 'root'
  })

  export class CrearPedidoService extends AbstractService {
	
  public pedido: PedidoServicioDTO;
  /**
   * Constructor
   */
  constructor(injector: Injector) {
    super(injector);
  }

  public crearPedido(pedido: PedidoServicioDTO, idPlato:number , idBebida:number, idCliente:number):  Observable<PedidoServicioDTO[]> {
    return this.post<PedidoServicioDTO[]>("/semillero-servicios", "/ServiciosRest/consultarPedido",
   {
         pedidoDTO : pedido,
         idPlato : idPlato as unknown as string,
         idBebida : idBebida as unknown as string,
         idCliente : idCliente as unknown as string

     });
}

  
}