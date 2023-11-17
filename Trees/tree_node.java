package Trees;

import java.util.ArrayList;

public class tree_node<T> {
    T data;
    public ArrayList<tree_node<T>> children;

    public tree_node(T data){
        this.data = data;
        this.children = new ArrayList<>();
    }


}
