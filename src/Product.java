public class Product {
    private int ID;
    private String title;
    private double price;

    public Product(int ID, String title, double price){
        this.ID = ID;
        this.price = price;
        this.title = title;
    }

    public int GetId() {
        return this.ID;
    }

    public void SetId() {
        this.ID = ID;
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

}
