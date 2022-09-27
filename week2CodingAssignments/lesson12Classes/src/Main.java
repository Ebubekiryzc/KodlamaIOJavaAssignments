public class Main {
    public static void main(String[] args) throws Exception {
        // reference type
        // referanslar stack'de, değerleri (nesneler) ise heap'de adreslenir.
        CustomerManager customerManager = new CustomerManager();
        customerManager.add();
        customerManager.remove();
        customerManager.update();

        int number1 = 10;
        int number2 = 20;
        number2 = number1;
        number1 = 30;
        System.out.println(number2); // 10, çünkü değer tipler yalnızca stack'de adreslenir.

        int[] numbers1 = { 1, 2, 3 };
        int[] numbers2 = { 4, 5, 6 };
        numbers2 = numbers1;
        numbers1[0] = 10;
        System.out.println(numbers2[0]); // 10, diziler referans tiptir.
        
    }
}
