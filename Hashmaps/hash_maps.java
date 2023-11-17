package Hashmaps;

import java.util.ArrayList;

public class hash_maps<K, V> {
    ArrayList<mapnodes<K,V>> buckets;
    int count;
    int total_buckets;

    public hash_maps(){
        this.buckets = new ArrayList<>();
        this.total_buckets=20;
        for(int i=0; i<this.total_buckets; i++){
            this.buckets.add(null);
        }
    }

    private int getBucketIndex(K key){
        int hc = key.hashCode();
        int index = hc%total_buckets;
        return index;  
    }

    public void insert(K key, V value){
        double load = load_factor();
        if(load>0.7){
            rehash();
        }
        int index = getBucketIndex(key);
        mapnodes<K,V> new_node = new mapnodes<K,V>(key, value);

        mapnodes<K,V> head = buckets.get(index);

        while(head!=null){
            if(head.key.equals(key)){
                head.value = value;
                return;
            }
            head = head.next;
        }

        head = buckets.get(index);
        new_node.next = head;
        buckets.set(index, new_node);
        count++;
    }

    private void rehash() {
        ArrayList<mapnodes<K,V>> temp = this.buckets;
        buckets = new ArrayList<>();
        for(int i=0; i<total_buckets*2; i++){
            buckets.add(null);
        }
        count = 0;
        total_buckets *= 2;
        for(int i=0; i<temp.size(); i++){
            mapnodes<K,V> head = temp.get(i);
            while(head!=null){
                K key = head.key;
                V value = head.value;
                insert(key, value);
                head = head.next;
            }
        } 

    }

    public double load_factor() {
        return (1.0*count)/total_buckets;
    }

    public boolean search(K key){
        int index = getBucketIndex(key);
        mapnodes<K,V> head = buckets.get(index);
        if(head==null){
            return false;
        }
        while(head!=null){
            if(head.key.equals(key)){
                return true;
            }
            head = head.next;
        }
        return false;
    }

    public V remove(K key){
        if(search(key)){
            int index = getBucketIndex(key);
            mapnodes<K,V> head = buckets.get(index);
            mapnodes<K,V> prev = head;

            while(head!=null){
                if(head.key.equals(key)){
                    if(prev!=null){
                        prev.next = head.next;
                        head.next = null;
                    }else{
                        buckets.set(index, head.next);
                    }
                    return head.value;
                }
                prev = head;
                head = head.next;
            }
            count--;
        }
        return null;
    }

    public int size(){
        return count;
    }

    public V get_value(K key){
        if(search(key)){
            int index = getBucketIndex(key);
            mapnodes<K,V> head = buckets.get(index);

            while(head!=null){
                if(head.key.equals(key)){
                    return head.value;
                }
                head = head.next;
            }
        }
        return null;
    }
     
}
