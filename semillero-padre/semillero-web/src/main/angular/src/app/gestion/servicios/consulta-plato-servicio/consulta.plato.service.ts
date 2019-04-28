import { Injectable, Injector } from '@angular/core';
import { Observable } from 'rxjs';
import 'rxjs/add/operator/toPromise';
import { AbstractService } from '../template.service';
import { PedidoServicioDTO } from '../../capa/principal/gestion-pedido/modelo/pedidoServicioDTO';
import { PlatoServicioDTO } from '../../capa/principal/gestion-pedido/modelo/platoServicioDTO';

@Injectable({
    providedIn: 'root'
  })

  export class ConsultaPlatoService extends AbstractService {
	
  public plato: PlatoServicioDTO;
  public listaPlatoDTO: PlatoServicioDTO[];
  
  /**
   * Constructor
   */
  constructor(injector: Injector) {
    super(injector);
  }

  public consultarPlatos(nombre : string):  Observable<PlatoServicioDTO[]> {
    return this.get<PlatoServicioDTO[]>("/semillero-servicios", "/ConsultasRest/consultarPlatos",
    {
         "nombre" : nombre
      });
 
     }

}

