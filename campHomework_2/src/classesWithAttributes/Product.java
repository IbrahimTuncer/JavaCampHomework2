package classesWithAttributes;

public class Product {

    public Product(){
        System.out.println("Constructor initialized");
    }
    
    // attribute || field
    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String code;
    private String color;

    public int getId() {  // id readable
        return id;
    }

    public void setId(int id) {
        this.id = id; // this(this class)

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getCode() {
        return this.name.substring(0,1)+id;
    }
    
    /*
    
    public void setCode(String code) {     // We deleted because we wanna just readable field
        this.code = code;
    }
    
    */

    public String getColor() {  
        return color;
    }
    
    

    public void setColor(String color) {
        this.color = color;
    }

}
