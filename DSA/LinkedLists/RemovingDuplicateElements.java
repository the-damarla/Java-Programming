package DSA.LinkedLists;

import java.util.*;

class RemoveDuplicateElements
{
    public static Node removeDuplicates(Node head)
    {
        Node temp = head;
        while(temp != null)
        {
            if(temp.next != null && (temp.value == temp.next.value)) temp.next = temp.next.next;
            else temp = temp.next;
        }
        return head;
    }
}

public class RemovingDuplicateElements {
    public static void main(String[] args) {
        System.out.println("Enter \'0\' to stop giving input");
        Scanner sc = new Scanner(System.in);
        Node head = null;
        while (true)
        {
            System.out.print("Enter data : ");int x = sc.nextInt();
            if(x == 0)break;
            head = Insertions.insertNode(x,head);
        }
        System.out.print("Given list : ");DisplayList.displayList(head);
        System.out.print("After Sorting : ");DisplayList.displayList(SortList.sortList(head));
        System.out.print("After removing Duplicates : ");DisplayList.displayList(RemoveDuplicateElements.removeDuplicates(head));
    }
}
