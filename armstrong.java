import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a ArmStrong number: ");
        int x = sc.nextInt();
        int ans = 0;
        int original = x;
        while(x>0){
            int digit = x % 10;
            digit = digit * digit * digit;
            ans = ans + digit;
            x = x / 10;

        }
        if (ans == original) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong Number");
        }
        System.out.println(ans);
    }
}
