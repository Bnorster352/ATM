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
public class ATM { // makes it global 
    static boolean  quit =  false; //this is naming a new variable thats being named, it is also setting its value.
    public static int money = 100; //this is creating and and naming a new int. setting the value as 100.  
   
    
    public void display(){// new method called display
        System.out.println("Your Balance is "+money);// print text and the value under the int variable called money
    }
   
    public void withdrawl(){// new method called withdrawl 
        Scanner  check =  new Scanner(System.in);// scanner used to check the input 
        System.out.println("1. 10  2. 20 ");// displays the text 
        int menuW = check.nextInt();// making a new int that value changes depending on input from user
        
        switch(menuW){
        case 1://if case 1 is entered 
            money = money - 10;// new value of money will be the old money - 10
                System.out.println(money);// print the new value of money 
        break;
        case 2:// if case 2 is entered
            money = money - 20;// new value of money will be the old money - 20
            System.out.println(money);// print new value of money 
        break;  // end it here             
            
        }
    }
    
    public void help(){// new method called help 
        System.out.println(" read the options and select what you want "// print text 
                + " press enter"
                + " if you need assistance call 01642 579200 ");
        
        
    }
    
    
    public void Deposit(){// new function called deposit 
        Scanner  check =  new Scanner(System.in);// check the input 
        System.out.println("Amount to Deposit");// print text 
        int menuW = check.nextInt();// making a new int that value changes depending on input from user
        
     
        if((menuW >= 0) && (menuW < 300)){//if the int previously entered is more than 0 and less than 300
           money = money + menuW;// change the value of money to, the old money plus the int entered 
           System.out.println(money);// then print out the new value of money 
        }else  {// if not
           System.out.println("error");// then print error 
           
  
        }              
    
    }
    

    public static void main(String[] args) {//this is where all the methods are called and put together
        
        while(quit != true){// while quit isnt true do this
            Scanner  check =  new Scanner(System.in);// use scanner 
            System.out.println("1.Withdrawl  "
                    + "2.Deposit "
                    + "3.display "
                    + "4. quit "
                    + "5.help");// print the displayed line
            int menu = check.nextInt();// check the number entered 

            switch(menu){
            case 1:// if the checked int is 1 run the next lines
                ATM customer=new ATM();
                customer.withdrawl();//run this method 
            break;//end here
            case 2:// if the checked int is 2 run the next lines
                ATM d=new ATM() ;// create an instance of 
                d.Deposit(); //run this method 
            break;//end here
            case 3:// if the checked int is 3 run the next lines
                ATM w=new ATM();// create an instance of 
                w.display(); //run this method 
            break;//end here
            case 4:// if the checked int is 4 run the next lines
               quit = true;// change quit to true so when the scanner scans it will dplay what it says previously starting on line 73
            break;//end here
            case 5:// if the checked int is 5 run the next lines
                ATM h=new ATM() ;// create an instance of 
                h.help(); //run this method 
            }

        }
    }
}