import java.util.Scanner;

class xor{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int a = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int b = sc.nextInt();

        if ((a^b)==0) {
            System.out.println("Same Number");
        }
        else{
            System.out.println("Different Number");
        }
    }
}