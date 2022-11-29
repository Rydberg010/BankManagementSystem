import { Component, OnInit } from '@angular/core';
import { User } from '../ClassComponents/user';
import { RegisterService } from '../Services/register.service';

@Component({
  selector: 'app-register-user',
  templateUrl: './register-user.component.html',
  styleUrls: ['./register-user.component.css']
})
export class RegisterUserComponent implements OnInit {

  user: User = new User();

  constructor(private registerService: RegisterService) { }

  ngOnInit(): void {
  }

  userRegister() {
    console.log(this.user);
    this.registerService.registerUser(this.user).subscribe(data=>{
      alert("Successfully Registered")
    },error=>alert("Register Unsuccessfull"));
  }

}
