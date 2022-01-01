package DSA.LinkedLists;
import java.util.*;

public class PalindromeCheck {
    private static boolean isPalindrome(Node head)
    {
        Node mid = MiddleElement.middleElement(head);
        Node headSecond = ReverseList.reversingList(mid);
        Node rereverseHead = headSecond;

        while(head != null && headSecond != null)
        {
            if(head.value != headSecond.value)break;
            head = head.next;
            headSecond = headSecond.next;
        }
        ReverseList.reversingList(rereverseHead);
        return head == null || headSecond == null;
    }

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
        if(isPalindrome(head))
            System.out.println("Given List is a palindrome");
        else
            System.out.println("Not a palindromic type List");
    }
}
