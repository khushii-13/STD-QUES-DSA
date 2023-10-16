import java.util.*;

public class Leapyear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE YEAR");
        int year=sc.nextInt();
        if(year%4==0 && year%100!=0 || year%400==0 ){
            System.out.println("IT IS A LEAP YEAR");
        }
        else{
            System.out.println("IT IS NOT A LEAP YEAR");
        }
}
}