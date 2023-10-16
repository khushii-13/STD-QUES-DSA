import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any digit");
        int dig=sc.nextInt();
        int count=0;
        for(int i=1;i<=dig;i++){
            if(dig%i==0){
                count++;
               
             }
           }
        
            if(count==2){
             System.out.println("PRIME NUMBER ");
             }
             else{
                System.out.println("IT IS NOT PRIME ");
             }
            }
}