package Hashmaps;

public class mapuse {
    public static void main(String[] args) {
        hash_maps<String, Integer> map = new hash_maps<>();
        for(int i=0; i<20; i++){
            map.insert("abc"+i, i);
            System.out.println(map.load_factor());
        }

        System.out.println(map.get_value("abc19"));
        System.out.println(map.remove("abc19"));
        System.out.println(map.search("abc19"));
    }
}
