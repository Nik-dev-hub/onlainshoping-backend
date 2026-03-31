public class GardenItem extends Product{
    public GardenItem(Product title,String desc, double Price){
        super();
        this.SetTitle(String.valueOf(title));
        this.setDesc(desc);
        this.SetPrice(Price);

    }

    public GardenItem() {

    }
}
