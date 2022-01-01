package DSA.LinkedLists;
import java.util.*;

class WaveAndZigZag
{
    public static Node waveForm(Node head)
    {
        Node temp = head;
        boolean flag = true;
        while (temp != null)
        {
            if(flag)
            {
                if(temp.next != null && (temp.value > temp.next.value))
                {
                    int swapVar = temp.value;
                    temp.value = temp.next.value;
                    temp.next.value = swapVar;
                }
            }
            else
            {
                if(temp.next != null && (temp.value < temp.next.value))
                {
                    int swapVar = temp.value;
                    temp.value = temp.next.value;
                    temp.next.value = swapVar;
                }
            }
            flag = !flag;
            temp = temp.next;
        }
        return head;
    }

    public static Node zigZagForm(Node head)
    {
        Node temp = head;
        while (temp.next != null)
        {
            int swapVar = temp.value;
            temp.value = temp.next.value;
            temp.next.value = swapVar;
            temp = temp.next.next;
        }
        return head;
    }
}

public class WaveFormOfLinkedList {
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
        System.out.print("Given list : ");DisplayList.displayList(head);
        System.out.print("After making to Wave Form : ");DisplayList.displayList(WaveAndZigZag.waveForm(head));
        System.out.print("After Zig Zag Form : ");DisplayList.displayList(WaveAndZigZag.zigZagForm(head));
    }
}
