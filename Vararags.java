public class Vararags {
    static int sum(int ...arr){
        int result = 0;
        for(int a: arr){
            result += a;
       }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Welcome ");
        System.out.println("The sum of 69 and 96 is: " + sum(69, 96));

    }
}
