package Binary_Tree_1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class binary_tree_use {
    public static void main(String[] args) {
        binary_tree_node<Integer> root = take_input_level_wise();
        print(root);
    }

    public static void print(binary_tree_node<Integer> root){
        if(root==null){
            return;
        }
        System.out.print(root.data+": ");
        if(root.left!=null){
            System.out.print("L"+root.left.data+" ");
        }
        if(root.right!=null){
            System.out.print("R"+root.right.data);
        }
        System.out.println();
        print(root.left);
        print(root.right);
    }

    public static binary_tree_node<Integer> take_input(boolean is_root, int root_data, boolean is_left){
        if(is_root){
            System.out.println("Enter root data: ");
        }else{
            if(is_left){
                System.out.println("Enter left child of "+root_data+" data: ");
            }else{
                System.out.println("Enter right child of "+root_data+" data: ");
            }
        }
        
        Scanner sc = new Scanner(System.in);
            int data = sc.nextInt();
            if(data==-1){
                return null;
            }
            binary_tree_node<Integer> head = new binary_tree_node<>(data);
            binary_tree_node<Integer> head_left = take_input(false, data, true);
            binary_tree_node<Integer> head_right = take_input(false, data, false);
            head.left = head_left;
            head.right = head_right; 
            return head;        
    }

    public static binary_tree_node<Integer> take_input_level_wise(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the root : ");
        int root_data = sc.nextInt();
        if(root_data==-1){
            return null;
        }
        binary_tree_node<Integer> root = new binary_tree_node<Integer>(root_data);
        Queue<binary_tree_node<Integer>> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            binary_tree_node<Integer> temp = q.poll();
            System.out.println("Enter the left of "+temp.data+" : ");
            int left_data = sc.nextInt();
            if(left_data!=-1){
                binary_tree_node<Integer> left_child = new binary_tree_node<>(left_data);
                q.add(left_child);
                temp.left = left_child;
            }else{
                temp.left = null;
            }

            System.out.println("Enter the right of "+temp.data+" : ");
            int right_data = sc.nextInt();
            if(right_data!=-1){
                binary_tree_node<Integer> right_child = new binary_tree_node<>(right_data);
                q.add(right_child);
                temp.right = right_child;
            }else{
                temp.right = null;
            }
        }
        return root;         
    } 
}
