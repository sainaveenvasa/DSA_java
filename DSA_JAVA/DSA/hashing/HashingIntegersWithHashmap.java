//package DSA.hashing;

import java.util.HashMap;
import java.util.Map;

public class HashingIntegersWithHashmap {
    public static void main(String args[]){
        HashMap<Integer,Integer> map1=new HashMap<>();
        int[] arr={1,2,1,3,1,4,1,5,1,4,7,8,9,2,9,3,10,15,17,3,5,7,8,4,9,3,2,0,17,15};
        for(int i=0;i<arr.length;i++){
           map1.put(arr[i] ,map1.getOrDefault(arr[i], 0)+1);
        }
        System.out.println(map1);

        //iterate through the maps
        for(Map.Entry<Integer,Integer> entry: map1.entrySet()){
            Integer key=entry.getKey();
            Integer value=entry.getValue();
            System.out.println(key+" -> "+value);
        }
        
    }
    
}
