/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moneyapp;

/**
 *
 * @author user
 */
public class Money {
    private int Dollars;
    private int Cents;
    
    public Money(){
        Dollars=0;
        Cents=0;
        
    
        
    }    
    
    public Money(int a, int b){
        Dollars=a;
        Cents=b;
                
    
    }
    
    public Money(int d){
        Dollars= d;
        Cents=0;
    
    }
    
    public String toString (){
      String a=("Amount of money: " + Dollars + "." + Cents );
      return a;
    }
    
    public int getDollars(){return Dollars;}
    public int getCents(){return Cents;}
    public void setDollars(int d){Dollars=d;}
    public void setCents(int c){Cents=c;}
    
    public Money add(Money money){
      Money addmoney; 
        int a= money.Dollars+ this.Dollars;
        int b= money.Cents+this.Cents;
        if (b>99){
         a+=b/100; 
        } 
         addmoney=new Money(a,b);
         System.out.println(addmoney.toString());
       
      return addmoney;
           
    }
    
    
     public String subst(Money money, Money money1){
        int a= money.Dollars- money1.Dollars +1;
        int b= money.Cents-money1.Cents;
        String sub=("The substraction of amounts is: " +a+"."+b);
        return sub;
    }
    
}
