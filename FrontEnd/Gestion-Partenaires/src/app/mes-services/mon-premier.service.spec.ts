import { TestBed } from '@angular/core/testing';

import { MonPremierService } from './mon-premier.service';

describe('MonPremierService', () => {
  let service: MonPremierService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(MonPremierService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
