public class Main {
    public static void main(String[] args) throws Exception {
        char letter = 'A';

        switch (letter) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalın sesli harf.");
                break;

            case 'E':
            case 'İ':
            case 'Ö':
            case 'Ü':
                System.out.println("İnce sesli harf.");
                break;

            default:
                System.out.println("Sessiz harf.");
                break;
        }
    }
}
