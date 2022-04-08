import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
const baseUrl = 'http://localhost:8080/p';

@Injectable({
  providedIn: 'root'
})
export class MonPremierService {

  constructor(private http: HttpClient) { }

  


}
