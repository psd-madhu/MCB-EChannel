import { AfterViewInit, Component, OnInit } from '@angular/core';
import { EchannelVerificationService } from 'src/app/services/verification.service';
import { Statistics } from 'src/app/model/statistics';
import { Observable } from 'rxjs';

declare const $: any;


@Component({
  selector: 'app-statistics-menu',
  templateUrl: './statistics-menu.component.html',
  styleUrls: ['./statistics-menu.component.css']
})
export class StatisticsMenuComponent implements OnInit, AfterViewInit {

  statistics!: Statistics;

  constructor(
    private verificationService: EchannelVerificationService
  ) {}
  ngAfterViewInit(): void {
  //  $('#statistics').DataTable();
  }

  ngOnInit(): void {
    this.getStatistics();
  }

  getStatistics() {
    return this.verificationService.getStatistics()
    .subscribe((data: any) => 
    {console.log(data)
      this.statistics = data}
    );
  }

}
