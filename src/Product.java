public class Product {

    private String name;
    private int price;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public boolean equals(Object obj){
        if(this == obj)
            return true;
        if(obj instanceof Product){
            Product product = (Product) obj;
            if (product.name.equals(name) && product.price == price){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("%s - %d", name, price);
    }
}
