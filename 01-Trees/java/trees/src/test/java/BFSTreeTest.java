import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class BFSTreeTest {

    @Test
    void BFSWithNeedle() {
        Integer needle = 1;
        BinaryNode<Integer> root = new BinaryNode<>(1);
        root.left = new BinaryNode<>(2);
        root.right = new BinaryNode<>(3);

        BFSTree BFSTree = new BFSTree();
        assertTrue(BFSTree.BFS(root, needle));
    }

    @Test
    void BFSWithoutNeedle() {
        Integer needle = 4;
        BinaryNode<Integer> root = new BinaryNode<>(1);
        root.left = new BinaryNode<>(2);
        root.right = new BinaryNode<>(3);

        BFSTree BFSTree = new BFSTree();
        assertFalse(BFSTree.BFS(root, needle));
    }
}