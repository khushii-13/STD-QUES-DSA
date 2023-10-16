import java.util.Scanner;

public class SalaryTax {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the salary");
    float sal=sc.nextInt();
    if(sal<=10000){
        System.out.println("SALARY= " + sal);
    } 
    else if(sal>10000 && sal<=20000){
        System.out.println("SALARY= " + (sal-(sal*10/(100))));
    }  
    else if(sal>20000 && sal<=30000){
        System.out.println("SALARY= " + (sal -(sal*15/(100))));
    }  
    else{
        System.out.println("SALARY= " + (sal -(sal*25/(100))));
    }   
    }
    
}