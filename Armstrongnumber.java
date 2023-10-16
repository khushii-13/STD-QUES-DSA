import java.util.Scanner;

public class Armstrongnumber {
    void armstong() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = 0;
        int no = n;
        while (n > 0) {
            int r = n % 10;
            s += (r * r * r);
            n /= 10;
        }
        if (s == no)
            System.out.println("YES ");
        else
            System.out.println("No");

    }

    public static void main(String[] args) {
        Armstrongnumber obj = new Armstrongnumber();
        obj.armstong();

    }

}
