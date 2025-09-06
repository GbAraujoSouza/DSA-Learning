import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BSTreeTest {

    @Test
    void insertIsSortedTest() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5,4,3,2,1));

        BinaryNode<Integer> root = null;
        BSTree<Integer> tree = new BSTree<>();
        for (int i: list) {
            root = tree.insert(root, i);
        }

        var expected = Arrays.asList(1,2,3,4,5);

        var given = new ArrayList<Integer>();
        TreeSearch treeSearch = new TreeSearch();
        treeSearch.posOrderWalk(root, given);

        assertArrayEquals(expected.toArray(), given.toArray());
    }
}