public class Main {
    public static void main(String[] args) throws Exception {
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int query = 5;

        boolean isExist = false;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == query) {
                isExist = true;
            }
        }

        if (isExist) {
            System.out.println("Sayı mevcut.");
        } else {
            System.out.println("Sayı mevcut değil!");
        }
    }
}
