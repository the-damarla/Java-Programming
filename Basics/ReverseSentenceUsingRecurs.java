package Basics;
import java.util.*;
public class ReverseSentenceUsingRecurs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence : ");String s = sc.nextLine();
        System.out.print("Reversed sentence is ---> " + Reverse(s));
    }

    private static String Reverse(String s) {
        if(s.isEmpty())return s;
        return Reverse(s.substring(1)) + s.charAt(0);
    }
}
