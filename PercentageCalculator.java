
import java.util.Scanner;

public class PercentageCalculator {
    public static void main(String[] args) {
        //PERCENTAGE CALCULATOR
        System.out.println("Hello Guys!!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your First subject marks;  ");
        int a = sc.nextInt();
        System.out.println("Enter your Second subject marks;  ");
        int b = sc.nextInt();
        System.out.println("Enter your Third subject marks;  ");
        int c = sc.nextInt();
        System.out.println("Enter your Fourth subject marks;  ");
        int d = sc.nextInt();
        System.out.println("Enter your Fifth subject marks;  ");
        int e = sc.nextInt();
        float percentage = ((a+b+c+d+e)/500.0f)*100;
        System.out.println("Your Percentage is");
        System.out.println(percentage);
    }
}
