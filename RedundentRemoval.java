import java.util.ArrayList;
import java.util.HashMap;

class RedundentRemoval {
    
    public static void main(String[] args){
        //stringReverseM1();
        //stringReverseM2();
        //firstRedundentVa lue();
        redundentValueWithCount();
    }

    public static void stringReverseM1(){
        String name= "Ravi Rohal";
        StringBuilder sb = new StringBuilder(name);
        System.out.println(sb.reverse());
    }

    public static void stringReverseM2(){
        String name= "GreakOfGreak";
        char[] char_arr = name.toCharArray();
        ArrayList<Character> arr_list = new ArrayList<>();
        for(int i=0;i<char_arr.length;i++){
            if(!arr_list.contains(char_arr[i])){
                arr_list.add(char_arr[i]);
            }
        }
        
        System.out.println(arr_list);
    }

    public static void firstRedundentValue(){
        String name= "GreakOfGreak";
        int size = name.length();
        boolean flag = false;

        for(int i=0;i<size;i++){
            int cnt=0;
            for(int k=0;k<size;k++){
                if(name.charAt(k)==name.charAt(i)){
                    cnt++;
                    if(cnt>1){
                    System.out.println(name.charAt(i)+"count is: "+cnt);
                    flag=true;
                    }
                }
            }
            if(flag==true) break;
        }
    }


    public static void redundentValueWithCount(){
        String name= "GreakOfGreak";
        int size = name.length();
        char[] char_arr = name.toCharArray();
        HashMap<Character,Integer> char_map = new HashMap<>();
        for(char c:char_arr){
            if(char_map.containsKey(c)){
                int val = char_map.get(c)+1;
                char_map.put(c, val);
            }else{
                char_map.put(c, 1);
            }
        }
        
        System.out.println(char_map.toString());
        System.out.println(char_map);

    }




}
