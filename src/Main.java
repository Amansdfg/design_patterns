class RedBlackTree<Key extends Comparable<Key>, Value> {

    private static final boolean RED = true;
    private static final boolean BLACK = false;

    private class Node {

        Key key;
        Value val;
        Node left, right;
        boolean color;

        Node(Key key, Value val, boolean color) {

            this.key = key;
            this.val = val;
            this.color = color;
        }
    }

    private Node root;

    public Value get(Key key) {

        Node x = root;
        while (x != null) {
            int cmp = key.compareTo(x.key);
            if (cmp < 0) x = x.left;
            else if (cmp > 0) x = x.right;
            else return x.val;
        }
        return null;
    }

    public void put(Key key, Value val) {

        root = put(root, key, val);
        root.color = BLACK; // root must always be black
    }

    private Node put(Node h, Key key, Value val) {

        if (h == null) return new Node(key, val, RED); // insert red node

        int cmp = key.compareTo(h.key);
        if (cmp < 0) h.left = put(h.left, key, val);
        else if (cmp > 0) h.right = put(h.right, key, val);
        else h.val = val;

        // Balance the tree
        if (isRed(h.right) && !isRed(h.left)) h = rotateLeft(h);       // lean left
        if (isRed(h.left) && isRed(h.left.left)) h = rotateRight(h);  // balance 4-node
        if (isRed(h.left) && isRed(h.right)) flipColors(h);           // split 4-node

        return h;
    }

    private boolean isRed(Node x) {

        if (x == null) return false;
        return x.color == RED;
    }

    private Node rotateLeft(Node h) {

        Node x = h.right;
        h.right = x.left;
        x.left = h;
        x.color = h.color;
        h.color = RED;
        return x;
    }

    private Node rotateRight(Node h) {

        Node x = h.left;
        h.left = x.right;
        x.right = h;
        x.color = h.color;
        h.color = RED;
        return x;
    }

    private void flipColors(Node h) {

        h.color = RED;
        h.left.color = BLACK;
        h.right.color = BLACK;
    }

    public void displayTree() {
        System.out.println("Red-Black Tree (In-Order):");
        displayTree(root, "", true);
    }

    private void displayTree(Node node, String prefix, boolean isLeft) {
        if (node == null) {
            System.out.println(prefix + (isLeft ? "├── " : "└── ") + "null");
            return;
        }

        System.out.println(prefix + (isLeft ? "├── " : "└── ") +
            node.key + " (" + (node.color == RED ? "RED" : "BLACK") + ")");
        displayTree(node.left, prefix + (isLeft ? "│   " : "    "), true);
        displayTree(node.right, prefix + (isLeft ? "│   " : "    "), false);
    }


    public static void main(String[] args) {
        RedBlackTree<Integer, String> rbt = new RedBlackTree<>();
        rbt.put(5, "A");
        rbt.put(3, "B");
        rbt.put(7, "C");
        rbt.put(1, "D");
        rbt.put(4, "E");
        rbt.put(6, "F");
        rbt.put(8, "G");

        rbt.displayTree();
    }
}