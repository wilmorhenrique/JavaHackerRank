package hackerrank;
import java.util.*;

    class Node_ {
        int data;
        Node_ next;
        Node_(int d) {
            data = d;
            next = null;
        }
    }

    public class JavaLinkedList {

        public static  Node_ insert(Node_ head,int data) {
            if (head == null) {
                head = new Node_(data);
                return head;
            } else {
                head.next = insert(head.next, data);
            }
            return head;
        }

        public static void display(Node_ head) {
            Node_ start = head;
            while(start != null) {
                System.out.print(start.data + " ");
                start = start.next;
            }
        }

        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            Node_ head = null;
            int N = sc.nextInt();

            while(N-- > 0) {
                int ele = sc.nextInt();
                head = insert(head,ele);
            }
            display(head);
            sc.close();
        }
    }

