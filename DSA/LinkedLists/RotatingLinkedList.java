package DSA.LinkedLists;
import java.util.*;

class RotateList
{
    public static Node RotateLeft(Node head, int val)
    {
        Node temp = head;
        while(temp.next != null)temp = temp.next;
        temp.next = head;
        temp = head;
        for(int i=1;i<val;i++)temp = temp.next;
        head = temp.next;
        temp.next = null;
        return head;
    }

    public static Node RotateRight(Node head, int val)
    {
        Node temp = head;
        int c = 1;
        while (temp.next != null)
        {
            temp = temp.next;
            c++;
        }
        temp.next = head;
        temp = head;
        for(int i=1;i<c-val;i++)temp = temp.next;
        head = temp.next;
        temp.next = null;
        return head;
    }
}

public class RotatingLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter \'0\' to stop giving input");
        Node head = null;
        while (true)
        {
            System.out.print("Enter data : ");int x = sc.nextInt();
            if(x == 0)break;
            head = Insertions.insertNode(x,head);
        }
        System.out.print("Given List : ");DisplayList.displayList(head);
        System.out.print("Enter Num of rotations : ");int x = sc.nextInt();
        System.out.print("After Right Rotating : ");DisplayList.displayList(RotateList.RotateRight(head, x));
        System.out.print("After Left Rotating : ");DisplayList.displayList(RotateList.RotateLeft(head,x));
    }
}
