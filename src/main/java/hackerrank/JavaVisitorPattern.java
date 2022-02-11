package hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
 *
 */
enum Color {
    RED, GREEN
}

/*
 *
 */
abstract class Tree {

    private int 	value;
    private Color 	color;
    private int 	depth;

    public Tree(int value, Color color, int depth) {
        this.value = value;
        this.color = color;
        this.depth = depth;
    }

    public int getValue() {
        return value;
    }

    public Color getColor() {
        return color;
    }

    public int getDepth() {
        return depth;
    }

    public abstract void accept(TreeVis visitor);
}

/*
 *
 */
class TreeNode extends Tree {

    private ArrayList<Tree> children = new ArrayList<>();

    public TreeNode(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitNode(this);

        for (Tree child : children) {
            child.accept(visitor);
        }
    }

    public void addChild(Tree child) {
        children.add(child);
    }

    // ???? ????
    public String toString() {
        return "" + this.getValue() + " " + this.getColor() + " " + this.getDepth();
    }
}

/*
 *
 */
class TreeLeaf extends Tree {

    public TreeLeaf(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitLeaf(this);
    }

    // ???? ????
    public String toString() {
        return "" + this.getValue() + " " + this.getColor() + " " + this.getDepth();
    }
}

/*
 *
 */
abstract class TreeVis {
    public abstract int  getResult();
    public abstract void visitNode(TreeNode node);
    public abstract void visitLeaf(TreeLeaf leaf);

}

// **** **** **** **** **** **** **** **** **** ****

/*
 * Implementation
 */
class SumInLeavesVisitor extends TreeVis {

    private int sumOfLeaf = 0;

    // **** get result ****
    public int getResult() {
        return sumOfLeaf;
    }

    // **** visit node ****
    public void visitNode(TreeNode node) {

        // ???? ????
        System.out.println("node: " + node.toString());
    }

    // ***** visit leaf ****
    public void visitLeaf(TreeLeaf leaf) {

        // ???? ????
        System.out.println("leaf: " + leaf.toString());

        sumOfLeaf += leaf.getValue();
    }
}

/*
 * Implementation
 */
class ProductOfRedNodesVisitor extends TreeVis {

    private long 		product = 1;
    private final int 	mod 	= 1000000007;

    // **** get result ****
    public int getResult() {
        return (int)product;
    }

    // **** visit node ****
    public void visitNode(TreeNode node) {
        if (node.getColor() == Color.RED) {

            // ???? ????
            System.out.println("node: " + node.toString());

            // **** ****
            product = (product * node.getValue()) % mod;
        }
    }

    // **** visit leaf ****
    public void visitLeaf(TreeLeaf leaf) {
        if (leaf.getColor() == Color.RED) {

            // ???? ????
            System.out.println("leaf: " + leaf.toString());

            // **** ****
            product = (product * leaf.getValue()) % mod;
        }
    }
}

/*
 * Implementation
 */
class FancyVisitor extends TreeVis {

    private int evenDepthNodeSum 	= 0;
    private int greenLeavesSum 		= 0;

    // **** get result ****
    public int getResult() {
        return Math.abs(evenDepthNodeSum - greenLeavesSum);
    }

    // **** visit node ****
    public void visitNode(TreeNode node) {
        if (node.getDepth() % 2 == 0) {

            // ???? ????
            System.out.println("node: " + node.toString());

            // **** ****
            evenDepthNodeSum += node.getValue();
        }
    }

    // ***** visit leaf ****
    public void visitLeaf(TreeLeaf leaf) {
        if (leaf.getColor().equals(Color.GREEN)) {

            // ???? ????
            System.out.println("leaf: " + leaf.toString());

            // **** ****
            greenLeavesSum += leaf.getValue();
        }
    }
}

/*
 *
 */
public class JavaVisitorPattern {

    // **** ****
    private static int[] values = null;
    private static Color[] colors = null;
    private static HashMap<Integer, Set<Integer>> edges = new HashMap<>();

