/*Yash has a class test. There's a question that is worth X points. Yash finds that the question has 10 test cases for it. It is given that, every test case carries the same number of points. N of the test cases are passed by Yash. Find the marks he will get. */

import java.util.Scanner;

public class YashsMarks {
    public static void main (String[] args) {
Scanner sc=new Scanner(System.in) ;
int T=sc.nextInt();
for(int t=0;t<T;t++) {
    int X=sc.nextInt();
    int N=sc.nextInt();
int marks = (X / 10) * N;
System.out.println(marks);
} 
sc.close();     
    }
}
