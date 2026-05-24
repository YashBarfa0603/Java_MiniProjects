import java.util.Scanner;

public class Calculator_OG {
   public static void main() {
        Scanner sc = new Scanner(System.in);
        int ans = 0;

        while (true) {
            System.out.print("Enter the Operator: ");
            char op = sc.next().trim().charAt(0);
            System.out.println();
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.println("Enter the value of Two Number: ");
                System.out.print("Num1: ");
                int num1 = sc.nextInt();
                System.out.print("Num2: ");
                int num2 = sc.nextInt();
                System.out.println();
                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/') {
                    ans = num1 / num2;
                }
                if (op == '%') {
                    ans = num1 % num2;
                }
            } else if (op == 'x' || op == 'X') {
                break;
            } else {
                System.out.println("Invalid Operation!");
            }
            System.out.println(ans);
        }
    }
}
