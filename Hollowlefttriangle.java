
import java.util.Scanner;

public class Hollowlefttriangle {

	public static void main(String[] args){
		      Scanner sc = new Scanner(System.in);
		      int n =  sc.nextInt(),m=1;
		      
		    
		            //   System.out.print("*");
					for(int i=n;i>=1;i--)  
					{  
						for(int j=1;j<=i-1;j++)  
						{  
						  System.out.print(" ");
						}  
						for(int k=1;k<=m;k++)  
						{  
						   if(k==1 || k==m || m==n)  
							System.out.print("*");
							else  
							System.out.print(" ");
						}  
					System.out.println();
						m++;  
					}  
				
				}  

	}

