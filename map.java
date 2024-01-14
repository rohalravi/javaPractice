import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class map {

    public static void main(String[] args){
        HashMap<Integer,String> m1 = new HashMap<>();
        m1.put(1, "Delhi");
        m1.put(5, "Andrapradesh");
        m1.put(4, "Bihar");
        m1.put(3, "Punjab");

        HashMap<Integer,String> m2 = new HashMap<>();
        m2.put(2, "Goa");
        m2.put(6, "Maharastra");

        //loopWithentrySet(m1);
        //mapMerging(m1,m2);
        //remove(m1,m2);
        sortingMap(m1);
    }

    public static void loopWithentrySet(HashMap<Integer,String> m1){
        for(Map.Entry me:m1.entrySet()){
            System.out.println("Key is:- "+me.getKey()+" "+"Value is:- "+me.getValue());
        }

        for(Integer k:m1.keySet()){
            System.out.println("Key is:- "+k+" "+"Value is:- "+m1.get(k));
        }
    }

    public static void mapMerging(HashMap<Integer,String> m1,HashMap<Integer,String> m2){
        m1.putAll(m2);
        
        System.out.println(m1);
    }

    public static void remove(HashMap<Integer,String> m1,HashMap<Integer,String> m2){
        m1.putAll(m2);
        System.out.println(m1);
        m1.remove(2);
        System.out.println(m1);
        m1.replace(3, "Bangal");
        System.out.println(m1);
        m1.put(2, "Goa");
        System.out.println(m1);
    }

    public static void sortingMap(HashMap<Integer,String> m1){
              
        System.out.println("orignal map:- "+m1);

        // way1
        TreeMap<Integer,String> sorted1 = new TreeMap<>(m1);
        System.out.println("Sorted map 1:-"+sorted1);

        //way2
        ArrayList<Integer> sorted2 = new ArrayList<>();
        sorted2.addAll(m1.keySet());
        Collections.sort(sorted2);
        System.out.println("Sorted list 2:-"+sorted2);
        
     }
    
}
