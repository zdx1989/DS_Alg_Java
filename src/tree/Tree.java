package tree;

/**
 * Created by zhoudunxiong on 2019/3/24.
 */
public interface Tree {

    public Node find(int key);

    public boolean insert(int data);

    //中序遍历
    public void infixOrder(Node node);

    //前序遍历
    public void prevOrder(Node node);

    //后序遍历
    public void postOrder(Node node);

    public Node findMin();

    public Node findMax();

    public boolean delete(int key);

}
