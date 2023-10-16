import java.util.Scanner;

public class Digitsum {
     public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any digit");
    int dig=sc.nextInt();
    int n=0;
    int sum=0;
    while(dig>0){
        n=dig % 10;
        sum  = sum + n;
        dig=dig/10;
         }
         System.out.println("SUM: "+ sum);
}
}