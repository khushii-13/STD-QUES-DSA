import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first value");
        int a=sc.nextInt();
         System.out.println("Enter second value");
        int b=sc.nextInt();
        int temp=a;
        a=b;
        b=temp;
        // a=a+b;
        // b=a-b;
        // a=a-b;
        System.out.println("first: "+a);
        System.out.println("Second: "+b);
    }
    
}