import java.util.*;

public class Rhombus{
    public static void main(String args[]) {
     Scanner sc=new Scanner (System.in);
     System.out.print("Enter n :");
     
     int n = sc.nextInt();
     for(int i=0;i<n;i++){
         for(int j=i;j<n-1;j++){
             System.out.print(" ");
         }
         for(int k=0;k<n;k++){
             
             System.out.print("*");
            
         }
         System.out.println();
     }
       
     
    }
}