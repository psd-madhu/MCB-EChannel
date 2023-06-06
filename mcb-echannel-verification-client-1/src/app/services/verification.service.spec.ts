import { TestBed } from '@angular/core/testing';

import { EchannelVerificationService } from './verification.service';

describe('EchannelVerificationServiceService', () => {
  let service: EchannelVerificationService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(EchannelVerificationService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
