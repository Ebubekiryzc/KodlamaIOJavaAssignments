public class Main {
    public static void main(String[] args) throws Exception {
        findNumber(5);
    }

    public static void findNumber(int query) {
        int[] numbers = new int[] { 1, 3, 5, 7, 9, 0 };

        boolean isExist = false;

        for (int number : numbers) {
            if (number == query) {
                isExist = true;
                break;
            }
        }

        if (isExist) {
            printMessage("Sayı mevcuttur: " + query);
        } else {
            printMessage("Sayı mevcut değildir: " + query);
        }
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }
}
