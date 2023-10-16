import java.util.Scanner;

public class PlusStarpattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    int n;
    System.out.println("ENTER AN ODD NUMBER ");
    n=sc.nextInt();
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        if(i==n/2 || j==n/2)
        System.out.print("+");
        else
        System.out.print(" ");
      }
      System.out.println();
    }
}
}