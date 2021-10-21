package Basics;
import java.util.*;
public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number : ");String s = sc.nextLine();
        int j = s.length()-1,i = 0;
        while(i < j)
        {
            if(s.charAt(i) != s.charAt(j))
            {
                System.out.print("Given number is not a palindrome");
                return;
            }
            i++;j--;
        }
        System.out.print("Given number is a palindrome");
    }
}
