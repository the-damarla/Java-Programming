package DSA.LinkedLists;
import java.util.*;

class MergeLists
{
    public static Node mergeLists(Node one, Node two)
    {
        Node ansHead = null;
        while (one != null && two != null)
        {
            if(one.value < two.value)
            {
                ansHead = Insertions.insertNode(one.value, ansHead);
                one = one.next;
            }
            else
            {
                ansHead = Insertions.insertNode(two.value, ansHead);
                two = two.next;
            }
        }

        while (one != null)
        {
            ansHead = Insertions.insertNode(one.value, ansHead);
            one = one.next;
        }

        while(two != null)
        {
            ansHead = Insertions.insertNode(two.value, ansHead);
            two = two.next;
        }
        return ansHead;
    }
}

public class MergeSortedLinkedList {
    public static void main(String[] args) {
        Node one = null;
        Node two = null;
        System.out.println("Enter 1st Linked List elements and enter \'0\' to break giving input");
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            System.out.print("Enter data : ");int x = sc.nextInt();
            if(x == 0)break;
            one = Insertions.insertNode(x, one);
        }
        System.out.println("Enter 2nd Linked List elements and \'0\' to break giving input");
        while (true)
        {
            System.out.print("Enter data : ");int x = sc.nextInt();
            if(x == 0)break;
            two = Insertions.insertNode(x, two);
        }
        System.out.println("GIVEN LINKED LISTS ARE : ");DisplayList.displayList(one);DisplayList.displayList(two);
        System.out.println("AFTER MERGING THEM");DisplayList.displayList(MergeLists.mergeLists(one,two));
    }
}
