import java.util.Arrays;
import java.util.Scanner;
/*Given an array of non-negative Integers, you have to find the difference between the maximum number and median of the array.

Note: The median of an array is the middle element of a sorted array and length of array is odd. */
public class FindDifference {
     public static void main (String[] args) {
        // Your code here
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        // for(int i=0;i<n;i++){
        //     System.out.print(arr[i]+" ");
        // }
        // System.out.println();
        int max = 0;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        //  System.out.println(max);
        
        Arrays.sort(arr);

        int N = arr.length;

        int middle = N/2;

        int median;

        if(N%2==1){
            median = arr[middle];
        }else {
            median = (int) (arr[middle - 1] + arr[middle]) / 2;
        }

        System.out.println(max-median);
    }
}
