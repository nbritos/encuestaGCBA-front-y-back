import { Routes } from '@angular/router';
import { EncuestaResponderComponent } from '../components/encuesta-responder/encuesta-responder.component';
import { LoginComponent } from '../components/login/login.component';

export const routes: Routes = [
    {
        path:'',
        redirectTo:'encuesta/home'
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