    /*
     *
     */
    private static void connectEdge(Tree parent, Integer connectedNode) {

        // **** ****
        if (edges.get(connectedNode).size() == 0) {
            ((TreeNode) parent).addChild(
                    new TreeLeaf(values[connectedNode - 1], colors[connectedNode - 1], parent.getDepth() + 1));
            return;
        }

        // **** ****
        Tree node = new TreeNode(values[connectedNode - 1], colors[connectedNode - 1], parent.getDepth() + 1);
        ((TreeNode)parent).addChild(node);

        // **** ****
        for (Integer child : edges.get(connectedNode)) {
//	    	System.out.println("child: " + child);

            edges.get(child).remove(connectedNode);
            connectEdge(node, child);
        }
    }

    /*
     * read the tree from STDIN and return its root as a return value of this function
     */
    public static Tree solve() {

        // **** ****
        Tree root = null;

        // **** ****
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // **** ****
        int n;
        try {

            // **** read number of notes ****
            n = Integer.parseInt(br.readLine());
//	    	System.out.println("n: " + n);

            // **** allocate values and colors ****
            values = new int[n];
            colors = new Color[n];

            // **** read in the values (as strings) ****
            String[] valueStrings = br.readLine().split(" ");
//	    	System.out.println("valueStrings: " + Arrays.toString(valueStrings));

            // **** read in the colors (as strings) ****
            String[] colorStrings = br.readLine().split(" ");
//	    	System.out.println("colorStrings: " + Arrays.toString(colorStrings));

            // **** assign the values and colors ****
            for (int i = 0; i < n; i++) {
                values[i] = Integer.parseInt(valueStrings[i]);
                colors[i] = colorStrings[i].equals("0") ? Color.RED : Color.GREEN;
            }
//	    	System.out.println("values: " + Arrays.toString(values));
//	    	System.out.println("colors: " + Arrays.toString(colors));

            // **** check if a single node has been specified ****
            if (n == 1)
                return new TreeLeaf(values[0], colors[0], 0);

            // **** populate the tree edges ****
            for (int i = 0; i < (n - 1); i++) {

                // **** read the next edge ****
                String[] edgeStrings = br.readLine().split(" ");
                int u = Integer.parseInt(edgeStrings[0]);
                int v = Integer.parseInt(edgeStrings[1]);
//	    		System.out.println("u: " + u + " v: " + v);

                // **** ****
                if (!edges.containsKey(u))
                    edges.put(u, new HashSet<Integer>());

                // **** ****
                if (!edges.containsKey(v))
                    edges.put(v, new HashSet<Integer>());

                // **** ****
                edges.get(u).add(v);
                edges.get(v).add(u);
            }
//	    	System.out.println("edges: " + edges.toString());

            // **** close the buffer reader ****
            br.close();

        } catch (NumberFormatException | IOException e) {
            e.printStackTrace();
        }

        // **** instantiate the tree root ****
        root = new TreeNode(values[0], colors[0], 0);

        // **** connect the nodes ****
        for (Integer connectedNode : edges.get(1)) {

            // **** ****
            edges.get(connectedNode).remove(1);
//			System.out.println("connectedNode: " + connectedNode.toString());

            // **** ****
            connectEdge(root, connectedNode);
        }

        // **** ****
        return root;
    }

    /*
     * Test scaffolding
     */
    public static void main(String[] args) {

        Tree root = solve();

        SumInLeavesVisitor vis1 		= new SumInLeavesVisitor();
        ProductOfRedNodesVisitor vis2 	= new ProductOfRedNodesVisitor();
        FancyVisitor vis3 				= new FancyVisitor();

        root.accept(vis1);
        System.out.println();

        root.accept(vis2);
        System.out.println();

        root.accept(vis3);
        System.out.println();

        int res1 = vis1.getResult();
        int res2 = vis2.getResult();
        int res3 = vis3.getResult();

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
    }
}

