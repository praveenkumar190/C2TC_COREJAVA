import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class OrderService {
  API="http://localhost:8080";
  public registerOrder(OrderData: any)
  {
    return this.http.post(this.API + '/registerOrder' , OrderData);
  }

  public getOrders(){
    return this.http.get(this.API+'/getOrders');
  }

  public deleteOrder(O_id:any){
    return this.http.delete(this.API+'/deleteCusomter?O_id=' + O_id);
  }

  public updateOrder(Order: any){
    return this.http.put(this.API +'/updateOrder', Order);
  }
  constructor(private http: HttpClient) { }
}
