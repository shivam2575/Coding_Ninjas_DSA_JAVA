/*
 * In this question i started right by deciding to check depth
 * my second check was to find out the parent of both the nodes,
 * that was a longer route
 * better solution is to find if they are sibling(i.e. if the parent is same)
 * this is the shorter way 
 * try to find quicker solution if direct or the other way round.
 */

package Test_3;

import Binary_search_tree_1.BinaryTreeNode;

public class check_cousins {
    public static int depth(BinaryTreeNode<Integer> root, int p){
        if(root==null){
            return -1;
        }
        if(root.data==p){
            return 0;
        }
        int left_ans = depth(root.left,p);
        if(left_ans!=-1){
            return 1+left_ans;
        }
        int right_ans = depth(root.right, p);
        if(right_ans!=-1){
            return 1+right_ans;
        }
        return -1;
    }

    public static boolean isSibling(BinaryTreeNode<Integer> root, int p, int q){
        if(root==null){
            return false;
        }
        if(root.left!=null && root.right!=null){
            if(root.left.data==p && root.right.data==q){
                return true;
            }
            else if(root.left.data==q && root.right.data==p){
                return true;
            }else{
                return (isSibling(root.left, p, q)||isSibling(root.right, p, q));
            } 
        }
        else if(root.right!=null){
            return isSibling(root.right, p, q);
        }
        else{
            return isSibling(root.left, p, q);
        }
    }

   public static boolean isCousin(BinaryTreeNode<Integer> root, int p, int q) {
       // Write your code here
       if(root==null){
           return false;
       }
       return (depth(root, p)==depth(root, q) && (!isSibling(root, p, q)));

   }
}
