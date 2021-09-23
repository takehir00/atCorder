package contest.BeginnerContest216;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class B {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        // 人数
        int N = Integer.parseInt(stdin.nextLine());
        Set<String> fullName = new HashSet<>();
        boolean sameNameFlg = false;

        for (int i = 0; i < N; i++) {
            if (!fullName.add(stdin.nextLine())) {
                sameNameFlg = true;
                break;
            }
        }

        if (sameNameFlg) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}
