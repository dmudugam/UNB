public class BST {
    private Node root;
    public BST() {
        root = null;
    }
    public void insert(int input) {
        Node nodeIn = new Node(input);
        if(root == null) {
            root = nodeIn;
        }
        else {
            insertR(nodeIn, root);
        }
    }
    public void insertR(Node nodeIn, Node curr) {
        if(nodeIn.data < curr.data) {
            if(curr.left == null) {
                curr.left = nodeIn;
            }
            else {
                insertR(nodeIn, curr.left);
            }
        }
        else if (nodeIn.data > curr.data) {
            if(curr.right == null) {
                curr.right = nodeIn;
            }
            else {
                insertR(nodeIn, curr.right);
            }
        }
        else {
            System.out.println("Data " + nodeIn.data + " already in the tree");
        }

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
    public int size(){
        return size(root);
    }
    public int size(Node n){
        if(n == null) {
            return 0;
        }
        else {
            return size(n.left) + size(n.right) + 1;
        }
    }
    public void delete(int value) {
        deleteRec(root, value);
    }
    public Node deleteRec (Node root, int data) {
        if (root == null) {
            return root;
        }
        if (data < root.data) {
            root.left = deleteRec(root.left, data);
        }
        else if(data > root.data) {
            root.right = deleteRec(root.right, data);
        }
        else {
            if(root.left == null) {
                return root.right;
            }
            else if(root.right == null) {
                return root.left;
            }
            root.data = min(root.right);
            root.right = deleteRec(root.right, root.data);
        }
        return root;
    }
    public int min(Node root) {
        int min = root.data;
        while(root.left != null) {
            min = root.left.data;
            root = root.left;
        }
        return min;
    }
    private class Node
    {
        public int data;
        public Node left;
        public Node right;

        public Node(int s)
        {
            this.data = s;
            left = null;
            right = null;
        }
    }
    public static void main(String[] args) {
        BST bst = new BST();
        bst.insert(30);
        bst.insert(25);
        bst.insert(35);
        bst.insert(32);
        bst.insert(33);
        bst.insert(40);
        bst.insert(36);
        bst.insert(22);
        bst.insert(23);





        bst.printInOrder();
        System.out.print("- In Order");
        System.out.println("");
        bst.printPreOrder(bst.root);
        System.out.print("- Pre Order");
        System.out.println("");
        bst.printPostorder(bst.root);
        System.out.print("- Post Order");
        bst.insert(15);
        bst.delete(35);
        System.out.println(" ");
        bst.printInOrder();
        System.out.print("- Insert 15 and Remove 35");




    }
}