import java.util.Scanner;

public class practiceDSA {
    public static void main() {
        Scanner sc = new Scanner(System.in);

      /*  System.out.print("Enter Your name: ");
        String name = sc.nextLine();

        if(name.isEmpty()){
            System.out.println("Sorry");
        }
        else {
            System.out.println("Hello "+ name);
        }

        System.out.print("Enter Your Salary: ");
        int a = sc.nextInt();
        int bonus;

        if (a>10000){
            bonus = 2000;
        } else if (a>20000) {
            bonus = 3000;
        } else if (a>30000) {
            bonus = 4000;
        } else{
            bonus = 1000;
        }

        int Total_Salary = bonus + a;

        System.out.println("Your Salary is: " +Total_Salary);

        System.out.print("Enter a number: ");
        int p = sc.nextInt();

        if (p <= 1) {
            System.out.println("Not Prime Number");
        } else {
            int i;
            for (i = 2; i * i <= p; i++) {
                if (p % i == 0) {
                    System.out.println("Not Prime Number");
                    break;
                }
            }
            if (i * i > p) {
                System.out.println("Prime Number");
            }
        }
        int u = 'A';
        System.out.println(u);

        System.out.print("Enter an Number: ");
        int g = sc.nextInt();
        for (int i = 1; i <=g; i++){
          //  System.out.println(i);
            System.out.println("Hello World");
        }

        System.out.print("Enter an number: ");
        int k = sc.nextInt();
        int l = 1;
        while(l<=k){
            System.out.println(l);
            l++;
        }

        System.out.print("Enter value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter value of b: ");
        int b = sc.nextInt();
        System.out.print("Enter value of c: ");
        int c = sc.nextInt();

        int max = a;
        if (b>max){
            System.out.println(b);
        } else if (c>max) {
            System.out.println(c);
        }
        else {
            System.out.println(a);
        }
        System.out.println("Enter an Char: ");
        char ch = sc.next().trim().charAt(0);
        if (ch>= 'a' && ch<= 'z'){
            System.out.println("Lower Case");
        }
        else {
            System.out.println("Upper Case");
        }
        System.out.println(ch);



        int l = sc.nextInt();

        int o = 0;
        int e = 1;

        System.out.print("Enter value: ");
        for (int g = 1; g <= l; g++) {
            System.out.println(o + " ");
            int fibo = o + e;
            o = e;
            e = fibo;

        }
          */


      int num = sc.nextInt();
      int ans = 0;
      while (num >0){
          int rem = num % 10;
          num /= 10;
          ans = ans * 10 +rem;
      }
        System.out.println(ans);
    }
}

