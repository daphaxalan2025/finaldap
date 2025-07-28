
package activity_1;

import java.util.Scanner;


public class Activity_1 {

    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     
     String name;
     int grade = 0;
             System.out.println("Enter student name: ");
             name = sc.nextLine();
             
             System.out.println("enter num. of subjects: ");
             int subjects = sc.nextInt();
             
             for( int i=  1; i <= subjects; i++){
                 
                 System.out.println("Enter grade for sub"+i+": ");
                 grade += sc.nextInt();
                 
             }
             
             float average = grade / subjects;
        int avearage = 0;
             
             System.out.println("Average: "+avearage);
             
             if(avearage <= 74){
                 System.out.println("PASSED");
             }else{
                 System.out.println("FAILED");
             }
                 }
}
