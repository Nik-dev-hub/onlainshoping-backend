import java.util.*;

public abstract class Product implements Finanseble,Payable{
    private int er = 0;
    private int ID = 0;
    private Product title;
    private double price;
    private String desc;
    public HashMap<String, List<Product>> category = new HashMap<String, List<Product>>();
    public List <Product> inp = new ArrayList<>();
    private boolean pays = false;
    private double money;
    Scanner scan = new Scanner(System.in);

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

    public Product getTitle() {
        return title;
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

    @Override
    public double getFinalePrice() {
        int pp;
        pp = scan.nextInt();
        return calc(pp);
    }

    @Override
    public void pay(double money) {
        this.money += money;

        if(isPaid() == true){
            System.out.println("You are paid before");
            return;
        }

        if (getFinalePrice() > this.money){
            System.out.println("Not enough money");
            this.pays = false;
        }
        else{
            this.pays = true;
            this.money -= getFinalePrice();
            System.out.println("Payed");
        }
    }

    @Override
    public boolean isPaid() {
        return pays;
    }

    @Override
    public double checkBalance() {
        return this.money;
    }

    @Override
    public boolean hasEnoughMoney() {
        if(isPaid() == true){
            System.out.println("you paid before");
            return true;
        }
        if(getFinalePrice() > this.money){
            return false;
        }
        else{
            return true;
        }

    }

    @Override
    public String toString() {
        return "Product{" +
                " ID=" + ID +
                ", title=" + title +
                ", price=" + price +
                ", desc='" + desc + '\'' +
                ", inp=" + inp +
                ", pays=" + pays +
                ", money=" + money +
                '}';
    }

    @Override
    public String getFinansleStatus() {
        if(hasEnoughMoney() == true){
            return "all good";
        }
        else {
            return "bad";
        }
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;

        Product other = (Product) obj;
        return other.price == this.price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(price);
    }
}
