import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MonPremierComponentComponent } from './mon-premier-component/mon-premier-component.component';
import { PageLoginComponent } from './page-login/page-login.component';

// import the MapsModule for the Maps component
import { FormsModule } from '@angular/forms';
import { PageInscriptionComponent } from './page-inscription/page-inscription.component';
import { PageDashboardComponent } from './page-dashboard/page-dashboard.component';
import { HttpClientModule } from '@angular/common/http';
import { ListePartenaireComponent } from './liste-partenaire/liste-partenaire.component';
import { ListeEntrepriseComponent } from './liste-entreprise/liste-entreprise.component';




@NgModule({
  declarations: [
    AppComponent,
    MonPremierComponentComponent,
    PageLoginComponent,
    PageInscriptionComponent,
    PageDashboardComponent,
    ListePartenaireComponent,
    ListeEntrepriseComponent
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
