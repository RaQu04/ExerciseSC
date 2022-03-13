import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

import {Value} from '../value/value.component';
import { environment } from 'src/environments/environment';

@Injectable({
    providedIn: 'root'
})
export class ValueService{
    private apiServerUrl = environment.apiBaseUrl;

    constructor(private http: HttpClient) { }

    public getValues(): Observable<Value[]> {
        return this.http.get<Value[]>(`${this.apiServerUrl}/values`);
    }

    public getDuplicateFromColumn1(): Observable<Value[]>{
        return this.http.get<Value[]>(`${this.apiServerUrl}/column1`);
    }

    //todo reszta do zrobienia
      
}