import java.util.HashMap;
import java.util.List;

public abstract class Product {
    private int ID;
    private String title;
    private double price;
    private String desc;
    private HashMap<String,String> categor;

    protected List<Product> products;

    public Product(int ID, String title, double price, String desc){
        this.ID = ID;
        this.price = price;
        this.title = title;
    }

    public Product() {

    }

    private void idgen(int Id) {
        this.ID = ++Id;

    }

    public String GetTitle() {
        return this.title;
    }

    public void SetTitle() {
        this.title = title;
    }

    public double GetPrice() {
        return this.price;
    }

    public void SetPrice() {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setDesc() {
        this.desc = desc;

    }
}
