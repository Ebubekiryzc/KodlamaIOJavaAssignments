public class Main {
    public static void main(String[] args) throws Exception {
        String[][] cities = new String[3][3];

        cities[0][0] = "İstanbul";
        cities[0][1] = "Sakarya";
        cities[0][2] = "Kocaeli";
        cities[1][0] = "Trabzon";
        cities[1][1] = "Rize";
        cities[1][2] = "Giresun";
        cities[2][0] = "Diyarbakır";
        cities[2][1] = "Siirt";
        cities[2][2] = "Şanlıurfa";

        for (int i = 0; i < cities.length; i++) {
            System.out.println(i + 1 + ". bölge şehirleri:");
            for (int j = 0; j < cities[0].length; j++) {
                System.out.println(cities[i][j]);
            }
        }
    }
}
