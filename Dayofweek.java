import java.util.Scanner;

public class Dayofweek {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your day: ");
        int day=sc.nextInt();
        int choice =(day % 7);
        switch(choice){
            case 0: {
                System.out.println("SUNDAY:");
                System.out.println("WEEKEND:");
                break;
            }
            case 1: {
                System.out.println("MONDAY:");
                System.out.println("WEEKDAY");
                break;
            }
            case 2: {
                System.out.println("TUESDAY:");
                System.out.println("WEEKDAY");
                break;
            }
            case 3: {
                System.out.println("WEDNESDAY:");
                System.out.println("WEEKDAY");
                break;
            }
            case 4: {
                System.out.println("THURSDAY:");
                System.out.println("WEEKDAY");
                break;
            }
            case 5: {
                System.out.println("FRIDAY:");
                System.out.println("WEEKEND");
                break;
            }
            case 6: {
                System.out.println("SATURDAY:");
                System.out.println("WEEKEND");
                break;
            }
        }
    }
}