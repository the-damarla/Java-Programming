package DSA.LinkedLists;
import java.util.*;

class DetectionAndRemovalOfLoop
{
    public static boolean detectionByDestroyingList(Node head)
    {
        Node temp = head;
        while(temp != null)
        {
            if(temp.value == Integer.MAX_VALUE)
                return true;
            temp.value = Integer.MAX_VALUE;
            temp = temp.next;
        }
        return false;
    }

    public static void detectionByEfficientMethod(Node head)
    {
        if(head == null || head.next == null)
        {
            System.out.println("NO LOOP detected");
            return;
        }
        Node slow,fast;
        slow = fast = head;
        slow = slow.next;
        fast = fast.next.next;
        boolean flag = false;
        while (fast != null && fast.next != null)
        {
            if(fast.next == slow.next)
            {
                flag = true;
                System.out.println(fast.value + " " + slow.value);
                break;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        if(flag)
        {
            System.out.println("Loop Detected");
            int cycleLength = 0;
            while (slow.next == fast.next)
            {
                cycleLength++;
                slow = slow.next;
            }
            System.out.println("Length of cycle is : " + cycleLength);
            slow = head;
            while (true) {
                if (slow.next == fast.next)break;
                slow = slow.next;
                fast = fast.next;
            }
            fast.next = null;
            System.out.println("Loop found at : " + slow.value);
        }
        else
        {
            System.out.println("NO LOOP DETECTED");
        }
        DisplayList.displayList(head);
    }
}

public class DetectingAndRemovalOfLoopInLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        System.out.println("Enter \'0\' to stop giving input");
        while (true)
        {
            System.out.print("Enter data : ");int x = sc.nextInt();
            if(x == 0)break;
            head = Insertions.insertNode(x,head);
        }
        System.out.print("Given list : ");DisplayList.displayList(head);
        Node temp = head;
        for(int i=0;i<3;i++)temp = temp.next;
        temp.next = head.next.next;
//        System.out.println(DetectionAndRemovalOfLoop.detectionByDestroyingList(head));
        DetectionAndRemovalOfLoop.detectionByEfficientMethod(head);
    }
}
