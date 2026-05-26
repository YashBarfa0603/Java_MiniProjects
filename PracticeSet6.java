import java.io.StringReader;

public class PracticeSet6 {
    public static void main(String[] args) {

        //Question 1
        float [] marks = {10.0f,28.8f,23.5f,65.4f,8.7f};
        float sum = 0;
        for (float element:marks){
            sum = sum+element;
        }
        System.out.println("The value of sum is: "+sum);

        //Question 2
        int [] value = {12,45,75,35,79};
        int num = 12;
        boolean isInArray = false;
        for (int gian:value) {
            if (num == gian) {
                isInArray = true;
                break;
            }
        }
        if(isInArray) {
                 System.out.println("The value is present in array");
        }
        else {
                 System.out.println("Not present in array");
        }

        //Question3
        float [] result = {98,96,95,94,93,};
        float total = 0;
        for (float jerry:result){
            total = total + jerry;
        }
        System.out.println("The value of average marks is "+total/ marks.length);

        //Question4
        int [] [] mat1 = {{1,34,54},
                          {12,34,65}};
        int[] [] mat2 = {{34,78,78},
                         {89,57,90}};
        int[] [] resu = {{0,0,0},
                         {0,0,0,}};
        for (int i=0; i< mat1.length; i++) { //for row number of  line
            for (int j = 0; j < mat1[i].length; j++) {// for columns number of times
                System.out.format(" Setting value for i=%d and j=%d\n", i, j);
                resu[i][j] = mat1[i][j] = mat2[i][j];
            }
        }
        int [] array = {23,45,87,98,67};
        for (int k = array.length-1;k>=0;k--){
            System.out.println(array[k]);
        }
        //question 6
        int [] arr ={1,5,8,4,8};
        int max = 0;
        for (int e: arr){
            if (e>max){
                max = e;
            }
        }
        System.out.println("The maximum value of array is: "+max);

        //Question7
        int [] gojo = {54,76,87,43,36};
        int min = Integer.MAX_VALUE;
        for (int h: gojo){
            if (h<min){
                min = h;
            }
        }
        System.out.println("The minimum value of array is: "+min);

        //question8


    }
}
