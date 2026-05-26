import java.util.Scanner;

class MaxRetriesException extends Exception{
    @Override
    public String getMessage(){
        return "Error";
    }
}

public class PracticeSet14 {
    public static void main(String[] args) {
        //Question 1
       // --> Syntax error int a = 9
        int age = 78;
        int year_born = 2000-78; // logical error
        // System.out.println(6/0); runtime error

        //Question 2
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b: ");
        int b = sc.nextInt();


         try{
             int c = a/b;
             System.out.println(c);
         }
         catch (IllegalArgumentException e){
             System.out.println("HeHe");
         }
         catch (ArithmeticException e){
             System.out.println("HaHa");
         }
         //Question 3
        boolean flag = true;
         int [] marks = new int[4];
         marks[0] = 45;
         marks[1] = 12;
         marks[2] = 4;
         marks[3] = 6;
         Scanner Sc = new Scanner(System.in);
         int index;
         int i = 0;
         while (flag && i < 5){
             try {
                 System.out.println("Enter the value of index: ");
                 index = Sc.nextInt();
                 System.out.println("The value of marks[index] is" + marks[index]);
                 break;
             }
             catch (Exception e){
                 System.out.println("Invalid index");
                 i++;
             }
         }
         if(i>=5){
             System.out.println("ERROR");
             try{
                 throw new MaxRetriesException();
             }
             catch(Exception e){
                 System.out.println("\n"+e.getMessage());
             }
         }
    }
}
