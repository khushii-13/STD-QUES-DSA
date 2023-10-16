import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any digit");
        int dig=sc.nextInt();
        int n1=0,n2=1,n3,i;    
        System.out.print(n1+" "+n2);   
           
        for(i=2;i<dig;++i)    
        {    
         n3=n1+n2;    
         System.out.print(" "+n3);    
         n1=n2;    
         n2=n3;    
        }   
}
}