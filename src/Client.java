import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client extends Person implements Payable {
    private List<Product> buyList = new ArrayList<>();
    private double totalCost;
    private int count;
    private StatusClient status = StatusClient.NOTHING;
    private double currTransAmount = 0;
    private boolean isPaid = false;

    public void selectProduct(Product p, int count){
        this.currTransAmount = p.calculateTCost(count);
        this.status = StatusClient.SELECTED;
        this.isPaid = false;
    }
    public void appDisc(int proc, Disc dd){
        if(status != status.SELECTED){
            System.out.println("Товар не выбран");
            return;
        }
    }

}

