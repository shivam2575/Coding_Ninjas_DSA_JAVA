package Trees;

public class second_largest_element_in_tree {
        static class Pair<T> {
        T first;
        T second;

        Pair(T first, T second) {
            this.first = first;
            this.second = second;
        }
    }

    public static tree_node<Integer> findSecondLargest(tree_node<Integer> root) {
        return findSecondLargestHelper(root).second;
    }

    public static Pair<tree_node<Integer>> findSecondLargestHelper(tree_node<Integer> root) {
        Pair<tree_node<Integer>> output;
        if (root == null) {
            output = new Pair<tree_node<Integer>>(null, null);
            return output;
        }
        output = new Pair<tree_node<Integer>>(root, null);
        for (tree_node<Integer> child : root.children) {
            Pair<tree_node<Integer>> childPair = findSecondLargestHelper(child);
            if (childPair.first.data > output.first.data) {
                if (childPair.second == null || childPair.second.data < output.first.data) {
                    output.second = output.first;
                    output.first = childPair.first;
                } else {
                    output.first = childPair.first;
                    output.second = childPair.second;
                }
            } else if (childPair.first.data.equals(output.first.data) && childPair.second != null) {
                if (output.second == null || childPair.second.data > output.second.data) {
                    output.second = childPair.second;
                }
            } else if (output.first.data != childPair.first.data
                    && (output.second == null || childPair.first.data > output.second.data)) {
                output.second = childPair.first;
            }
        }
        return output;
    }
}
