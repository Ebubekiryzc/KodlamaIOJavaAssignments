public class Main {
    public static void main(String[] args) throws Exception {
        String student1 = "Ebubekir";
        String student2 = "Ömer";
        String student3 = "Salih";

        String[] students = new String[3];
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;

        // Bu satır hata verir. Çünkü index sayısı geçilmiştir.
        // students[3] = student3;


        for (int i = 0; i < students.length; i++) {
            System.out.println("Öğrenci adı: " + students[i]);
        }

        System.out.println("---");

        for (String studentName : students) {
            System.out.println("Öğrenci adı: " + studentName);
        }
    }
}
