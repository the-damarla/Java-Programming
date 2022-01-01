package DSA.LinkedLists;
import java.util.*;

class MiddleElement
{
    public static Node middleElement(Node head)
    {
        Node slow,fast;
        slow = fast = head;
        while (fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}

public class MiddleOfLinkedList {
    public static void main(String[] args) {
        Node head = null;
        System.out.println("Enter \'0\' to break giving input");
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            System.out.print("Enter data : ");int x = sc.nextInt();
            if(x == 0)break;
            head = Insertions.insertNode(x, head);
        }
        System.out.println("Given List  : ");DisplayList.displayList(head);
        System.out.println("Middle Element of the Linked List is : " + MiddleElement.middleElement(head).value);
    }
}
