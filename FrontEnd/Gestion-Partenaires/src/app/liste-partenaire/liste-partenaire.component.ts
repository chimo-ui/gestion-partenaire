import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { MonPremierService } from '../mes-services/mon-premier.service';
@Component({
  selector: 'app-liste-partenaire',
  templateUrl: './liste-partenaire.component.html',
  styleUrls: ['./liste-partenaire.component.scss']
})
export class ListePartenaireComponent implements OnInit {

  partenaires: any;

  constructor(private http:HttpClient) { }

  ngOnInit(): void {
    let response = this.http.get("http://localhost:8080/p/partenaires");
    response.subscribe((data)=>this.partenaires=data);
  }



}
