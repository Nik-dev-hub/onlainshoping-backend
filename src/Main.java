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
        String cater;
        int cci;
        double usBal;

        GardenItem pr = new GardenItem();


        while (true){
            System.out.println("Что вы хотите сделать?\n1-добавить новый продукт\n2-подсчёт стоимости\n3-вывести всё\n4 - сравнить (в разработке)\n5 - заплатить\n0-закончить");
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

                pr.SetTitle(titles);
                pr.setDesc(desces);
                pr.SetPrice(Prices);

                System.out.println("Введите категорию");
                cater = scan.next();

                pr.addproduct(cater);

            }else if (UsIn == 2){
                System.out.println("Введите количесво продуктов");
                cci = scan.nextInt();

                pr.calc(cci);

            }else if (UsIn == 3){
                pr.ShowInfo();
            }
            else if (UsIn == 4){
                System.out.println("Введите вашу сумму");
                usBal = scan.nextDouble();
                pr.pay(usBal);
            }
        }

    }
}