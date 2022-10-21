import { Component} from '@angular/core';
import { NgForm } from '@angular/forms';
import { OrderDetailsService } from '../services/order-details.service';

import { GreetingComponent } from 'src/app/greeting/greeting.component';
import { MatDialog } from '@angular/material/dialog';


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent  {
      
    customerDetails = null as any;
   
    constructor(private orderdetailsservice: OrderDetailsService,private matDialog:MatDialog) {
      this.getCustomerDetails();
    }
    message:boolean=false;
    register(registerForm: NgForm) {
      this.orderdetailsservice.registerCustomer(registerForm.value).subscribe(
        (resp) => {
          console.log(resp);
          registerForm.reset();
          this.getCustomerDetails();
        },
        (err) => {
          console.log(err);
        }
      );
    }
  
    getCustomerDetails() {
      this.orderdetailsservice.getCustomers().subscribe(
        (resp) => {
          console.log(resp);
          this.customerDetails = resp;
        },
        (err) => {
          console.log(err);
        }
      );
    }
    open(){
      this.message=true;
    }
  }
    