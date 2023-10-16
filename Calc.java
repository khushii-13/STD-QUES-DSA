import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Two number for calculation");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("1:ADDITION ");
        System.out.println("2:SUBSTRACTION ");
        System.out.println("3:MULTIPLICTION ");
        System.out.println("4:DIVISION ");
        int choice=sc.nextInt();
        switch(choice){
            case 1:{
                System.out.println("ADDTION: "+ (a+b));
                break;
            }
            case 2:{
                System.out.println("SUBSTRACTION: "+ (a-b));
                break;
            }
            case 3:{
                System.out.println("MULTIPLICTION: "+ (a*b));
                break;
            }
            case 4:{
                System.out.println("DIVISION: "+ (a/b));
                break;
            }
            default :{
                System.out.println("Wrong choice");
            }
        }
    }
}