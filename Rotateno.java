import java.util.*;

public class Rotateno {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.println("ENTER N:");
      int n =  sc.nextInt();
      int no=n;
      System.out.println("ENTER R:");
      int r= sc.nextInt();
  

      int sz=0;
      
      while(n>0){
        sz++;
        n/=10;
      }
   
  
      r= r%sz;

      int   rpow=1;
      int rs = sz-r; 
      if(r>=0){
        rpow=1;
        while(r>0){
            rpow*=10;
            r--;
        }
        int npo=1;
        while(rs>0){
          npo*=10;
          rs--;
        }
        System.out.println(no%rpow*npo + no/rpow);
        
      }
      
   
    }
}