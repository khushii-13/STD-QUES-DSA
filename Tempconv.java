import java.util.Scanner;

public class Tempconv {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Celsius");
        int c=sc.nextInt();
        System.out.println("Celsius: "+c);
        float f= c*(9/5)+32;
        System.out.println("Fahrenhiet: "+f);
    }
}