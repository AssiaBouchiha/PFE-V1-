import { Injectable } from '@angular/core';
import { Facture } from '../model/facture.model';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class FactureService {

  private _facture: Facture;
  private _factures: Array<Facture>;

  constructor(private httpClient: HttpClient) { }

  

  save(facture: Facture) {
    return this.httpClient.post('localhost:8036/api/facture/', facture);
  }

  findAll() {
    return this.httpClient.get('localhost:8036/api/facture/');
  }

  update(facture: Facture) {
    return this.httpClient.post('localhost:8036/api/facture/', facture)
  }

  delete(id: number) {
    
    
    return this.httpClient.delete('localhost:8036/api/facture/', id)
  }

  public get facture(): Facture {
    return this._facture;
  }
  public set facture(value: Facture) {
    this._facture = value;
  }

  public get factures(): Array<Facture> {
    return this._factures;
  }
  public set factures(value: Array<Facture>) {
    this._factures = value;
  }


}
