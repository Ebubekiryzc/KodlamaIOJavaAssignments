public class Main {
    public static void main(String[] args) throws Exception {
        char grade = 'A';

        switch (grade) {
            case 'A': {
                System.out.println("Harika: Geçtiniz!");
                break;
            }
            case 'B': {
                System.out.println("Çok Güzel: Geçtiniz!");
                break;
            }
            case 'C': {
                System.out.println("İyi: Geçtiniz!");
                break;
            }
            case 'D': {
                System.out.println("Fena Değil: Geçtiniz!");
                break;
            }
            case 'E':
            case 'F': {
                System.out.println("Kötü: Kaldınız!");
                break;
            }

            default:
                System.out.println("Geçersiz not girdiniz");
                break;
        }
    }
}
