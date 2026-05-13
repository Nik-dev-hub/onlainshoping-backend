import java.util.Objects;

// Отвечает ТОЛЬКО за свойства абстрактного товара
public abstract class Product implements Comparable<Product> {
    private final int id;
    private String title;
    private double price;
    private String desc;

    private static int idCounter = 0;

    public Product(String title, double price, String desc) {
        this.id = ++ idCounter;
        this.title = title;
        this.price = price;
        this.desc = desc;
    }

    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    public double calculateTCost(int countItem) {
        return countItem * this.price;
    }

    @Override
    public int compareTo(Product other) {
        return Double.compare(this.price,other.price);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Product other = (Product) obj;
        return Double.compare(other.price, this.price) == 0 && Objects.equals(title, other.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, price);
    }

    @Override
    public String toString() {
        return String.format("ID: %d" +
                " %s" +
                " Цена: %.2f" +
                " Описание: %s", id, title, price, desc);
    }
}
