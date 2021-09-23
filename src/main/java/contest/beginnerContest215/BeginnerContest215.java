package contest.beginnerContest215;

import java.util.Scanner;

public class BeginnerContest215 {


    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        long N = stdin.nextLong();
        int K = 0;

        while(true) {
            // powの返り値double型は正確な比較演算ができないのでlongにキャストする
            if ((long)Math.pow(2,K) > N) {
                K-=1;
                break;
            }
            K+=1;
        }
        System.out.println(K);
    }
}
