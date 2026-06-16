import java.util.Arrays;

public class ArraySwap {
    //swap an array using function
    static void  swap (int [] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    // maximum value in an array
    static int arrRange(int[] arr){
        int max = arr[0];
        for (int i = 0; i< arr.length; i++){
            if(arr[i] >max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int [ ] arr = {1, 5, 89, 45};
        swap(arr,0,2);
        System.out.println(Arrays.toString(arr));
        System.out.println(arrRange(arr));

        int start = 0;
        int end = arr.length - 1;
        while(start < end ){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start ++;
            end --;
        }
        System.out.println(Arrays.toString(arr));
    }
}
