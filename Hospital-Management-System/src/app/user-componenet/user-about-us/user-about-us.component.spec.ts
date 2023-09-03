import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UserAboutUsComponent } from './user-about-us.component';

describe('UserAboutUsComponent', () => {
  let component: UserAboutUsComponent;
  let fixture: ComponentFixture<UserAboutUsComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [UserAboutUsComponent]
    });
    fixture = TestBed.createComponent(UserAboutUsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
