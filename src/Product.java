import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public abstract class Product {
    private int er = 0;
    private int ID = 0;
    private Product title;
    private double price;
    private String desc;
    public HashMap<String, List<Product>> category = new HashMap<String, List<Product>>();
    public List <Product> inp = new ArrayList<>();

    protected List<Product> products;

    public Product(Product title, double price, String desc){
        this.price = price;
        this.title = title;
        this.desc = desc;
    }


    public Product() {

    }

    public Product(int id, String title, double price, String desc) {
    }

    private void idgen(int Id) {
        this.ID = ++Id;
    }

    public Product GetTitle() {
        return this.title;
    }

    public void SetTitle(String title) {
        this.title = this.title;
    }

    public double GetPrice() {
        return this.price;
    }

    public void SetPrice(double price) {
        this.price = this.price;
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

    public void addproduct(String cat){
        inp.add(er, title);
        category.put(cat, inp);
        er++;
    }

    public void ShowInfo(){
        for(String key: category.keySet()){
            List<Product> val = category.get(key);
            System.out.println(val);
        }
    }

    public void setDesc(String desces) {
        this.desc = desc;

    }
}
