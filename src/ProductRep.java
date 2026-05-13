import java.util.*;

public class ProductRep {
    private List<Product> catalog = new ArrayList<>();
    private Map<String, List<Product>> catigoris = new HashMap<>();

    public void addProduct(Product product, String catName){
        catalog.add(product);
        if(catigoris.containsKey(catName) == false) {
            catigoris.put(catName, new ArrayList<>());
        }
        catigoris.get(catName).add(product);
    }
    public List<Product> getAllP() {
        return new ArrayList<>(catalog);
    }
    public Set<String> getCategories(){
        return catigoris.keySet();
    }


}
