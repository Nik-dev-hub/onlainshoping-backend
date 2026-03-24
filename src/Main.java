import java.lang.annotation.ElementType;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TransferQueue;


public class Main extends Product{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int UsIn;
        String titles;
        double Prices;
        String desces;

        while (true){
            System.out.println("Что вы хотите сделать?\n1-добавить новый продукт\n2-подсчёт стоимости\n0-закончить");
            UsIn = scan.nextInt();
            if(UsIn == 0){
                break;
            }
            else if(UsIn == 1){
                System.out.println("Введите название");
                titles = scan.next();
                System.out.println("Введите цену");
                Prices = scan.nextDouble();
                System.out.println("Введите описание");
                desces = scan.next();
            }else if (UsIn == 2){
            }
        }

    }
}