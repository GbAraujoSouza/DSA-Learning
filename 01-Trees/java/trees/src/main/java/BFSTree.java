import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFSTree {
    public <T> boolean BFS(BinaryNode<T> root, T needle){
        Queue<BinaryNode<T>> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            BinaryNode<T> currNode = queue.poll();

            if (currNode.value.equals(needle)) {
                return true;
            }
            if (currNode.left != null) {
                queue.add(currNode.left);
            }
            if (currNode.right != null) {
                queue.add(currNode.right);
            }
        }

        return false;
    }
}
