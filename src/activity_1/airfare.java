
package activity_1;

import java.util.Scanner;

public class airfare {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Enter distance: ");
        int distance = sc.nextInt();
        
        System.out.println("Choose your class.");
        System.out.println("Class 1: Economy Class");
        System.out.println("Class 2: Business Claas");
        
        System.out.println("Enter your Class:");
        int seat = sc.nextInt();
        
        if (seat == 1){
         int total = distance * 250;
            System.out.println("Fare:"+total);
           
    }else{
            int total = distance * 500;
            
            if (distance > 1000){
                
                float ttl = (float) total * (float) 0.10;
                float fare = total - ttl;
                
                System.out.println("Fare:"+fare);
            }
                
                }        
    }
}
