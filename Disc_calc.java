import java.util.Scanner;

public class Disc_calc {
      public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Amount");
    float amo=sc.nextInt();
    if(amo<=1000 && amo<=5000){
        System.out.println("AMOUNT= " + (amo*05/(100)));
    } 
    else if(amo>5000 && amo<=10000){
        System.out.println("AMOUNT= " + (amo*10/(100)));
    }  
    else if(amo>10000 && amo<=20000){
        System.out.println("AMOUNT= " + (amo*15/(100)));
    }  
    else{
        System.out.println("AMOUNT= " + (amo*25/(100)));
    }   
    }
}