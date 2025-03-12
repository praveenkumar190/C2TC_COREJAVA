import { Component } from '@angular/core';
import { NgForm } from '@angular/forms';
import { OrderService } from './Order.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'Order-module';
constructor(private OrderService: OrderService){
  this.getOrderDetails();
}

  register(registerForm: NgForm){
    this.OrderService.registerOrder(registerForm.value).subscribe(
      (resp: any)=>{
        console.log(resp);
        registerForm.reset();
        this.getOrderDetails();

      },(err: any)=>{
        console.log(err);
      }
    );
  }

  getOrderDetails(){
    this.OrderService.getOrders().subscribe(
      (resp)=>{
        console.log(resp);
        this.OrderDetails=resp;
      }, (err)=>{
        console.log(err);
      }
    );
  }

  OrderDetails= null as any;

  deleteOrder(Order: any){
    this.OrderService.deleteOrder(Order.sid).subscribe(
      (resp)=>{
        console.log(resp);
        this.getOrderDetails();
      },(err)=>{
        console.log(err);
      }
    );
  }
 
  OrderToUpdate={
    O_id: "",
    O_name: "",
    O_dept: "",
    desig:"",
    city: ""
  };

  edit(Order: any){
    this.OrderToUpdate=Order;
  }
  updateOrder(){
    this.OrderService.updateOrder(this.OrderToUpdate).subscribe(
      (resp)=>{
        console.log(resp);
      },(err)=>{
        console.log(err);
      }
    );
  }
  
}
