import java.util.*;
import java.util.Comparator;

public abstract class Product implements Finanseble, Payable, Comparable<Product> {
    private int er = 0;
    private int ID = 0;
    private String title;
    private double price;
    private String desc;
    public HashMap<String, List<Product>> category = new HashMap<String, List<Product>>();

    public static List<Product> inp = new ArrayList<>();
    private boolean pays = false;
    private double money;
    Scanner scan = new Scanner(System.in);

    protected List<Product> products;

    public Product(String title, double price, String desc) {
        this.title = title;
        this.price = price;
        this.desc = desc;
    }

    public Product() {

    }

    public Product(int id, String title, double price, String desc) {
    }

    private void idgen(int Id) {
        this.ID = ++Id;
    }

    public String GetTitle() {
        return title;
    }

    public void SetTitle(String title) {
        this.title = title;
    }

    public double GetPrice() {
        return price;
    }

    public void SetPrice(double price) {
        this.price = price;
    }

    public String GetDesc() {

        return desc;
    }

    public int getID() {

        return ID;
    }

    public double calc(int countItem) {
        double allcoount;
        allcoount = countItem * price;
        return allcoount;
    }

    public void addproduct(String cat) {
        inp.add(this);

        if (category.containsKey(cat) == false) {
            category.put(cat, new ArrayList<Product>());
        }
        category.get(cat).add(this);
    }

    public void ShowInfo() {
        for (String key : category.keySet()) {
            List<Product> val = category.get(key);
            System.out.println(val);
        }
    }

    public void setDesc(String desces) {
        this.desc = desces;
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

        if (isPaid() == true) {
            System.out.println("You are paid before");
            return;
        }

        if (getFinalePrice() > this.money) {
            System.out.println("Not enough money");
            this.pays = false;
        } else {
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
        if (isPaid() == true) {
            System.out.println("you paid before");
            return true;
        }
        if (getFinalePrice() > this.money) {
            return false;
        } else {
            return true;
        }

    }

    @Override
    public String toString() {
        return String.format("ID: %d " +
                " %s " +
                " Цена: %s" +
                " Описание: %s", ID, title, price, desc);
    }

    @Override
    public String getFinansleStatus() {
        if (hasEnoughMoney() == true) {
            return "all good";
        } else {
            return "bad";
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;

        Product other = (Product) obj;
        return other.price == this.price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(price);
    }

    @Override
    public int compareTo(Product other) {
        return Double.compare(this.price, other.price);
    }

    public static Comparator<Product> nameComp = Comparator.comparing(Product::GetTitle);

    public static Comparator<Product> priceC = (p1, p2) ->
            Double.compare(p2.GetPrice(), p1.GetPrice());
}
