import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})
export class OrderDetailsService {

  constructor(private http: HttpClient) { }

  API = 'http://localhost:8090';

  
  public registerCustomer(customerData: any) {
    return this.http.post(this.API + '/registerCustomer', customerData);
  }

  public getCustomers() {
    return this.http.get(this.API + '/getCustomers');
  }


  shoppingDetails=[
    {
    id : 1,
    Name : "Classic Sensational Women Dresses",
    Fabric : "Cotton",
    price : 300,
    Img : "https://images.meesho.com/images/products/55276885/5zxzr_512.webp"
    },
    {
    id : 2,
    Name : "Tshirts",
    Fabric : "Cotton Blend",
    price :400,
    Img : "https://images.meesho.com/images/products/166897320/vviqo_512.webp"
    },
    {
    id : 3,
    Name : "BANARASI SILK SAREE",
    Fabric : "Soft Silk",
    price : 450,
    Img : "https://images.meesho.com/images/products/173052420/shtlj_512.webp"
    },
    {
    id : 4,
    Name :"Cotton Blend Frocks & Dresses",
    Fabric : "Cotton Blend",
    price : 500,
    Img : "https://images.meesho.com/images/products/148562919/ifhsq_512.webp"
    },
    {
    id : 5,
    Name : "Super romper",
    Fabric : "Cotton",
    price : 500,
    Img :"https://images.meesho.com/images/products/135045424/0r8zq_512.webp"
    }
    ]
}

