import java.util.HashMap;
import java.util.List;

public class electronic extends Product {
    private List<String> categor;

    public electronic(String title , String desc, Double Price){
         super();
         this.setDesc(desc);
         this.SetPrice(Price);
         this.SetTitle(title);
    }

    public electronic() {

    }
}
