package DSA.LinkedLists;

import java.sql.SQLOutput;

interface printOperation
{
    void PrintOperation(int x);
}

class LinkedList
{
    private Node head;
    private int size;

    private class Node
    {
        private int value;
        private Node next;

        public Node(int value)
        {
            this.value = value;
        }

        public Node(int value, Node next)
        {
            this.value = value;
            this.next = next;
        }
    }


    public LinkedList()
    {
        this.size = 0;
    }

    public Node getNodeAtPos(int ind)
    {
        if(ind == 0)return head;
        Node temp = head;
        for(int i=0;i<ind;i++)temp = temp.next;
        return temp;
    }

    public void insertFirst(int val)
    {
        Node node = new Node(val);
        node.next = head;
        head = node;
        size += 1;
    }

    public void insertAtPos(int val, int pos)
    {
        if(pos == 0)
        {
            insertFirst(val);
            return;
        }
        if(pos > size)
        {
            printOperation pp = (int x) -> System.out.println(x + " is greater than size of LL");
            pp.PrintOperation(pos);
            return;
        }
        Node temp = getNodeAtPos(pos-1);
        temp.next = new Node(val, temp.next);
        size += 1;
    }

    public void insertAtLast(int val)
    {
        if(head == null)
        {
            insertFirst(val);
            return;
        }
        else
        {
            Node temp = getNodeAtPos(size-1);
            temp.next = new Node(val);
        }
        size += 1;
    }

    public int deleteAtFirst()
    {
        if(size == 0)head = null;
        int val = head.value;
        head = head.next;
        size--;
        return val;
    }

    public int deleteAtPos(int pos)
    {
        if(pos == 0) return deleteAtFirst();
        if(pos == size-1) return deleteAtEnd();
        Node prev = getNodeAtPos(pos-1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        size--;
        return val;
    }

    public int deleteAtEnd()
    {
        Node prev = getNodeAtPos(size-1);
        int val = prev.value;
        prev.next = null;
        size--;
        return val;
    }

    public void displayList()
    {
        printOperation pp = (int x) -> System.out.print(x + "->");
        int k = 0;
        while(k < size)
        {
            pp.PrintOperation(getNodeAtPos(k).value);
            k++;
        }
        System.out.println("END");
    }

    public int getSize()
    {
        return size;
    }

}

public class IntroToLinkedLists {
    public static void main(String[] args) {
        printOperation pp = (int size) -> System.out.println("Size of Linked List is : " + size);
        printOperation dp = (int del) -> System.out.println("Element that got deleted is : " + del);
        LinkedList LL = new LinkedList();
        LL.insertFirst(33);
        LL.insertFirst(45);
        LL.insertFirst(65);
        LL.insertAtLast(75);
        LL.insertAtLast(80);
        LL.displayList();
        pp.PrintOperation(LL.getSize());
        LL.insertAtPos(25,7);
        LL.displayList();
        pp.PrintOperation(LL.getSize());
        LL.insertAtPos(25,5);
        LL.displayList();
        pp.PrintOperation(LL.getSize());
        LL.insertAtPos(15,0);
        LL.displayList();
        pp.PrintOperation(LL.getSize());
        LL.insertAtPos(75,1);
        LL.displayList();
        pp.PrintOperation(LL.getSize());
        dp.PrintOperation(LL.deleteAtFirst());
        LL.displayList();
        pp.PrintOperation(LL.getSize());
        dp.PrintOperation(LL.deleteAtEnd());
        LL.displayList();
        pp.PrintOperation(LL.getSize());
        dp.PrintOperation(LL.deleteAtPos(2));
        LL.displayList();
        pp.PrintOperation(LL.getSize());
        dp.PrintOperation(LL.deleteAtPos(4));
        LL.displayList();
        pp.PrintOperation(LL.getSize());
    }
}
