//package DSA.hashing;
import java.util.HashMap;
import java.util.Map;

public class hashingStringWithHashMap {
    public static void main(String[] args){
        HashMap<Character,Integer> map=new HashMap<>();
        String s="eqfervejrffbawfyfncnvfvtwrefuhoiewgfiwoCBOUswvchiwFEBWVRGAYCVAweb";

        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i), 0)+1);
        }
        System.out.println(map);

        for(Map.Entry<Character,Integer> entry: map.entrySet()){
            Character key= entry.getKey();
            Integer value=entry.getValue();
            System.out.println(key + " -> "+value);

        }

    }
    
}
