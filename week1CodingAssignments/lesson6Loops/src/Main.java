public class Main {
    public static void main(String[] args) throws Exception {
        // For döngüsü, genelde adım sayısını bildiğimiz durumlarda kullanırız.
        for (int i = 0; i < 5; i++) {
            System.out.println(i + 1 + ". adımdayız! (for)");
        }

        // While döngüsü, genelde adım sayısından emin olmadığımız durumlarda
        // kullanırız.
        int i = 0;
        while (i < 5) {
            System.out.println(i + 1 + ". adımdayız! (while)");
            i++;
        }

        // Do While döngüsü, önce bir kere yap daha sonra döngü şartını kolla anlamına
        // gelir.
        i = 5;
        do {
            System.out.println(i + 1 + ". adımdayız! (while)");
            i++;
        } while (i < 5);

    }
}
