import java.util.ArrayList;
import java.util.List;


public class TreeSearch {
    public List<Integer> preOrderWalk(BinaryNode<Integer> curr, List<Integer> path) {
        if (curr == null) {
            return path;
        }

        path.add(curr.value);
        preOrderWalk(curr.left, path);
        preOrderWalk(curr.right, path);

        return path;
    }
    public List<Integer> inOrderWalk(BinaryNode<Integer> curr, List<Integer> path) {
        if (curr == null) {
            return path;
        }

        inOrderWalk(curr.left, path);
        path.add(curr.value);
        inOrderWalk(curr.right, path);

        return path;
    }
    public List<Integer> posOrderWalk(BinaryNode<Integer> curr, List<Integer> path) {
        if (curr == null) {
            return path;
        }

        posOrderWalk(curr.left, path);
        posOrderWalk(curr.right, path);
        path.add(curr.value);

        return path;
    }

    public static void main(String[] args) {
        BinaryNode<Integer> root = new BinaryNode<>(1);
        root.left = new BinaryNode<>(2);
        root.right = new BinaryNode<>(3);

        ArrayList<Integer> path = new ArrayList<Integer>();
        TreeSearch treeSearch = new TreeSearch();
        treeSearch.inOrderWalk(root, path);

        System.out.println("In order:"+ path);
    }

    private List<Integer> preOrderSearch(BinaryNode<Integer> head) {
        return preOrderWalk(head, new ArrayList<>());
    }
}
