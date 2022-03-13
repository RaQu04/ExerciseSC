import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-value',
  templateUrl: './value.component.html',
  styleUrls: ['./value.component.css']
})
export class ValueComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

}

export interface Value{
  id: number;
  kolumna1: string;
  kolumna2: string;
  kolumna3: string;
  kolumna4: string;
}
