public class PracticeSet7 {
    static void multiplication(int n){
        for (int i = 1; i <=10; i++){
            System.out.printf("%d x %d = %d\n", n,i,n*i);
        }
    }
    static void pattern1(int n){
        for(int i = n; i>=1; i--){
            for(int j = 1; j<= i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static int sumRect(int n){
        if(n==1){
            return 1;
        }
        return n + sumRect(n-1);
    }
    static void pattern2(int n){
        int i;
        int j;
        for (i = 0; i<n; i++){
            for (j = 0; j>i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static int fib(int n){
        if (n==1){
            return 0;
        }
        else if (n==2){
            return 1;
        }
        else {
            return fib(n-1) + fib(n-2);
        }
    }
    static float average(float ...arr){
        float result = 0;
        for(float a: arr){
            result = result + a;
        }
        return (result/arr.length);
    }
    static void rep(int n ){
        if (n > 0) {
            rep (n-1);
            for (int i = 0; i<n; i++){
                System.out.print("4");
            }
            System.out.println();
        }
    }
    static float con(float n){
        float temp = (n * 1.8f) + 32;
        return temp;
    }

    public static void main(String[] args) {
        //1
        multiplication(9);

        //2

        pattern1(7);
        //3
        int c = sumRect(4);
        System.out.println(c);


        //4
        pattern2(5);

        //5
         //fibonacciii series - 0,1,1,2,3,5,8,13,21
        int result = fib(5);
        System.out.println(result);

        //6
        System.out.println("Welcome ");
        System.out.println("The average of 69 and 96 is: " + average(69, 96));

        //7
        rep(9);

        //9
        System.out.println(con(6969f));
    }
}
