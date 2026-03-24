import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public abstract class Product {
    private int ID = 0;
    private String title;
    private double price;
    private String desc;
    public HashMap<String, List<String>> category = new HashMap<String, List<String>>();

    protected List<Product> products;

    public Product(String title, double price, String desc){
        this.price = price;
        this.title = title;
    }

    public Product() {

    }

    public Product(int id, String title, double price, String desc) {
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

    public double calc(int countItem){
        double allcoount;
        allcoount = countItem * price;
        return allcoount;
    }

    public void Hashed(String cat,String val){
        category.put(cat, Collections.singletonList(title));
    }

    public void setDesc() {
        this.desc = desc;

    }
}
