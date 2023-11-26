/*Given an array a of non- negative Integers, and a integer x, you have to select x numbers from this array such that sum of these x numbers is minimum. */

import java.util.Arrays;
import java.util.Scanner;

public class Lowestsum {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int[]a=new int [n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int minsum=0;
        for(int i=0;i<x;i++){
            minsum+=a[i];
        }
        System.out.println(minsum);
}
}
