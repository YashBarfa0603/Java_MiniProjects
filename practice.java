import java.util.Scanner;

/**
 * This class is to demonstrate what javadocs is
 * This is <i>italic</i> word<p>Hello Guysss</p>
 * @author YASH Barfa
 * @since 2006
 * 
 */

public class practice {
    public static void main(String[] args) {
        System.out.println("taking input from user: ");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int num = sc.nextInt();
            System.out.println("You entered an integer:  " + num);
        } else {
            System.out.println("This is not an integer");
        }

        char grade = 'A';
        System.out.println("Original grade: " + grade);
        // encrypt
        char encrptedGrade = (char) (grade + 8);
        System.out.println("Encrypted Grade:  " + encrptedGrade);

        char decryptedGrade = (char) (encrptedGrade - 8);
        System.out.println("Decrypted Grade: " + decryptedGrade);

        String letter = "Dear <name>, Pass the ball";
        letter = letter.replace("<name>", "Yash");
        System.out.println(letter);


        Scanner cs = new Scanner(System.in);
        System.out.println("Enter your Income in Lakhs per annum:  ");
        float tax = 0;
        float income = cs.nextFloat();
        if (income > 2.5f && income <= 5f) {
            tax = tax + 0.05f * (income * 2.5f);
        }
        if (income > 5f && income <= 10f) {
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (income - 5f);
        }
        if (income > 10f) {
            tax = tax + 0.05f * (10f - 2.5f);
            tax = tax + 0.2f * (10f - 5f);
            tax = tax + 0.3f * (income - 10f);
        }
        System.out.println("Total Tax paid by Person is:  " + tax);

        int n = 4;
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        int a = 9;
        for (int l = 1; l <= 10; l++) {
            System.out.printf("%d X %d = %d\n", a, l, a * l);
        }

        int[] arr = {5, 56, 4, 40, 440};
        int ass = 40;

        boolean found = false;
        for (int g = 0; g < arr.length; g++) {
            if (arr[g] == ass) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Is present in array"+ass);
        }
        else {
            System.out.println("Is not present in array" +ass);
        }


    }
}
