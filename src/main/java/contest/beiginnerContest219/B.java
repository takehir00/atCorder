package contest.beiginnerContest219;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B {

    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);

        List<String> stringList = new ArrayList<>();
        stringList.add(std.next());
        stringList.add(std.next());
        stringList.add(std.next());

        String t = std.next();
        StringBuilder sb = new StringBuilder();
        for (String index: t.split("")) {
            sb.append(stringList.get(Integer.parseInt(index)-1));
        }
        System.out.print(sb.toString());
    }
}
