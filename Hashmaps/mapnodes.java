package Hashmaps;

public class mapnodes<K, V> {
    K key;
    V value;
    mapnodes<K,V> next;

    public mapnodes(K key, V value){
        this.key = key;
        this.value = value;
    }

}
