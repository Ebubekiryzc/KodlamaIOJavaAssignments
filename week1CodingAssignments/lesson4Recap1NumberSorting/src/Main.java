public class Main {
    public static void main(String[] args) throws Exception {
        int number1 = 20;
        int number2 = 25;
        int number3 = 5;

        int maxNumber = number1;

        if (maxNumber < number2) {
            maxNumber = number2;
        }
        if (maxNumber < number3) {
            maxNumber = number3;
        }
    }
}
