import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CapaComponent } from './capa/capa.component';
import { EncabezadoComponent } from './capa/encabezado/encabezado.component';
import { PiepaginaComponent } from './capa/piepagina/piepagina.component';
import { PrincipalComponent } from './capa/principal/principal.component';
import { GestionPedidoComponent } from './capa/principal/gestion-pedido/gestion-pedido.component';
import { FiltrosComponent } from './capa/principal/gestion-pedido/filtros/filtros.component';
import { ResultadosComponent } from './capa/principal/gestion-pedido/resultados/resultados.component';

@NgModule({
  declarations: [CapaComponent, EncabezadoComponent, PiepaginaComponent, PrincipalComponent, GestionPedidoComponent, FiltrosComponent, ResultadosComponent],
  imports: [
    CommonModule
  ]
})
export class GestionModule { }
