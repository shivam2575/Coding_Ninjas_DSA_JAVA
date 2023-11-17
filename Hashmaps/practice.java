package Hashmaps;

import java.util.HashMap;

public class practice {
    HashMap<Integer, Integer> map = new HashMap<>();
    int pair = 0;
    for(int i:arr){
        int p1= i+k;
        boolean flag = false;
        if(i==p1){
            flag = true;
        }
        if(map.containsKey(p1)){
            pair+=map.get(p1);
        }
        int p2 = i-k;
        if(map.containsKey(p2)&&!flag){
            pair+=map.get(p2);
        }
        if(map.containsKey(i)){
            map.put(i, map.get(i)+1);
        }else{
            map.put(i, 1);
        }
    }
    return pair;
}
