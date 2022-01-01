package DSA.LinkedLists;

import java.util.*;

class Node
{
    int value;
    Node next;

    Node(int value)
    {
        this.value = value;
    }

    Node(int value, Node next)
    {
        this.value = value;
        this.next = next;
    }
}

class Insertions
{
    public static Node insertNodeRecursive(int val,Node head)
    {
        Node temp = head;
        if(temp == null)
        {
            temp = new Node(val);
            return temp;
        }
        head.next = insertNodeRecursive(val, head.next);
        return head;
    }

    public static Node insertNode(int val, Node head)
    {
        if(head == null)
        {
            head = new Node(val);
        }
        else
        {
            Node temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = new Node(val);
        }
        return head;
    }
}

class DisplayList
{
    public static void displayList(Node head)
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }
}

class ReverseList
{
    public static Node reversingList(Node head)
    {
        Node prev = null,next,temp = head;
        while (temp != null)
        {
            next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        return prev;
    }
}

public class ReversingTheList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to stop giving inputs");
        System.out.println("Enter Elements : ");int x = sc.nextInt();
        Node head = new Node(x);
        while (true)
        {
            System.out.print("Enter data : ");x = sc.nextInt();
            if(x == 1)break;
//            head = Insertions.insertNode(x,head);
//            System.out.println("HEAD value ---> " + head.value);
            head = Insertions.insertNodeRecursive(x,head);
        }
        DisplayList.displayList(head);
        head = ReverseList.reversingList(head);
        DisplayList.displayList(head);
    }
}
