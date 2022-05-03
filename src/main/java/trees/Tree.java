package trees;

import java.util.Random;
import java.util.stream.IntStream;

public class Tree {
    private Node_ root = null;

    public static void main(String[] args) {
        Tree tree = new Tree();
//        int[] vals = getRandomIntArray(10, 1000);
        int[] vals = {50,40,60,15,80,65,25,2,9};

        for (int i = 0; i < vals.length; i++) {
            tree.root = tree.add(tree.root, vals[i]);
        }
        
        tree.print(tree.root);
    }

    private void print(Node_ root) {
        if (root == null ) {
            System.out.println("the Tree is empty!");
            return;
        }
        System.out.println(root.value);
        printTree(root);
    }

    private void printTree(Node_ root) {
        if (root.left != null) {
            System.out.println("/");
            print(root.left);
        }
        if (root.right != null) {
            System.out.println("\\");
            print(root.right);
        }
    }

    public Node_ add(Node_ root, int key) {
        if (root == null) {
            root = new Node_(key);
            return root;
        }
        if (root.value > key ) {
            root.left = add(root.left, key);
        } else {
            root.right = add(root.right, key);
        }
        return root;
    }
    
    


    public static int[] getRandomIntArray(int elements, int max) {
        return IntStream.generate(() -> new Random().nextInt(max)).limit(elements).toArray();
    }

}
