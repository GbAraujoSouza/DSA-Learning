import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Integer needle = 1;
        //BinaryNode<Integer> root = new BinaryNode<>();

        BSTree<Integer> tree = new BSTree();

        BinaryNode<Integer> root = null;
        root = tree.insert(root,5);
        root = tree.insert(root,4);
        root = tree.insert(root,3);

        var array = new ArrayList<Integer>();
        TreeSearch treeSearch = new TreeSearch();
        treeSearch.inOrderWalk(root, array);

        System.out.println(array);
    }
}
