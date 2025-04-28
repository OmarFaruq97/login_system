import { Component, NgModule } from '@angular/core';
import { AuthService } from '../../core/auth.service';
import { Router } from '@angular/router';
import { FormsModule, NgModel } from '@angular/forms';
import { NgFor } from '@angular/common';

@Component({
  selector: 'app-signup',
  imports: [NgFor, FormsModule],
  templateUrl: './signup.component.html',
  styleUrl: './signup.component.scss'
})
export class SignupComponent {
  email = '';
  password = '';
  firstName = '';
  lastName = '';
  phoneNumber = '';
  role = '';
  roles: string[] = ['ADMIN', 'TEACHER', 'STUDENT'];

  constructor(private auth: AuthService, private router: Router) { }

  onSignUp() {
    this.auth.signup({ email: this.email, password: this.password, lastName: this.lastName, firstName: this.firstName, role: this.role, phoneNumber: this.phoneNumber })
      .subscribe({
        next: (res) => {
          alert('Registered successfully.')
          this.router.navigate(['/login']);
        },
        error: (error) => {
          alert('Registration failed.')
          console.log(error)
        }
      });
  }
}
