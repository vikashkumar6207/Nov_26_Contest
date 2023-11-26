import java.util.Scanner;

public class Evensubstrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        System.out.println(solve(S));
    }
    public static int solve(String S) {
        int[] digitCount = new int[10];
        for (char digit : S.toCharArray()) {
            digitCount[digit - '0']++;
        }
        int evenSubstrings = 0;

        evenSubstrings += digitCount[2] + digitCount[4] + digitCount[6] + digitCount[8];

        evenSubstrings += Math.max(digitCount[1], digitCount[2]) +
                          Math.max(digitCount[3], digitCount[4]) +
                          Math.max(digitCount[5], digitCount[6]) +
                          Math.max(digitCount[7], digitCount[8]);

        return evenSubstrings;
    }

//     public long solve(String S) {

//         char[] ch = new char[S.length()];
//         char []arr = new char[S.length()];

//        for (int i = 0; i < S.length(); i++) {
//            ch[i] = S.charAt(i);
//        }
//        int x=0;
//        for (int i = 0; i < S.length(); i++) {
//            if(ch[i] %2!=0){
//                arr[x] = ch[i];
//                x++;
//            }
//        }

//        for (int i = 0; i < S.length(); i++) {
//            if(ch[i]%2==0){
//                arr[x] = ch[i];
//                x++;
//            }
//        }
       
//        String string = new String(arr);  
//        // System.out.println(string);
//        int len = string.length();
//        int count = 0;
    
//        for (int i = 0; i < len; i++)
//        {
//            int temp = string.charAt(i) - '0';
    
//            if (temp % 2 == 0)
//                count += (i + 1);
//        }
    
//        return count;
      
//    }
}
