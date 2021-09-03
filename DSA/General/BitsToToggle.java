package DSA.General;
import java.util.*;
public class BitsToToggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");int one = sc.nextInt();
        System.out.print("enter another number : ");int two = sc.nextInt();
        int ans = one ^ two,c = 0;
        while(ans > 0)
        {
            c++;
            ans &= (ans-1);
        }
        System.out.print("number of bits to toggle are : " + c);
    }
}
