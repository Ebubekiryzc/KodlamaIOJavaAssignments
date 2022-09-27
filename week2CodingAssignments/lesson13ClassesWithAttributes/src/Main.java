public class Main {
    public static void main(String[] args) throws Exception {
        Product product = new Product();
        // product.name = "Laptop";
        // product.id = 1;
        // product.description = "Asus Laptop";
        // product.price = 6000;
        // product.stockAmount = 3;
        // System.out.println(product.name);

        product.setId(1);
        product.setName("Laptop");
        product.setDescription("ASUS Laptop");
        product.setPrice(5000);
        product.setStockAmount(1);
        System.out.println(product.getName());

        Product product2 = new Product(2, "Laptop", "HP Laptop", 4000, 5, "Mor");

        ProductManager manager = new ProductManager();
        manager.add(product);
        manager.add(product2);
    }
}
