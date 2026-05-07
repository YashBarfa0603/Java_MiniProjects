
import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.println("Enter your income in Lakhs per annum");
        float tax = 0;
        float income = cs.nextFloat();
        if(income>2.5f && income <= 5f) {
            tax = tax + 0.05f * (income - 2.5f);
        }
        if(income>5f && income <=10f){
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (income - 5f);
        }
        if(income>10f){
            tax = tax + 0.05f * (10f - 2.5f);
            tax = tax + 0.2f * ( 10f - 5f);
            tax = tax + 0.3f * (income - 10f);
        }
        System.out.println("The total tax paid by Employee is: " +tax);
    }
}
