package contest.beiginnerContest219;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C {



    /**
     * 順番を入れ替える
     *
     * @param nameList
     * @param s1
     * @param s2
     */
    static void swap(String[] nameList, String s1, String s2) {

    }

    static int getNeOrderIndex(String newOrderX, String ele) {
        String[] newOrderXList = newOrderX.split("");

        for (int i = 0; i < newOrderXList.length; i++) {
            if (newOrderXList[i].equals(ele)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 比較する
     * @return targetが大きかったらtrue
     */
    static boolean compare(String newOrderX, String target, String comparison) {
        // 文字数が少ない方の文字数までループが回ったら文字数が少ない方が小さいという判定

        // 文字数が全く同じで文字も全部同じだったらtrue
        if (target.equals(comparison)) {
            return true;
        }
        String[] targetList = target.split("");
        String[] comparisonList = comparison.split("");

        int targetIndex = 0;
        int comparisonIndex = 0;
        for (int i = 0; i < targetList.length; i++) {
            targetIndex = getNeOrderIndex(newOrderX,targetList[i]);
            comparisonIndex = getNeOrderIndex(newOrderX,comparisonList[i]);
        }
        if (targetIndex > comparisonIndex) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        //新しいアルファベットの順番
        String newOrderX = std.next();

        // 国民の数
        int peopleCountN = std.nextInt();

        String[] nameList = new String[peopleCountN];

        for (int i = 0; i < peopleCountN; i++) {
            if (i==0) {
                nameList[i] = std.next();
            } else {
                String target = nameList[i-1];
                String comparison = std.next();

                if (compare(newOrderX, target, comparison)) {
                    // 比較対象が大きかったらそのまま入れる
                    nameList[i] = comparison;
                } else {
                    // もし比較対象が小さかったら入れ替える
                    nameList[i] = target;
                    nameList[i-1] = comparison;
                }
            }
        }

        for (String name: nameList) {
            System.out.println(name);
        }

        //入力のあった文字列をソートする

        // 入力のあった文字列が、新文字列の何番目にあるかを取得する。
        // 次の文字列の一番頭の文字が新文字列の何番目かを取得する
        // 何番目かを比較して、次の文字列が小さかったら一つ手前に入れ直す。大きかったらそのまま。
        // 同じ文字列だった場合は次の文字を比較する
    }
}
