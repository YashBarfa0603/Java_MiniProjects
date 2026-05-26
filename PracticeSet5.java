public class PracticeSet5 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        int e = 4;
        int sum = 0;
        int i = 0;
        while (i < e) {
            sum = sum + (2 * i);
            i++;
        }
        System.out.println(sum);

//        int d = 5;
//        for (int j=1;j<=10;j++) {
//            System.out.printf("%d x %d = %d\n", d, j, d * j);
//
//        }
        int c = 10;
            for (int l=10;l>=0;l--){
                System.out.printf("%d x %d = %d\n", c, l , c*l);
            }
            int h = 3;
            int factorial = 1;
            for (int v=1;v<=h;v++){
                factorial *=v;
            }
        System.out.println(factorial);

            int x = 1;
            while(x<=5){
                System.out.println(5);
                x++;
            }
            int b =1;
            for (int t=0;t<5;t++){
                System.out.println(1);
            }

            int u = 8;
            int Sum = 0;
            for (int o=1;o<=10;o++){
                Sum = Sum + (u*o);
            }
        System.out.println(Sum);
    }
}
