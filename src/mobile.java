import java.util.List;

public class mobile extends Product {

    List<Product> productList;

    public mobile(int ID, String title, double price, String desc) {
        super(ID, title, price, desc);
    }

    public void addproducts(Product p) {
        products.add(p);
    }

    public void printproducts(int id) {
        for (Product i : productList) {
            if (i.getID() == id) {
                System.out.println(GetTitle());
            }
        }
    }
}
