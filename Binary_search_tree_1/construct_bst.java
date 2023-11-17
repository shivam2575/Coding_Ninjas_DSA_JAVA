package Binary_search_tree_1;

public class construct_bst {
    public static BinaryTreeNode<Integer> SortedArrayToBSTHelper(int[] arr, int si ,int ei){
        if(si>ei){
            return null;
        }
        int mid = (si+ei)/2;
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(arr[mid]);
        root.left = SortedArrayToBSTHelper(arr,si,mid-1);
        root.right = SortedArrayToBSTHelper(arr,mid+1,ei);
        return root;
    }

    public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int n){
        return SortedArrayToBSTHelper(arr,0,n-1);
    }
}
