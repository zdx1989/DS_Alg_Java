package tree;

/**
 * Created by zhoudunxiong on 2019/3/24.
 */
public class Node {
    int data;
    Node leftChild;
    Node rightChild;
    boolean isDeleted;

    public Node(int i) {
        data = i;
    }

    public void display() {
        System.out.println(data);
    }
}
