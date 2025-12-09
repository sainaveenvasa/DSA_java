
import java.util.HashMap;
import java.util.Map;

public class hashingIntergersForMaxandMinFrequenices {

    public static void main(String args[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] num = {1, 2, 3, 4, 5, 6, 1, 2, 3, 1, 2, 1, 21, 1, 1, 1, 3, 8, 9, 0, 1};

        //here we found out the frequencies of each key/element of the array
        for (int i = 0; i < num.length; i++) {
            map.put(num[i], map.getOrDefault(num[i], 0) + 1);
        }
        System.out.println(map);

        Integer maxfrequency = 0;
        Integer minfrequency = 1;
        int minKey = 0;
        int maxKey = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            
            // to get the max frequency key value pair
            if (maxfrequency < value) {
                maxfrequency = value;
                maxKey = key;
            }

            // to get the min frequency key value pair
            if (minfrequency > value) {
                minfrequency = value;
                minKey = key;
            }

        }
        System.out.print("Maximum frequency key pair : ");
        System.out.println(maxKey + " -> " + maxfrequency);
        System.out.print("Minimum frequency key pair : ");
        System.out.println(minKey + " -> " + minfrequency);
    }
}
