import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AppComponent } from './app.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { UsuariosService } from './services/usuarios.service';
import { EncuestaService } from './services/encuestaService';
import { AgradecimientoComponent } from './components/agradecimiento/agradecimiento.component';



@NgModule({
  declarations: [
    AppComponent
    // HeaderComponent
  ],
  imports: [
    CommonModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule
  ],
  providers:[
    UsuariosService,
    EncuestaService,
    AgradecimientoComponent
  ]
})
export class AppModule { }
