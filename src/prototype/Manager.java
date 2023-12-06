package prototype;

import java.util.HashMap;
import java.util.Map;

public class Manager {
    private Map<String, ProductClass> showcase = new HashMap<>();

    public void register(String name, ProductClass product) {
        showcase.put(name, product);
    }

    public ProductClass create(String prototypeName) {
        ProductClass p = showcase.get(prototypeName);
        return p.createCopy(p);
    }
}
