package hackerrank;

import java.io.*;
import java.util.*;
class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }

}

public class _30LinkedListDeletion {
    public static Node removeDuplicates(Node head) {
        // este é p algoritimo
        /*
         verifica se o no atual é null ou se o proximo tb não é
         se o valor atual é igual ao valor proximo
            então o valor do proximo pode ser removido e substituido pelo seu proximo
            chama recursivamente passando o ATUAL novamente pois a lista pode ser 1 -> 2 -> 2 -> 2 -> 3 -> 4
        se não forem iguais
            chama recursivamente passando o PROXIMO

         */
        if (head == null || head.next == null ) return head;

        if (head.data == head.next.data) {
            head.next = head.next.next ;
            removeDuplicates(head);
        } else {
            removeDuplicates(head.next);
        }
        return head;
    }

    public static  Node insert(Node head,int data)
    {
        Node p=new Node(data);
        if(head==null)
            head=p;
        else if(head.next==null)
            head.next=p;
        else
        {
            Node start=head;
            while(start.next!=null)
                start=start.next;
            start.next=p;

        }
        return head;
    }
    public static void display(Node head)
    {
        Node start=head;
        while(start!=null)
        {
            System.out.print(start.data+" ");
            start=start.next;
        }
    }

    static Node head=null;

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int ele=sc.nextInt();
            head=insert(head,ele);
        }
        head=removeDuplicates(head);
        display(head);

    }
}