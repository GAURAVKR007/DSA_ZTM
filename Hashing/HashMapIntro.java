import java.util.*;
class HashMapIntro {
    public static void main(String[] args) {
        //Country(key),population(value)
        HashMap<String,Integer> map = new HashMap<>();

        //Insertion
        map.put("India",170);
        map.put("US",50);
        map.put("China",160);

        System.out.println("Initial HashMap");
        System.out.println(map);

        map.put("China",165);
        System.out.println("After Updating China");
        System.out.println(map);

        //Search
        if(map.containsKey("China")){
            System.out.println("Key = China, exist in Hashmap");
        }else{
            System.out.println("Key doesn't exist in Hashmap");
        }

        //get Function
        System.out.println(map.get("India"));
        System.out.println(map.get("PKMKB"));

        System.out.println("Iterating over HashMap");
        for(Map.Entry<String,Integer> e :map.entrySet()){
            System.out.print(e.getKey()+ " : "+e.getValue()+"\n");
            
        }

        //Aterante way of iteration
        Set<String> Keys = map.keySet();
        for(String key : Keys){
            System.out.println(key+" "+map.get(key));
        }

        //remove

        map.remove("China");
        System.out.println("After Removing China");
        System.out.println(map);
    }
}

