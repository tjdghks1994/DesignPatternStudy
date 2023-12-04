package singleton;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Triple {
    private static Map<String, Triple> map = new HashMap<>();

    static {
        String[] nameArr = {"ALPHA", "BETA", "GAMMA"};
        Arrays.stream(nameArr).forEach(name -> map.put(name, new Triple(name)));
    }
    private String name;
    private Triple(String name) {
        System.out.println("The instance " + name + " is created.");
        this.name = name;
    }

    public static Triple getInstance(String name) {
        return map.get(name);
    }

    @Override
    public String toString() {
        return "Triple{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        System.out.println("START");
        Triple t1 = Triple.getInstance("ALPHA");
        Triple t2 = Triple.getInstance("BETA");
        Triple t3 = Triple.getInstance("GAMMA");
        Triple t4 = Triple.getInstance("ALPHA");
        Triple t5 = Triple.getInstance("BETA");
        Triple t6 = Triple.getInstance("GAMMA");

        if (t1 == t4) {
            System.out.println("t1 == t4 (" + t1 + ")");
        } else {
            System.out.println("t1 != t4");
        }

        if (t2 == t5) {
            System.out.println("t2 == t5 (" + t2 + ")");
        } else {
            System.out.println("t2 != t5");
        }

        if (t3 == t6) {
            System.out.println("t3 == t6 (" + t3 + ")");
        } else {
            System.out.println("t3 != t6");
        }
        System.out.println("END");
    }
}
