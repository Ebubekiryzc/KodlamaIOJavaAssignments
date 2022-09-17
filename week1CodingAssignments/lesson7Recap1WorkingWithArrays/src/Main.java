public class Main {
    public static void main(String[] args) throws Exception {
        double[] myList = { 1.2, 5.6, 3.4, 7.8 };
        double total = 0;
        double maxNumber = myList[0];

        for (double number : myList) {
            if (maxNumber < number)
                maxNumber = number;

            total = total + number;
            System.out.println(number);
        }

        System.out.println("Toplam: " + total);

    }
}
