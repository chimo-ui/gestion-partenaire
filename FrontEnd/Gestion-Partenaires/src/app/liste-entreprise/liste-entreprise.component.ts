import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { ListePartenaireComponent } from '../liste-partenaire/liste-partenaire.component';

@Component({
  selector: 'app-liste-entreprise',
  templateUrl: './liste-entreprise.component.html',
  styleUrls: ['./liste-entreprise.component.scss']
})
export class ListeEntrepriseComponent implements OnInit {
entreprises : any;
  constructor(private http:HttpClient) { }

  ngOnInit(): void {
    let response = this.http.get("http://localhost:8080/p/entreprises");
    response.subscribe((data)=>this.entreprises=data);
  }

}
