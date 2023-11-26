/*Toros went to the supermarket to buy K items. There were a total of N items. Each item had a distinct price Pi. He is cost-effective, so he would buy the K cheapest item. But he knows that the more cheaper an item is, the more is the chances that it can be defective. So he planned to ignore 2 cheapest items and buy K from the remaining ones.
Find the total cost of all items that he would buy. */
import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        long f = 0;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        quickSort(arr, 0, n - 1);
        for (int i = 2; i < k + 2; i++)
            f += arr[i];
        System.out.print(f);

    }

    public static int partitionIndex(int[] arr, int pivot, int l, int r) {
        int i = l;
        int j = l;
        while (i <= r) {
            if (arr[i] <= pivot) {
                swap(arr, i, j);
                i++;
                j++;
            } else {
                i++;
            }
        }
        return j - 1;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void quickSort(int[] arr, int l, int r) {
        if (l >= r)
            return;
        int pivot = arr[r];
        int pi = partitionIndex(arr, pivot, l, r);
        quickSort(arr, l, pi - 1);
        quickSort(arr, pi + 1, r);
    }
}
