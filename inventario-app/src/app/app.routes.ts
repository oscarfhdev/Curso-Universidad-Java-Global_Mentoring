import { Routes } from '@angular/router';
import { ProductoListaComponent } from './producto-lista/producto-lista.component';

//http:localhost:4200/productos ruta por default
export const routes: Routes = [
    {path:'productos', component: ProductoListaComponent},
    {path: '', redirectTo: 'productos', pathMatch: 'full'}
];
