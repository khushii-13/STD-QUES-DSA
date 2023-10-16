import java.util.Scanner;

public class Greater{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any value");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int great = ( a > ( b > c ? b : c ) ? a : ( b > c ? b : c ) ) ;
        System.out.println("greater number is: "+ great);

    }
}