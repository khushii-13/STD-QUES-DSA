import java.util.*;

public class Hollowrec {
    public static void main(String args[]) {
     Scanner sc=new Scanner (System.in);
     System.out.print("Enter n :");
     int n = sc.nextInt();
     for(int i=0;i<n;i++){
         System.out.print("*");
     }
     System.out.println();
    
    for(int i=0;i<n-2;i++){
        for(int j =0;j<n;j++){
            if(j==0 || j==n-1){
                System.out.print("*");
            }
            else 
            System.out.print(" ");
        }
        System.out.println();
    }
   
    for(int i=0;i<n;i++){
         System.out.print("*");
     }
     System.out.println();

       
     
    }
}