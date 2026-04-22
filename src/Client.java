import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client extends Person{
    private List<Product> buyList = new ArrayList<>();
    private double totalCost;
    private int count;

    public void buy(Product p) {
        System.out.printf("Сколько %s вы хотите купить?" ,p.getTitle());
        Scanner scan = new Scanner(System.in);
        count = scan.nextInt();
        totalCost = p.calc(count);

        if (hasEnoughMoney() == true) {
            wallet_paid(totalCost);
            buyList.add(p);
            System.out.println("Покупка прошла успешно");
        }
        else {
            System.out.println("error");
        }
    }

    @Override
    public boolean hasEnoughMoney() {
        if (getWallet() >= totalCost){
            return true;
        }
        else{
            return false;
        }
    }

    public void showBuyList() {
        System.out.println(buyList);
    }
}

