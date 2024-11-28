//public class RedBlackTree {
//
//    private static final boolean RED = true;
//    private static final boolean BLACK = false;
//
//    private class Node {
//        int data;
//        Node left, right, parent;
//        boolean color;
//
//        Node(int data) {
//            this.data = data;
//            this.color = RED;
//        }
//    }
//
//    private Node root;
//
//    // Public method to insert a value into the Red-Black Tree
//    public void insert(int data) {
//        Node newNode = new Node(data);
//        root = bstInsert(root, newNode);
//        fixViolation(newNode);
//    }
//
//    // Binary Search Tree insertion
//    private Node bstInsert(Node root, Node node) {
//        if (root == null) {
//            return node;
//        }
//
//        if (node.data < root.data) {
//            root.left = bstInsert(root.left, node);
//            root.left.parent = root;
//        } else if (node.data > root.data) {
//            root.right = bstInsert(root.right, node);
//            root.right.parent = root;
//        }
//
//        return root;
//    }
//
//    // Fix violations after insertion to maintain Red-Black Tree properties
//    private void fixViolation(Node node) {
//        Node parent, grandparent;
//
//        while (node != root && node.color == RED && node.parent.color == RED) {
//            parent = node.parent;
//            grandparent = parent.parent;
//
//            // Parent is the left child of the grandparent
//            if (parent == grandparent.left) {
//                Node uncle = grandparent.right;
//
//                // Case 1: Uncle is RED
//                if (uncle != null && uncle.color == RED) {
//                    grandparent.color = RED;
//                    parent.color = BLACK;
//                    uncle.color = BLACK;
//                    node = grandparent;
//                } else {
//                    // Case 2: Node is the right child
//                    if (node == parent.right) {
//                        leftRotate(parent);
//                        node = parent;
//                        parent = node.parent;
//                    }
//
//                    // Case 3: Node is the left child
//                    rightRotate(grandparent);
//                    boolean temp = parent.color;
//                    parent.color = grandparent.color;
//                    grandparent.color = temp;
//                    node = parent;
//                }
//            } else { // Parent is the right child of the grandparent
//                Node uncle = grandparent.left;
//
//                // Case 1: Uncle is RED
//                if (uncle != null && uncle.color == RED) {
//                    grandparent.color = RED;
//                    parent.color = BLACK;
//                    uncle.color = BLACK;
//                    node = grandparent;
//                } else {
//                    // Case 2: Node is the left child
//                    if (node == parent.left) {
//                        rightRotate(parent);
//                        node = parent;
//                        parent = node.parent;
//                    }
//
//                    // Case 3: Node is the right child
//                    leftRotate(grandparent);
//                    boolean temp = parent.color;
//                    parent.color = grandparent.color;
//                    grandparent.color = temp;
//                    node = parent;
//                }
//            }
//        }
//
//        root.color = BLACK; // Ensure the root is always black
//    }
//
//    // Left rotate
//    private void leftRotate(Node node) {
//        Node rightChild = node.right;
//        node.right = rightChild.left;
//
//        if (rightChild.left != null) {
//            rightChild.left.parent = node;
//        }
//
//        rightChild.parent = node.parent;
//
//        if (node.parent == null) {
//            root = rightChild;
//        } else if (node == node.parent.left) {
//            node.parent.left = rightChild;
//        } else {
//            node.parent.right = rightChild;
//        }
//
//        rightChild.left = node;
//        node.parent = rightChild;
//    }
//
//    // Right rotate
//    private void rightRotate(Node node) {
//        Node leftChild = node.left;
//        node.left = leftChild.right;
//
//        if (leftChild.right != null) {
//            leftChild.right.parent = node;
//        }
//
//        leftChild.parent = node.parent;
//
//        if (node.parent == null) {
//            root = leftChild;
//        } else if (node == node.parent.left) {
//            node.parent.left = leftChild;
//        } else {
//            node.parent.right = leftChild;
//        }
//
//        leftChild.right = node;
//        node.parent = leftChild;
//    }
//
//    // In-order traversal for printing the tree
//    public void inOrder() {
//        inOrderHelper(root);
//    }
//
//    private void inOrderHelper(Node node) {
//        if (node != null) {
//            inOrderHelper(node.left);
//            System.out.print(node.data + " ");
//            inOrderHelper(node.right);
//        }
//    }
//
//    // Main method to test the Red-Black Tree
//    public static void main(String[] args) {
//        RedBlackTree rbt = new RedBlackTree();
//        int[] numbers = {1, 2, 3, 4, 1, 21, 21, 21, 212};
//
//        for (int num : numbers) {
//            rbt.insert(num);
//        }
//
//        System.out.println("In-order traversal of the Red-Black Tree:");
//        rbt.inOrder();
//    }
//}
