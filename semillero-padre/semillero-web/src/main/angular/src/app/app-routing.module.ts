import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { GestionPedidoComponent } from './gestion/capa/principal/gestion-pedido/gestion-pedido.component';


const routes: Routes = [
	{   path: 'gestion-pedido',
	    component: GestionPedidoComponent 
  	},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
