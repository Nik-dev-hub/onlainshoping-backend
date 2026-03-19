import java.util.HashMap;
import java.util.List;

public class electronic extends Product {
    private List<String> categor;

    public electronic(String title , String desc){
         super();
    }

    public electronic() {

    }

    public void addcategor(String p){
        categor.add(p);
    }

    public List<String> getCategor() {
        return categor;
    }

}
