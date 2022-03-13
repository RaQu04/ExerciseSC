import { Component, OnInit } from '@angular/core';
import { ValueService } from './value.service';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { environment } from 'src/environments/environment';


@Component({
  selector: 'app-value',
  templateUrl: './value.component.html',
  styleUrls: ['./value.component.css']
})
export class ValueComponent implements OnInit {

  constructor(private http: HttpClient) { }
  private apiServerUrl = environment.apiBaseUrl;

  ngOnInit(): void {
    this.getDuplicateFromColumn1();
  }
 
  public getDuplicateFromColumn1(): Observable<Value[]>{
    return this.http.get<Value[]>(`${this.apiServerUrl}/column1`);
}
}




export interface Value{
  id: number;
  kolumna1: string;
  kolumna2: string;
  kolumna3: string;
  kolumna4: string;
}
