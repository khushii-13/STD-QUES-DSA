import java.util.Scanner;

public class Factorial {
     public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any digit");
    int dig=sc.nextInt();
    int sum=1;
    while(dig>0){
        sum  = sum * dig;
        dig--;
         }
         System.out.println("FACT: "+ sum);
}
}