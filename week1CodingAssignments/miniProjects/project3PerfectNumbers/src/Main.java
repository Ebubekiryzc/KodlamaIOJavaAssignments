public class Main {
    public static void main(String[] args) throws Exception {
        // Mükemmel sayılar, kendinden başka tüm pozitif tam bölenlerinin toplamı
        // kendisine eşit olan sayılardır. Örnek 6
        int number = 6;
        int total = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0)
                total += i;
        }

        if (total == number)
            System.out.println("Mükemmel sayı.");
        else
            System.out.println("Mükemmel sayı değildir.");
    }
}
