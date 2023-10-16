import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter intial ammount");
        int a=sc.nextInt();
        System.out.println("1: DEPOSITE");
        System.out.println("2: WITHDROW");
        System.out.println("3: BALANCE");
        int choice=sc.nextInt();
        switch(choice){
            case 1: {
                System.out.println("ENter deposite ammount");
                int b=sc.nextInt();
                a=a+b;
                System.out.println("Final ammount: "+a);
                break;
            }
            case 2: {
                System.out.println("ENter withdrow ammount");
                int c=sc.nextInt();
                if(c<a){
                a=a-c;
                System.out.println("Final ammount: "+a);}
                else{
                    System.out.println("You do not exceed from your balnce ammount");
                }
                break;
            }
            case 3: {
                System.out.println("Your balnce: "+a);
                break;
            }
        }
        

    }
}