public class AVLTree{

    private Node root;

    public AVLTree() {
        root = null;
    }

    public void insert(int value) {
        root = insert(root , value);
    }

    public Node insert(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }
        else if (value > root.data) {
            root.right = insert(root.right, value);
        }
        else {
            root.left = insert(root.left, value);
        }
        return balanceTree(root);
    }
    public int getBalance(Node curr){
        if (curr == null){
            return 0;
        }else{
            return (getHeight(curr.right) - getHeight(curr.left));
        }
    }

    public int getHeight(Node curr){
        if (curr == null) {
            return 0;
        }
        else {
            return curr.height;
        }
    }

    public void setHeight(Node curr){
        if (getHeight(curr.left) >= getHeight(curr.right)) {
            curr.height = getHeight(curr.left) + 1;
        }
        else{
            curr.height = getHeight(curr.right) + 1;
        }
    }

    public Node rightRotate(Node curr){
        Node rightChild = curr.left;
        curr.left = rightChild.right;
        rightChild.right = curr;

        setHeight(curr);
        setHeight(rightChild);

        return rightChild;
    }

    public Node leftRotate(Node curr){
        Node leftChild = curr.right;
        curr.right = leftChild.left;
        leftChild.left = curr;

        setHeight(curr);
        setHeight(leftChild);

        return leftChild;
    }

    public Node balanceTree(Node curr){
        setHeight(curr);
        if (getBalance(curr) < -1) {
            if (getBalance(curr.left) > 0) {
                curr.left = leftRotate(curr.left);
                return rightRotate(curr);
            }
            else{
                return rightRotate(curr);
            }
        }
        if (getBalance(curr) > 1) {
            if (getBalance(curr.right) < 0) {
                curr.right = rightRotate(curr.right);
                return leftRotate(curr);
            }
            else {
                return leftRotate(curr);
            }
        }
        return curr;
    }

    public void printInOrder() {
        if(root != null) {
            printIO(root);
        }
    }

    private void printIO(Node curr) {
        if(curr.left != null) {
            printIO(curr.left);
        }
        System.out.print(curr.data + " ");
        if(curr.right != null) {
            printIO(curr.right);
        }
    }
    public void printPreOrder(Node curr){
        System.out.print(curr.data + " ");
        if(curr.left != null) {
            printPreOrder(curr.left);
        }
        if(curr.right != null) {
            printPreOrder(curr.right);
        }
    }
    public void printPostorder(Node curr){
        if(curr.left != null) {
            printPostorder(curr.left);
        }
        if(curr.right != null) {
            printPostorder(curr.right);
        }
        System.out.print(curr.data + " ");
    }

    private class Node{
        public int data;
        public int height;
        public Node left;
        public Node right;

        public Node(int dataIn){
            data = dataIn;
            left = null;
            right = null;
            height = 1;
        }
    }

    public static void main(String[] args){
        AVLTree avl = new AVLTree();
        avl.insert(40);
        avl.insert(20);
        avl.insert(10);
        avl.insert(25);
        avl.insert(30);
        avl.insert(22);
        avl.insert(50);

        avl.printInOrder();
        System.out.println("- Inorder Traversal");

        avl.printPreOrder(avl.root);
        System.out.println("- Preorder Traversal");

        avl.printPostorder(avl.root);
        System.out.print("- Postorder Traversal");

    }

}