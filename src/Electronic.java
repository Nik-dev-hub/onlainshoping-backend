import java.util.List;

public class Electronic extends Product {
    private List<String> categor;

    public Electronic(String title , String desc, Double Price){
         super();
         this.setDesc(desc);
         this.SetPrice(Price);
         this.SetTitle(title);
    }

    public Electronic() {

    }
}
