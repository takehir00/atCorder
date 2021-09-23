package contest.BeginnerContest216;

import java.util.Scanner;
import java.util.regex.Pattern;

public class A {


    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        String input = stdin.next();
        String[] list = input.split(Pattern.quote("."));

        int x = Integer.parseInt(list[0]);
        int y = Integer.parseInt(list[1]);


        if (0 <= y && y <= 2) {
            System.out.print(x + "-");
        } else if (3 <= y && y <= 6) {
            System.out.print(x);
        } else if (7 <= y && y <= 9) {
            System.out.print(x + "+");
        }
    }
}
