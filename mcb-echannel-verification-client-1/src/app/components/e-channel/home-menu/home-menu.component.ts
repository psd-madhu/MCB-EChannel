import { Component, OnInit, AfterViewInit } from '@angular/core';
import { EventSource } from 'src/app/model/event-source';
import { EchannelVerificationService } from './../../../services/verification.service';

declare const $: any;

@Component({
  selector: 'app-home-menu',
  templateUrl: './home-menu.component.html',
  styleUrls: ['./home-menu.component.css'],
  providers: [EchannelVerificationService]
})
export class HomeMenuComponent implements OnInit, AfterViewInit{
  
  events?: EventSource[]

  constructor(
  //  private events: EventSource[],
    private verificationService: EchannelVerificationService
  ) {}

  ngAfterViewInit(): void {
    
  }

  ngOnInit(): void {
    this.getAllEventSourceList();
    $('#example').DataTable();
  }

  getAllEventSourceList() {
    this.verificationService.getAllEventSourceList()
                            .subscribe(data => this.events = data);
  }

  

  getEventDetails(businessKey: string){
    
  }

  open(){}

  view(){}

  


}
