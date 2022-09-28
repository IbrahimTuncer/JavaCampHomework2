package classesWithAttributes;

public class Main {
    
    public static void main(String[] args) {
        Product product = new Product();
        product.setId(5);
        product.setName("Laptop");
        product.setDescription("HP Laptop");
        product.setPrice(5000);
        product.setStockAmount(12);
        
        ProductManager productManager = new ProductManager();
        productManager.add(product);
        
        System.out.println(product.getCode());
    }
    
}
