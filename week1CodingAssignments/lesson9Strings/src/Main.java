public class Main {
    public static void main(String[] args) throws Exception {
        String message = "Bugün hava çok güzel";
        System.out.println(message);

        System.out.println("Eleman sayısı:" + message.length());
        System.out.println("5. eleman:" + message.charAt(4));
        // Bu işlem birleştirme yapar ancak atama yapmaz:
        System.out.println(message.concat(". Yaşasın!"));

        // Bu kısımlar case sensitive çalışmakta
        System.out.println(message.startsWith("A"));
        System.out.println(message.endsWith("!"));

        char[] characters = new char[message.length()];
        // Son kısım dahil edilmiyor.
        message.getChars(0, 5, characters, 0);
        System.out.println(characters);

        // İlk a harfinin indexini verir.
        System.out.println(message.indexOf("a"));
        // Son a harfinin indexini verir.
        System.out.println(message.lastIndexOf("a"));

        // String fonksiyonlarının tamamı yeni bir obje geriye döndürür.
        System.out.println(message.replace(' ', '-'));

        // String'in belli bir parçasını alır. Son index dahil değildir.
        System.out.println(message.substring(0, 5));

        // Kelimeyi belirtilen karaktere geldiğinde böler.
        System.out.println(message.split(" ").length);

        // Kelimeyi küçük harfe dönüştürür.
        System.out.println(message.toLowerCase());

        // Kelimeyi büyük harfe dönüştürür.
        System.out.println(message.toUpperCase());

        // Baştaki ve sondaki boşlukları keser.
        message = "  selam  ";
        System.out.println(message.trim());
    }
}
