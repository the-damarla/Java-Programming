package DSA.LinkedLists;
import java.util.*;

        /*
        1->2->3->4->5->6->7->8->9->END
        Enter 'K' to reverse List as Groups : 2
            K Groups : 2->1->4->3->6->5->8->7->9->END
  Alternate K Groups : 2->1->3->4->6->5->7->8->9->END
        */


class ReverseKGroups
{
    public static Node reverseAlternateKGroups(Node head, int k)
    {
        Node current = head;
        Node prev = null;

        while (current != null)
        {
            Node last = prev;
            Node newEnd = current;

            Node next = current.next;

            for(int i=0;i<k && current != null;i++)
            {
                current.next = prev;
                prev = current;
                current = next;
                if (next != null)next = next.next;
            }

            if(last != null)
                last.next = prev;
            else
                head = prev;

            newEnd.next = current;

            for(int i=0;i<k&&current != null;i++)
            {
                prev = current;
                current = current.next;
            }
        }
        return head;
    }

    public static Node reverseKGroups(Node head, int k)
    {
        Node current = head;
        Node prev = null;

        while (true)
        {
            Node last = prev;
            Node newEnd = current;

            Node next = current.next;

            for(int i=0;i<k && current != null;i++)
            {
                current.next = prev;
                prev = current;
                current = next;
                if (next != null)next = next.next;
            }

            if(last != null)
                last.next = prev;
            else
                head = prev;

            newEnd.next = current;

            if(current == null)break;

            prev = newEnd;
        }
        return head;
    }
}

public class ReversingListInKGroups {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter \'0\' to stop giving input");
        Node head = null;
        while (true)
        {
            System.out.print("Enter data : ");int x = sc.nextInt();
            if(x == 0)break;
            head = Insertions.insertNode(x, head);
        }
        DisplayList.displayList(head);
        System.out.print("Enter \'K\' to reverse List as Groups : ");int k = sc.nextInt();
        DisplayList.displayList(ReverseKGroups.reverseKGroups(head, k));
        DisplayList.displayList(ReverseKGroups.reverseAlternateKGroups(head, k));
    }
}
