import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.Comparator.reverseOrder;

public class Main {
    public static void main(String[] args) throws IOException {
        Pets pet1 = new Pets();
        pet1.type = "golira";
        pet1.name = "taro";
        Pets pet2 = new Pets();
        pet2.type = "golira";
        pet2.name = "taro";

        if (pet1.equals(pet2)) {
            System.out.println("中身が一緒ならtrue");
        } else {
            System.out.println("いや参照値で比較だよ");

        }
    }


}

