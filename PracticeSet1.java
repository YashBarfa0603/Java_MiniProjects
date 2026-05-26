
import java.util.Scanner;

public class PracticeSet1 {
    public static void main(String[] args) {
        //1.Sum of three number
        int a =78;
        int b =89;
        int c =67;
        int sum =a+b+c;
        System.out.println("Sum of Three number is");
        System.out.println(sum);

        //2.Input from user
        System.out.println("Enter Your Name");
        Scanner sc = new Scanner(System.in);
        String Name = sc.next();
        System.out.println("Hello " + Name + " Have a good day" );

        //3.Kilometer to miles
        System.out.println("Enter distance in Kilometers");
        double j = sc.nextDouble();
        double k = j*0.621371;
        System.out.println("Distace in Miles");
        System.out.println(k);

        //4.detect integer or not
        System.out.println("Enetr your number");
        Scanner bc = new Scanner(System.in);
        System.out.println(bc.hasNextFloat());
    }
}
