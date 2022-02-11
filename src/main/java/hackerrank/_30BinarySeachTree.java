package hackerrank;


import java.util.*;

class Node__ {
    Node__ left,right;
    int data;
    Node__(int data){
        this.data=data;
        left=right=null;
    }
}

public class _30BinarySeachTree {

    private static void getAll(Node__ root) {
        LinkedList<Node__> fila = new LinkedList();
        fila.add(root);
        while(fila.peek() != null) {
            Node__ topFila = fila.remove();
            System.out.print(topFila.data);
            if(topFila.left != null) {
                fila.add(topFila.left);
            }
            if(topFila.right != null) {
                fila.add(topFila.right);
            }
            if(fila.peek() != null) {
                System.out.print(" ");
            }
        }
    }


    public static int getHeight(Node__ root){
        if (root  == null) return -1;
        int lefth = getHeight(root.left);
        int righth = getHeight(root.right);

        if (lefth > righth) {
            return lefth + 1;
        } else {
            return righth + 1;
        }
    }

    static int total = 0;
    public static int getSum(Node__ root){
        if (root  == null) return 0;
        getSum(root.left);
        getSum(root.right);
        total += root.data;
        return total ;
    }



    public static int getSumDiferente(Node__ root){
        int left =0, right  = 0;
        if (root  == null) return 0;
        left += getSumDiferente(root.left);
        right += getSumDiferente(root.right);
        return root.data + left + right;
    }


    public static Node__ insert(Node__ root, int data){
        if(root==null){
            return new Node__(data);
        }
        else{
            Node__ cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node__ root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        int height=getHeight(root);
        System.out.println("");
        System.out.println("height" +height);
        int sum=getSum(root);
        System.out.println("SUM="+sum);
        int sumDiferente=getSumDiferente(root);
        System.out.println("sumDiferente="+sumDiferente);

        getAll(root);

    }

}