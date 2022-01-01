package DSA.LinkedLists;

import java.util.*;

class SortList
{
    public static Node sortList(Node head)
    {
        Node temp  = head;
        while (temp != null)
        {
            Node sortingTemp = head;
            while (sortingTemp != null)
            {
                if(sortingTemp.next != null && sortingTemp.value > sortingTemp.next.value)
                {
                    int storeVal = sortingTemp.value;
                    sortingTemp.value = sortingTemp.next.value;
                    sortingTemp.next.value = storeVal;
                }
                else
                    sortingTemp = sortingTemp.next;
            }
            temp = temp.next;
        }
        return head;
    }
}

public class SortingLinkedList {
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
        System.out.print("Given list is : ");DisplayList.displayList(head);
        System.out.print("List After Sorting : ");DisplayList.displayList(SortList.sortList(head));
    }
}
