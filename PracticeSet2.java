
import java.util.Scanner;

public class PracticeSet2 {
    public static void main(String[] args) {
//        int a = 6;
//        int b = 2;
//        int m = (a-b)/2;
//        System.out.println(m);
//
//        int c = 45;
//        int d = 4;
//        int e = 5;
//        int g = (d*d-4*c*e)/(2*c);
//        System.out.println(g);
//
//        int y = 7;
//        int x = ++y*8;
//        System.out.println(x);
//
//        char h = 'B';
//        System.out.println(++h);


        // Practice Questions;

        float a = 7/4.0f * 9/2.0f;
        System.out.println(a);

        char grade = 'B';
        grade = (char)(grade + 8);
        System.out.println(grade);

        // decrypting the grade
        grade = (char)(grade - 8);
        System.out.println(grade);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr a number; ");
        int p = sc.nextInt();
        System.out.println(p>8);

        float v = 40;
        float u = 4;
        float s = 8;
        float t = 6;
        float k = (v*v - u*u)/(2*t*s);
        System.out.println(k);

        int x = 7;
        int d = 7*49/7+35/7;
        System.out.println(d);
    }
}
