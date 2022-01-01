package DSA.LinkedLists;
import java.util.*;

/*
 Given data : 1->2->3->4->5->6->7->8->9->NULL
 Output     : 1->9->2->8->3->7->4->6->5->END
*/

class ReArrangeTheList
{
    public static Node reArrangeTheList(Node head)
    {
        Node mid = MiddleElement.middleElement(head);
        Node headSecond = ReverseList.reversingList(mid);
        Node headFirst = head;

        while (headFirst != null && headSecond != null)
        {
            Node temp = headFirst.next;
            headFirst.next = headSecond;
            headFirst = temp;

            temp = headSecond.next;
            headSecond.next = headFirst;
            headSecond = temp;
        }

        if(headFirst != null)headFirst.next = null;

        return  head;
    }
}

public class ReOrderTheList {
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
        DisplayList.displayList(ReArrangeTheList.reArrangeTheList(head));
    }
}
