/*Your friend Bob is standing in a line of N students and he got bored, so he called you and gave you a puzzle. He told you that there are no less than x students standing in front of him and no more than y students standing behind him. He asked you to find the number of different positions he could be standing in, on the basis of this information. */

import java.util.Scanner;

public class QueueChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input N, x, and y
        int N = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        // Calculate the number of different positions
        int positions = calculatePositions(N, x, y);

        // Output the result
        System.out.println(positions);

        // Close the scanner
        scanner.close();
    }

    public static int calculatePositions(int N, int x, int y) {
        // Calculate the number of different positions
        int positions = N - Math.max(x + 1, N - y) + 1;

        return positions;
    }
}
