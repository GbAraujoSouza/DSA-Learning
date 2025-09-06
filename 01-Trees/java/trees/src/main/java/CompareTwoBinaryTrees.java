public class CompareTwoBinaryTrees {
    public <T> boolean compare(BinaryNode<T> node1, BinaryNode<T> node2) {
        // base
        if (node1 == null && node2 == null) {
            return true;
        }
        if (node1 == null || node2 == null) {
            return false;
        }
        if (node1.value != node2.value) {
            return false;
        }

        return compare(node1.left, node2.left) && compare(node1.right, node2.right);

    }
}
