package contest.BeginnerContest216;

import java.util.Scanner;

public class C {

    /**
     * ボールを一個増やす
     * @return
     */
    static int funcA(int ballAmount) {
        System.out.print("A");
        return ballAmount + 1;
    }

    /**
     * ボールを２倍にする
     * @param ballAmount
     * @return
     */
    static  int funcB(int ballAmount) {
        System.out.print("B");
        return ballAmount * 2;
    }


    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        // したいボールの個数
        int N = stdin.nextInt();

        // ボールの個数
        int ballAmount = 0;

        // 魔法を使った回数
        int magicCont = 0;

        int j = 0;
        int k = 0;
        do {
            j = N % 2;
            k = N / 2;
        } while (k <= 0);

        // 奇数か偶数かみたいなところ、120回以内(ある回数である数字だった場合には、魔法Bしか使えないとか)
        ballAmount = funcA(ballAmount);

        ballAmount = funcB(ballAmount);

        System.out.print((long)(Math.pow(10,18)));
    }
}
