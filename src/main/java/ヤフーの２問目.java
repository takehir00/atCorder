import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class ヤフーの２問目 {
//    InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
//    BufferedReader in = new BufferedReader(reader);
//    String line;
//    int DCount = 5;
//    HashMap<String, Integer> regionCountMap = new HashMap<>();
//
//        while ((line = in.readLine()) != null) {
//        String[] regionSplitList = line.split("|.");
//        StringBuilder sb = new StringBuilder();
//
//        for (int i=0; i < DCount; i++) {
//            String regionSplitElement = regionSplitList[i];
//            sb.append(regionSplitElement);
//            sb.append(".");
//        }
//        String target = sb.deleteCharAt(sb.length()).toString();
//        if (regionCountMap.get(target) == null) {
//            regionCountMap.put(target, 0);
//        } else {
//            Integer newCount = regionCountMap.get(target) + 1;
//            regionCountMap.put(target, newCount);
//        }
//    }
//
//        regionCountMap.entrySet().stream()
//                .sorted(Map.Entry.comparingByValue())
//            .map(m -> m.getKey() + " " + m.getValue())
//            .forEach(System.out::println);
}
