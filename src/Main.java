public class Main {
    public static void main(String[] args){
        Product product = new Product(1346,"Milk",148.5);
        System.out.println(product.GetId() + ' ' + product.GetTitle() + ' ' + product.GetPrice());

    }
}