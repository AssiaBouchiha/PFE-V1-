import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FactureCreateComponent } from './view/factures/facture-create/facture-create.component';
import { FactureListComponent } from './view/factures/facture-list/facture-list.component';
import { FactureEditComponent } from './view/factures/facture-edit/facture-edit.component';
import { FactureViewComponent } from './view/factures/facture-view/facture-view.component';
import { FormsModule } from '@angular/forms';
import { HtmlParser } from '@angular/compiler';
import { HttpClientModule, HttpParams } from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    FactureCreateComponent,
    FactureListComponent,
    FactureEditComponent,
    FactureViewComponent
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
