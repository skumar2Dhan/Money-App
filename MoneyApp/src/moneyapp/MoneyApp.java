/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moneyapp;



public class MoneyApp {

    
    public static void main(String[] args) {
        Money m =new Money(99,99);
        Money m1= new Money(5,05);
        Money m2= new Money();
        Money m3= new Money(0,50);
       
        Money m4 = new Money(0,01);
        Money m5 = new Money(100,0);
        
       System.out.println(m.toString());
       System.out.println(m1.toString());
       System.out.println(m2.toString());
       System.out.println(m3.toString());
       
       System.out.println("$"+m+" and "+m4+" is "+m.add(m4));
       System.out.println(m);
    }
    
}
