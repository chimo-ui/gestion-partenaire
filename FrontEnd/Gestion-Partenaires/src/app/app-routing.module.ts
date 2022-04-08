import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AppComponent } from './app.component';
import { ListeEntrepriseComponent } from './liste-entreprise/liste-entreprise.component';
import { ListePartenaireComponent } from './liste-partenaire/liste-partenaire.component';
import { MonPremierComponentComponent } from './mon-premier-component/mon-premier-component.component';
import { PageDashboardComponent } from './page-dashboard/page-dashboard.component';
import { PageInscriptionComponent } from './page-inscription/page-inscription.component';
import { PageLoginComponent } from './page-login/page-login.component';

const routes: Routes = [
 
  {
    path: 'inscrire',
    component: PageInscriptionComponent
  },
  {
    path: 'carte',
    component: MonPremierComponentComponent
  
  },
  {
    path: 'partenaires',
   component: ListePartenaireComponent},
  {
    path: 'login',
    component: PageLoginComponent
  },
  {
    path: 'entreprise',
    component: ListeEntrepriseComponent
  },

  // {
  //   path:
  //    '', 
  //    redirectTo: 'dash', 
  //    pathMatch: 'full'},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
