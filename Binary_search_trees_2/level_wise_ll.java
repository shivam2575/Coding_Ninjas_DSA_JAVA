package Binary_search_trees_2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import Binary_search_tree_1.BinaryTreeNode;
import Binary_search_tree_1.LinkedListNode;

public class level_wise_ll {
    public static ArrayList<LinkedListNode<Integer>> constructLinkedListForEachLevel(BinaryTreeNode<Integer> root){
		// Write your code here
		if(root==null){
			return null;
		}
		Queue<BinaryTreeNode<Integer>> q = new LinkedList<>();
		 ArrayList<LinkedListNode<Integer>> ans = new ArrayList<>();
		LinkedListNode<Integer> head = null;
		LinkedListNode<Integer> tail = null;
		q.add(root);
		q.add(null);
		while(!q.isEmpty()){
			BinaryTreeNode<Integer> curr = q.poll();
			if(curr!=null){
				if(head==null){
					head = new LinkedListNode<>(curr.data);
					tail = head;
				}else{
					LinkedListNode<Integer> next = new LinkedListNode<>(curr.data);
					tail.next = next;
					tail = tail.next;
				}
				if(curr.left!=null){
					q.add(curr.left);
				}
				if(curr.right!=null){
					q.add(curr.right);
				}
			}

			else if(curr==null && q.isEmpty()){
				break;
			}

			else if(curr==null){
				q.add(null);
				tail.next = null;
				ans.add(head);
				head = null;
			}
		}
		ans.add(head);
		return ans;
	}
}
