/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corejave;

import java.util.ArrayList;
import java.util.Iterator;


class Product{
    String item;
    int qty;

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
        
        
    }

    @Override
    public String toString() {
        return "Product{" + "item=" + item + ", qty=" + qty + '}';
    }
    
}
public class Arraylisttest {

    
    public static void main(String[] args) {
ArrayList<Product> arr=new ArrayList<Product>();
/*arr.add("Cpu");
arr.add("disk");
arr.add("Ram");
arr.add("Rom");*/

Product parray[]=new Product[5];
Product p=new Product();
p.setItem("cpu");
p.setQty(20);
parray[0]=p;
p.setItem("cpu");
p.setQty(20);
parray[1]=p;
       // System.out.println(parray.toString());
       /* for(int i=0;i<parray.length-1;i++){
            System.out.print(arr.get(i)+" ");
            
        }*/
        System.out.println("");
             System.out.println("");
             for(Object obj:parray){
                 System.out.print(obj+"  ");
             }
        
// TODO code application logic here
    }
    
}
