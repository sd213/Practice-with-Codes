import java.lang.reflect.Method;
import java.util.*;
public class Main {
    
    void method1(){
        Scanner sa = new Scanner(System.in);
        System.out.println("Enter Your Name : ");
        String name = sa.nextLine();
        System.out.println("Enter your Employ Id : ");
        int empid = sa.nextInt();
        System.out.println("Enter Your Salary : ");
        float sal = sa.nextFloat();
        sa.nextLine();
        System.out.println("Enter Your address : ");
        String Addres = sa.nextLine();
       
        System.out.println("_______User Details_______");

        System.out.println("Employ Name : " + name);
        System.out.println("Employ Id : "+ empid);
        System.out.println("Employ Salary : " + sal ) ;
        System.out.println("Employ Address : " + Addres);
    }    
    public static void main(String[] args) {
        
        new Main().method1();
    }
}