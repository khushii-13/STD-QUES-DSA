import java.util.Scanner;

public class Vowel_conso {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter Any character");
        char ch=sc.next().charAt(0);
        if(ch=='A' || ch=='a' || ch=='E' || ch=='e' || ch=='I' || ch=='i' || ch=='O' || ch=='o' || ch=='U' || ch=='u'){
           System.out.println("It is a Vowel: "+ ch); 
        }
        else{
            System.out.println("It is a Consonent: "+ ch);
        }
    }
}