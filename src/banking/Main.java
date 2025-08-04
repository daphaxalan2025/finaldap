
package banking;

import java.util.Scanner;
import bank.bankApp;

public class Main {
    
    public static void main(String[] args) {
        
        int attempt = 3;
        bankApp bc = new bankApp();
        System.out.println("activity 1");
        Scanner sc = new Scanner(System.in);
        
        System.out.println("HELLO! WELCOME TO THE SYSTEM.");
        System.out.println("What do you feel doing today? ");
        System.out.println("1. Banking");
        System.out.println("2. Shopping");
        System.out.println("3. Pay Bills");
        
        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();
        
        switch(choice){
            case 1:
        
                while( attempt != 0 ){

                    
                    
                    System.out.println("Enter your Account No.: ");
                    int accountNum = sc.nextInt();

                    System.out.println("Enter your Pin: ");
                    int pin = sc.nextInt();

                        if(bc.verifyAccount(accountNum, pin)){
                            System.out.println("LOGIN SUCCESS");
                            System.exit(0);

                        }
                        else{
                            attempt--;
                            System.out.println("Invalid Account Number or Pin! Left attempt"+attempt);
                        }

                        if ( attempt == 0){
                            System.out.println("Try Again");
                        }
                }  
            case 2:
                
                break;
                
            case 3:
                
                break;
      
                default:
               
                         System.out.println("INVALID SELECTION!");
            }
        
    }
    }

