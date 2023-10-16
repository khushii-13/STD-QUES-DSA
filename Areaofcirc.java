import java.util.Scanner;

public class Areaofcirc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius value");
        int r=sc.nextInt();
        System.out.println("Area of circle  "+(((3.14*r*r))%10000007));
    }
}