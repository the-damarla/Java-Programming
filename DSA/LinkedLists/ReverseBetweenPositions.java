package DSA.LinkedLists;
import java.util.*;

class ReversingBetweenPositions
{
    public static Node reversingBetweenPositions(Node head, int left, int right)
    {
        if(left == right)return head;
        Node cur = head;
        Node prev = null;

        for(int i=0;cur != null && i<left-1;i++)
        {
            prev = cur;
            cur = cur.next;
        }
        Node last = prev;
        Node newEnd = cur;
        Node next = cur.next;

        for(int i=0;cur != null && i<right-left;i++)
        {
            cur.next = prev;
            prev = cur;
            cur = next;
            if(next != null)next = next.next;
        }

        if(last != null) last.next = prev;
        else head = prev;

        newEnd.next = cur;

        return head;
    }
}

public class ReverseBetweenPositions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        System.out.println("Enter \'0\' to stop giving input");
        while(true)
        {
            System.out.print("Enter data : ");int x = sc.nextInt();
            if(x == 0)break;
            head = Insertions.insertNode(x, head);
        }
        System.out.print("Enter position one : ");int one = sc.nextInt();
        System.out.print("Enter position two : ");int two = sc.nextInt();
        System.out.print("Given List : ");DisplayList.displayList(head);
        System.out.print("After Reversing Between Given positions : ");DisplayList.displayList(ReversingBetweenPositions.reversingBetweenPositions(head, one, two));
    }
}
