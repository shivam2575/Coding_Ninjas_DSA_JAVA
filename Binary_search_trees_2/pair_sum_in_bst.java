package Binary_search_trees_2;

import java.util.Stack;

import Binary_search_tree_1.BinaryTreeNode;

public class pair_sum_in_bst {
    public static void printNodesSumToS(BinaryTreeNode<Integer> root, int s) {
		// Write your code here
		if (root == null) {
			return;
		}
		int size = size(root);
		int n = 0;
		Stack<BinaryTreeNode<Integer>> in = new Stack<>();
		Stack<BinaryTreeNode<Integer>> rev_in = new Stack<>();
		BinaryTreeNode<Integer> temp = root;
		while (temp != null) {
			in.add(temp);
			temp = temp.left;
		}
		temp = root;
		while (temp != null) {
			rev_in.add(temp);
			temp = temp.right;
		}
		while (n < size - 1) {
			BinaryTreeNode<Integer> top1 = in.peek();
			BinaryTreeNode<Integer> top2 = rev_in.peek();
			int sum = top1.data + top2.data;
			if (sum == s) {
				System.out.println(top1.data + " " + top2.data);
				BinaryTreeNode<Integer> top = top1;
				in.pop();
				n++;
				if (top.right != null) {
					top = top.right;
					while (top != null) {
						in.push(top);
						top = top.left;
					}
				}
				top = top2;
				rev_in.pop();
				n++;
				if (top.left != null) {
					top = top.left;
					while (top != null) {
						rev_in.push(top);
						top = top.right;
					}
				}
			} else if (sum > s) {
				BinaryTreeNode<Integer> top = top2;
				rev_in.pop();
				n++;
				if (top.left != null) {
					top = top.left;
					while (top != null) {
						rev_in.push(top);
						top = top.right;
					}
				}
			} else {
				BinaryTreeNode<Integer> top = top1;
				in.pop();
				n++;
				if (top.right != null) {
					top = top.right;
					while (top != null) {
						in.push(top);
						top = top.left;
					}
				}
			}
		}
	}

	public static int size(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}
		return 1 + size(root.left) + size(root.right);
	}
}
