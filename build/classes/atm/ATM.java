/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;
import java.util.Scanner;
/**
 *
 * @author m1803841
 */
public class ATM {
    static boolean  quit =  false;
    int money = 100;
   
    
    public void display(){
        System.out.println("Your Balance is "+money);
    }
   
    public void withdrawl(){
        Scanner  check =  new Scanner(System.in);
        System.out.println("1. 10  2. 20 ");
        int menuW = check.nextInt();
        
        switch(menuW){
        case 1:
            money = money - 10;
                System.out.println(money);
        break;
        case 2:
            money = money - 20;
            System.out.println(money);
        break;           
        }
    }
    
    public void Deposit(){
        Scanner  check =  new Scanner(System.in);
        System.out.println("Amount to Deposit");
        int menuW = check.nextInt();
        
     
        if ((menuW =< 0)&& (menuW < 300)) {
           money = money + menuW;
           System.out.println(money);
        }else {
           System.out.println("error");
        }                    
    }
    
    
    public static void main(String[] args) {
        
        while(quit != true){
            Scanner  check =  new Scanner(System.in);
            System.out.println("1.Withdrawl  2.Deposit  3.display 4. quit ");
            int menu = check.nextInt();

            switch(menu){
            case 1:
                ATM customer=new ATM();
                customer.withdrawl();
            break;
            case 3:
                ATM w=new ATM();
                w.display();
            break;
            case 4:
               quit = true;
            break;
            }

        }
    }
}
