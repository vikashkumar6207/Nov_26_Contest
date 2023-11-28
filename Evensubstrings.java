import java.util.Scanner;

public class Evensubstrings {
    // public static void main(String[] args) {
    //     Scanner scanner = new Scanner(System.in);
    //     String S = scanner.nextLine();
    //     System.out.println(solve(S));
    // }
    // public static int solve(String S) {
    //     int[] digitCount = new int[10];
    //     for (char digit : S.toCharArray()) {
    //         digitCount[digit - '0']++;
    //     }
    //     int evenSubstrings = 0;

    //     evenSubstrings += digitCount[2] + digitCount[4] + digitCount[6] + digitCount[8];

    //     evenSubstrings += Math.max(digitCount[1], digitCount[2]) +
    //                       Math.max(digitCount[3], digitCount[4]) +
    //                       Math.max(digitCount[5], digitCount[6]) +
    //                       Math.max(digitCount[7], digitCount[8]);

    //     return evenSubstrings;
    // }



        public static long evenString(String S){
            int n = S.length();
            int even = 0;
            for(int i = 0;i < n;i++){
                int val = S.charAt(i)-'0';
                if(val%2 == 0){
                    even++;
                }
            }
            int count = 0;
            for(int i = 0;i < even;i++){
                count  = count + (n -i);
            }
            return count;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        
        System.out.println(evenString(S));
        

    }
}
