import { Component, Inject, Input, OnInit } from '@angular/core';
import { EchannelVerificationService } from 'src/app/services/verification.service';
import { EventSource } from 'src/app/model/event-source';
import { ActivatedRoute } from '@angular/router';
import {FormControl, FormGroup, ReactiveFormsModule } from '@angular/forms';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-verification-menu',
  templateUrl: './verification-menu.component.html',
  styleUrls: ['./verification-menu.component.css'],
  providers: [EchannelVerificationService]
})
export class VerificationMenuComponent implements OnInit{

  bKey: any;
  eventSource!: EventSource ;
  verificationForm!: FormGroup;
  registerForm!: FormGroup;
  upd!: EventSource;

  constructor(
    private verificationService: EchannelVerificationService,
    private activatedRoute: ActivatedRoute,   // public event: EventSource
  ) {}

  ngOnInit(): void {
    this.bKey = this.activatedRoute.snapshot.paramMap.get('businessKey');
   
     this.verificationForm = new FormGroup({
        businessKey: new FormControl({}),
        priority: new FormControl(),
        sourceBU: new FormControl(),
        dcpReference: new FormControl(),
        accountName: new FormControl(),
        transactionCurrency :new FormControl(),
        transactionAmount : new FormControl(),
        lockedBy : new FormControl(),
        debitAccountNumber :new FormControl(),
        accountCurrency : new FormControl(),
        beneficiaryName : new FormControl(),
        custInfoMkr : new FormControl(),
        accountInfoMkr :new FormControl(),
        outcome : new FormControl(),
        extension : new FormControl(),
        contactPerson : new FormControl(),
        customerCalledOn : new FormControl(),
        comment : new FormControl(),
        status : new FormControl()
     });
     }
     
  

  getEvent(businessKey:any):any{
     return this.verificationService.getEventSource(businessKey)
                            .subscribe(data => {
                              console.log(data);
                              this.verifyEventSource(data);
                              this.eventSource = data});

                              
  }

  verifyEventSource(eventSource: EventSource) {
    this.verificationForm.patchValue({
      businessKey: eventSource.businessKey,
      priority: eventSource.priority,
      sourceBU: eventSource.sourceBU,
      dcpReference: eventSource.dcpReference,
      accountName: eventSource.accountName,
      transactionCurrency : eventSource.transactionCurrency,
      transactionAmount : eventSource.transactionAmount,
      lockedBy : eventSource.lockedBy,
      debitAccountNumber : eventSource.debitAccountNumber,
      accountCurrency : eventSource.accountCurrency,
      beneficiaryName : eventSource.beneficiaryName,
      custInfoMkr : eventSource.custInfoMkr,
      accountInfoMkr : eventSource.accountInfoMkr,
      outcome : eventSource.outcome,
      extension : eventSource.extension,
      contactPerson : eventSource.contactPerson,
      customerCalledOn : eventSource.customerCalledOn,
      comment : eventSource.comment,
      status : eventSource.status
    });
  }

  submitForProceed() {
   
    this.mapFormValuesToEventSource();

    if(this.eventSource)
      this.eventSource.status = 'Proceed';
      this.verificationService.updateEventSource(this.eventSource)
      .subscribe(data=> this.upd = data);
  }

  submitForReject() {
    this.mapFormValuesToEventSource();

    if(this.eventSource)
      this.eventSource.status = 'Reject';
      this.verificationService.updateEventSource(this.eventSource)
      .subscribe(data=> this.upd = data);
  }
  
  mapFormValuesToEventSource() {
    if(this.eventSource){
      this.eventSource.outcome = this.verificationForm.value.outcome;
      this.eventSource.extension = this.verificationForm.value.extension;
      this.eventSource.contactPerson = this.verificationForm.value.contactPerson;
      this.eventSource.customerCalledOn = this.verificationForm.value.customerCalledOn;
      this.eventSource.comment = this.verificationForm.value.comment;
      this.eventSource.status = this.verificationForm.value.status;
    }
  }

}
