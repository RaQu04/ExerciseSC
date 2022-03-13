import { Component, OnInit } from '@angular/core';
import { ValueService } from './value/value.service';
import { Value } from './value/value.component';
import { HttpErrorResponse } from '@angular/common/http';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'frontend';
  public values: Value[] = [];

  constructor(private valueService: ValueService){}

  ngOnInit() {
    this.getValues();
  }

  public getValues(): void {
    this.valueService.getValues().subscribe(
      (response: Value[]) => {
        this.values = response;
        console.log(this.valueService);
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
      }
    );
}

}
