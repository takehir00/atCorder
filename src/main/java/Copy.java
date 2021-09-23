public class Copy {

    public void parseInt() {
        String line = "1000 1230 4000";
        String[] priceList = line.split(" ");

        int sum = 0;
        for (String aPrice: priceList) {
            int priceToInt = Integer.parseInt(aPrice);
            if (priceToInt <= 10000) {
                sum += priceToInt;
            }
        }


        System.out.println(sum);


    }

}
