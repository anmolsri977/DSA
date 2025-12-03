import java.util.*;
public class hashing{
    public static void main(String args[]){
        HashMap<String,Integer>map=new HashMap<>();

        //INSERTION IN HASHMAP-->they are unordered map like hashset
        map.put("India",120);
        map.put("US",10);
        map.put("UK",122);
        map.put("CHINA",156);
        // System.out.println(map); //TO SEARCH USE .contains("key")
        // System.out.println(map.get("CHINA"));
        // System.out.println(map.get("Africa"));
        // for(Map.Entry<String,Integer> e: map.entrySet()){
        //     System.out.println(e.getKey());
        //     System.out.println(e.getValue());
        // }
        map.remove("CHINA");
        System.out.println(map);
        
    }
}