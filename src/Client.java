import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client extends Person {
    private List<Product> buyList = new ArrayList<>();
    private double totalCost;
    private int count;
    private StatusClient status = StatusClient.NOTHING;

    public void buy(Product p) {
        System.out.printf("Сколько %s вы хотите купить?" ,p.GetTitle());
        Scanner scan = new Scanner(System.in);
        count = scan.nextInt();
        totalCost = p.calc(count);
        status = StatusClient.SELECTED;

        if (hasEnoughMoney() == true) {
            wallet_paid(totalCost);
            buyList.add(p);
            System.out.println("Покупка прошла успешно");
            status = StatusClient.PAYED;
        }
        else {
            System.out.println("error");
        }
    }

    public void useDiscount(int discount){
        if(discount > 50){
            System.out.println("too many discount");
        }else{
            Disc calcur = (a,b) -> (b*a)/100;
            int a = discount;
            double b = totalCost;
            totalCost -= calcur.Sellary(a,b);
            System.out.println("Скидка равна " + calcur.Sellary(a,b));
        }
    }

    @Override
    public String getFinansleStatus() {
        System.out.println("Статус покупки - " + status);
        return " ";
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

