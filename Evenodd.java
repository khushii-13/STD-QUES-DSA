import java.util.Scanner;

public class Evenodd {
      public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the range");
    int range=sc.nextInt();
    for(int i=1;i<=range;i++){
        if(i%2==0){
            System.out.println("EVEN: "+ i);
        }
        else{
            System.out.println("ODD: "+ i);
        }
       }
    }
}