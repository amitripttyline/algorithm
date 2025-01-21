package HashMap;
import java.util.*;

public class Hashing {
    public static void main(String args[]){
        //creation
        HashMap<String, Integer> map = new HashMap<>();


        //insertion
        map.put("india", 200);
        map.put("SL", 300);
        map.put("China", 200);

        System.out.println(map);

        map.put("Africa", 1223);

        System.out.println(map);

        //Searching
        if(map.containsKey("Africa")){
            System.out.println("key is present");
        } else {
            System.out.println("key is not present");
        }
        System.out.println(map.get("SL"));
        System.out.println(map.get("Goa"));


        //iteration(1)
        for(Map.Entry<String, Integer> e: map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        //iteration(2)
        Set<String> keys = map.keySet();
        for(String key: keys){
            System.out.println(key + "  " +map.get(key));
        }

        //remove
        map.remove("SL");
        System.out.println(map);
    }
    
}
