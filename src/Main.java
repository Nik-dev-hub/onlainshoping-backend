import java.lang.annotation.ElementType;
import java.util.*;
import java.util.concurrent.TransferQueue;


public class Main extends Product{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Product pro = new Product() {
        };
        int UsIn;
        String titles;
        double Prices;
        String desces;
        String cater;
        int cci;
        double usBal;
        int usSort;
        List<String> sortedCats = new ArrayList<>(pro.category.keySet());
        int usAg;
        int usAg1;
        int resSr;
        Client user = new Client();

        GardenItem pr = new GardenItem();


        while (true){
            System.out.println("Что вы хотите сделать?\n1-добавить новый продукт\n2-подсчёт стоимости\n3-вывести категории\n4 - сравнить\n5 - выдать список товаров\n6 - купить товар\n0-закончить");
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

                GardenItem newItem = new GardenItem();
                newItem.SetTitle(titles);
                newItem.SetPrice(Prices);
                newItem.setDesc(desces);

                System.out.println("Введите категорию");
                cater = scan.next();

                newItem.addproduct(cater);
            }else if (UsIn == 2){
                System.out.println("Введите количесво продуктов");
                cci = scan.nextInt();

                pr.calc(cci);

            }else if (UsIn == 3){
                Collections.sort(sortedCats);
                sortedCats.forEach(System.out::println);
            }
            else if (UsIn == 4){
                if(inp.size() < 2){
                    System.out.println("Need more than 2");
                }
                else{
                    System.out.println(inp.size() + " введите два номера для сравнения");
                    usAg = scan.nextInt();
                    usAg1 = scan.nextInt();
                    Product el1 = inp.get(usAg);
                    Product el2 = inp.get(usAg1);
                    resSr = el1.compareTo(el2);
                    if(resSr > 0) {
                        System.out.println(el1.GetTitle() + "дороже");
                    }else if (resSr < 0) {
                        System.out.println(el2.GetTitle() + "дороже");
                    }else {
                        System.out.println("равны");
                    }

                }
            }
            else if (UsIn == 5){
                System.out.println("как сортировать 1 - по цене; 2 - по имени");
                usSort = scan.nextInt();
                if (usSort == 1 ){
                    Collections.sort(inp);
                }else{
                    inp.sort(Product.nameComp);
                }
                System.out.println("1 - уб; 2 - возр");
                usSort = scan.nextInt();
                if(usSort == 1){
                    Collections.reverse(inp);
                }
                inp.stream()
                        .forEach(System.out::println);
            }
            else if(UsIn == 6){
                if (Product.inp.isEmpty()) {
                    System.out.println("в товарах пусто");
                    break;
                }
             for (int i = 0; i < Product.inp.size(); i++) {
                    System.out.println(i + ": " + Product.inp.get(i).GetTitle() + Product.inp.get(i).GetPrice() );
                }
                System.out.print("Выберите номер товара: ");
                int productIndex = scan.nextInt();
                if (productIndex >= 0) {
                    Product selected = Product.inp.get(productIndex);

                    user.buy(selected);

                    System.out.println("Применить промокод на скидку? (1 - Да, 0 - Нет)");
                    int in = scan.nextInt();
                    if (in == 1) {
                        System.out.print("Введите % скидки: ");
                        user.useDiscount(scan.nextInt());
                        }
                } else {
                    System.out.println("Неверный индекс");
                }
            }
        }

    }
}