
package activity_1;

import java.util.Scanner;


public class activity2 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Employee Name: ");
        String emname = sc.nextLine();
        
        System.out.println("Enter Hourly Rate: ");
        float rt = sc.nextFloat();
        
        System.out.println("Enter total hours worked this week: ");
        float hwrk = sc.nextFloat();
        
        float wage = (hwrk * rt);
        float sss = (float) (wage * 0.1);
        
        System.out.println("----Wage Summary----");
        System.out.println("Employee:"+emname);
        System.out.println("Hourly Rate:"+rt);
        System.out.println("Hours Worked:"+hwrk);
        System.out.println("Gross Weekly Wage:"+wage);
        System.out.println("SSS Contribution (10%):"+sss);
        System.out.println("--------------------");
        System.out.println("Net Weekly Wage:"+(wage - sss));
        
    }
}
