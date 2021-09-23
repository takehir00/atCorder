//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.nio.charset.StandardCharsets;
//
//public class ヤフーの３問目 {
//    InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
//    BufferedReader in = new BufferedReader(reader);
//    String line;
//    int lineCount = 1;
//    int itemSum =0;
//    int couponASum = 0;
//    int couponBSum = 0;
//    int itemPriceSum =0;
//
//        while ((line = in.readLine()) != null) {
//        if (lineCount == 1) {
//            String[] lineOneList = line.split(" ");
//            int lineOneListCount = 0;
//            for (String linOneElement : lineOneList) {
//                if (lineOneListCount == 0) {
//                    itemSum = Integer.parseInt(linOneElement);
//                }
//                if (lineOneListCount == 1) {
//                    couponASum = Integer.parseInt(linOneElement);
//                }
//                if (lineOneListCount == 2) {
//                    couponBSum = Integer.parseInt(linOneElement);
//                }
//                lineOneListCount++;
//            }
//        } else if (lineCount >= 2) {
//            String[] priceList = line.split(" ");
//
//            for (String aPrice: priceList) {
//                int priceToInt = Integer.parseInt(aPrice);
//                if (priceToInt >= 2100 && couponASum > 0) {
//                    itemPriceSum+=priceToInt*0.95;
//                    couponASum-=1;
//                } else if ((1000 <= priceToInt && priceToInt <= 2000) && couponBSum > 0) {
//                    itemPriceSum+=priceToInt-100;
//                    couponBSum-=1;
//                } else {
//                    if (couponBSum > 0) {
//                        itemPriceSum+=priceToInt-100;
//                    }
//                }
//            }
//
//
//
//        }
//
//
//        lineCount++;
//
//    }
//}
