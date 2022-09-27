public class ProductManager {
    public void add(Product product) {
        // System.out.println("Ürün eklendi: " + product.name);
        System.out.println("Ürün eklendi: " + product.getName());
    }

    // Bu çok yanlış çünkü ölçeklenebilir değildir.
    public void add2(int id, String name, String description, int stockAmount, double price) {
        System.out.println("Ürün eklendi: " + name);
    }
}
