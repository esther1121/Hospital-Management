import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UserViewNurceComponent } from './user-view-nurce.component';

describe('UserViewNurceComponent', () => {
  let component: UserViewNurceComponent;
  let fixture: ComponentFixture<UserViewNurceComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [UserViewNurceComponent]
    });
    fixture = TestBed.createComponent(UserViewNurceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
