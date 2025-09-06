public class BSTree <T extends Comparable<T>>{
    public BinaryNode<T> insert(BinaryNode<T> root, T value) {
        if (root == null) {
            return new BinaryNode<T>(value);
        }
        T v = root.value;

        if (value.compareTo(v) < 0) {
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }
        return root;
    }
}
