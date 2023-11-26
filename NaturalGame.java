/*Your friend got bored with natural numbers so he decided to play around with the first N of those. He rearranged them in the following manner. Firstly, he writes all odd integers from 1 to N in ascending order and then he writes all even integers from 1 to N in ascending order after them. Now, he asks you to find the Kth integer in this sequence. Help your friend find the answer. */

import java.util.Scanner;

public class NaturalGame {
   public static void main (String[] args) {
        // Your code here
        Scanner S = new Scanner(System.in);
        long n = S.nextLong();
        long k = S.nextLong();
        long oddNoCount = (n + 1) / 2;
        if (k <= oddNoCount) { //odd
            System.out.println((2 * k) - 1);
        } else { //eve
            k = k - oddNoCount;
            System.out.println(2 * k);
        }
    } 
}
