package contest.beiginnerContest219;

import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);

        int x = std.nextInt();

        if (0<=x && x<40) {
            System.out.print(40-x);
        } else if (40<=x && x<70) {
            System.out.print(70-x);
        } else if (70<=x && x<90) {
            System.out.print(90-x);
        } else if (90<=x) {
            System.out.print("expert");
        }
    }
}
