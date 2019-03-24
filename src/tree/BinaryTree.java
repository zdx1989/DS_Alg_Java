package tree;

/**
 * Created by zhoudunxiong on 2019/3/24.
 */
public class BinaryTree implements Tree {
    private Node root;

    @Override
    public Node find(int key) {
        Node current = root;
        while (current != null) {
            if (key == current.data) {
                return current;
            } else if (key < current.data) {
                current = current.leftChild;
            } else {
                current = current.rightChild;
            }
        }
        return null;
    }

    @Override
    public boolean insert(int data) {
        Node newNode = new Node(data);
        //空树的话直接插入
        if (root == null) {
            root = newNode;
            return true;
        } else {
            Node current = root;
            Node parentNode = null;
            while (current != null) {
                parentNode = current;
                if (data < current.data) {
                    current = current.leftChild;
                    if (current == null) {
                        parentNode.leftChild = newNode;
                        return true;
                    }
                } else {
                    current = current.rightChild;
                    if (current == null) {
                        parentNode.rightChild = newNode;
                        return true;
                    }
                }
            }
        }
        return  false;
    }

    @Override
    public void infixOrder(Node current) {
        while (current != null) {
            infixOrder(current.leftChild);
            System.out.print(current.data + " ");
            infixOrder(current.rightChild);
        }
    }

    @Override
    public void prevOrder(Node current) {
        while (current != null) {
            System.out.print(current.data + " ");
            infixOrder(current.leftChild);
            infixOrder(current.rightChild);
        }
    }

    @Override
    public void postOrder(Node current) {
        while (current != null) {
            infixOrder(current.leftChild);
            infixOrder(current.rightChild);
            System.out.print(current.data + " ");
        }
    }

    @Override
    public Node findMin() {
        Node current = root;
        Node min = current;
        while (current != null) {
            min = current;
            current = current.leftChild;
        }
        return min;
    }

    @Override
    public Node findMax() {
        Node current = root;
        Node max = current;
        while (current != null) {
            max = current;
            current = current.rightChild;
        }
        return max;
    }

    @Override
    public boolean delete(int key) {
        return false;
    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.insert(50);
        bt.insert(20);
        bt.insert(80);
        bt.insert(10);
        bt.insert(30);
        bt.insert(60);
        bt.insert(90);
        bt.insert(25);
        bt.insert(85);
        bt.insert(100);
        System.out.println(bt.findMax().data);
        System.out.println(bt.findMin().data);
        System.out.println(bt.find(100).data);
        System.out.println(bt.find(200));
    }
}
