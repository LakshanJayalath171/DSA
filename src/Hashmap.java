import java.util.HashMap;

public class Hashmap {
    static void main(String[] args) {
        //Define a hashmap
        HashMap <String , Double> hashMap = new HashMap<>();

        //Adding Data to the hashmap
        hashMap.put("Apple",150.00);
        hashMap.put("Orange",100.00);
        hashMap.put("Banana",150.00);
        hashMap.put("Grapes",200.00);
        hashMap.put("Apricot",135.00);
        hashMap.put("Cocoa",100.00);

        System.out.println(hashMap);

        hashMap.put("Apple",500.00); //duplicate keys will make overriding values
        System.out.println(hashMap);

        hashMap.remove("Apple"); //remove element from hashmap
        System.out.println(hashMap);

        System.out.println(hashMap.get("Grapes")); // getting value of specific element

        if(hashMap.containsKey("Orange")){
            System.out.println(hashMap.get("Orange"));
        }
        else{
            System.out.println("You have not any key here");
        }

        // getting values by key : value pairs
        for(String key:hashMap.keySet()){
            System.out.println(key + " : $" + hashMap.get(key));
        }
    }
}
