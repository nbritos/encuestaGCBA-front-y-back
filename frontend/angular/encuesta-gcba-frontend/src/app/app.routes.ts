import { Routes } from '@angular/router';
import { LoginComponent } from './components/login/login.component';
import { EncuestaResponderComponent } from './components/encuesta-responder/encuesta-responder.component';

export const routes: Routes = [
    {
        path:'',
        pathMatch:'full',
        redirectTo:'encuesta/login'
    },
    {
        path:'encuesta/responder',
        component:EncuestaResponderComponent
    },
    {
        path:'encuesta/login',
        component:LoginComponent
    }
];
