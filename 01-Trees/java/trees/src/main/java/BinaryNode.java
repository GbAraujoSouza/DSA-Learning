import java.util.List;

public class BinaryNode<T> {
    T value;
    BinaryNode<T> left;
    BinaryNode<T> right;

    public BinaryNode(T value) {
        this.value = value;
    }

    public BinaryNode() {}

    private int currentIndex = 0;

    public BinaryNode<T> generateTree(List<T> baseList) {
        currentIndex = 0;
        return generateTreeHelper(baseList);
    }

    private BinaryNode<T> generateTreeHelper(List<T> baseList) {
        if (currentIndex >= baseList.size()) {
            return null;
        }

        T currentValue = baseList.get(currentIndex);
        currentIndex++;

        if (currentValue == null) {
            return null;
        }

        BinaryNode<T> node = new BinaryNode<>(currentValue);
        node.left = generateTreeHelper(baseList);
        node.right = generateTreeHelper(baseList);

        return node;
    }
}
