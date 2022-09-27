public class Main {
    public static void main(String[] args) throws Exception {
        String city = giveCity();
        System.out.println(city);

        int total = add(1, 2);
        System.out.println("Toplam: " + total);

        total = add(1, 2, 3, 4, 5, 6, 7);
        System.out.println("Toplam: " + total);
    }

    public static void add() {
        System.out.println("Eklendi.");
    }

    public static void remove() {
        System.out.println("Silindi.");
    }

    public static void update() {
        System.out.println("Güncellendi.");
    }

    public static int add(int x, int y) {
        return x + y;
    }

    public static int add(int... numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }

    public static String giveCity() {
        return "Ankara";
    }
}
