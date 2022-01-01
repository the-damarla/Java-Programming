package DSA.LinkedLists;
import java.util.*;

class PlusOne
{
    public static Node plusOne(Node head)
    {
        head = ReverseList.reversingList(head);
        Node temp = head;
        while (temp != null)
        {
            if(temp.value < 9)
            {
                temp.value += 1;
                head = ReverseList.reversingList(head);
                return head;
            }
            else
            {
                temp.value = 0;
                if(temp.next == null)
                {
                    temp.next = new Node(1);
                    head = ReverseList.reversingList(head);
                    return head;
                }
            }
            temp = temp.next;
        }
        return head;
    }
}

public class PlusOneToTheList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter \'0\' to stop giving input");
        Node head = null;
        while (true)
        {
            System.out.print("Enter data : ");int x = sc.nextInt();
            if(x == 0)break;
            head = Insertions.insertNode(x,head);
        }
        System.out.print("List is :   ");DisplayList.displayList(head);
        head = PlusOne.plusOne(head);
        System.out.print("After +1 to the list :   ");DisplayList.displayList(head);
    }
}
