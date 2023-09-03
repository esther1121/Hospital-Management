import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UserViewDoctorsComponent } from './user-view-doctors.component';

describe('UserViewDoctorsComponent', () => {
  let component: UserViewDoctorsComponent;
  let fixture: ComponentFixture<UserViewDoctorsComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [UserViewDoctorsComponent]
    });
    fixture = TestBed.createComponent(UserViewDoctorsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
